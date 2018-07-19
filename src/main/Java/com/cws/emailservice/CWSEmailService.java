package com.cws.emailservice;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.json.simple.JSONObject;

import com.cws.datamodel.DonationRequestEmailModel;
import com.cws.datamodel.SubscriptionModel;
import com.cws.util.CommonUtils;
import com.cws.util.HibernateUtil;

/**
 * Restful Service to send emails.
 *  
 * Jersey framework is used for this webservice.
 * 
 * @author Kevin
 *
 */
@Path("/cwsemailservice")
public class CWSEmailService {
	
	private static final Logger logger = LogManager.getLogger(CWSEmailService.class);
	
	private final String SUCCESS_MSG = "Email has been sent successfully";
	private final String FAILED_MSG = "Email failed";
	
	@Context
	private HttpServletRequest httpRequest;
	
	@GET
	@Path("/sendmail/{fullName}/{occassionDate}/{fromEmail}/{toEmail}/{emailSubject}/{emailMessage}")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject sendMail(@PathParam("fullName") String fullName, @PathParam("occassionDate") String occassionDate, @PathParam("fromEmail") String fromEmail, @PathParam("toEmail") String toEmail, 
			@PathParam("emailSubject") String emailSubject, @PathParam("emailMessage") String emailMessage) {
		
		return sendMailPost(fullName, occassionDate, fromEmail, toEmail, emailSubject, emailMessage);
	}
	
	@POST
	@Path("/sendmail/{fullName}/{occassionDate}/{fromEmail}/{toEmail}/{emailSubject}/{emailMessage}")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject sendMailPost(@PathParam("fullName") String fullName, @PathParam("occassionDate") String occassionDate, @PathParam("fromEmail") String fromEmail, @PathParam("toEmail") String toEmail, 
			@PathParam("emailSubject") String emailSubject, @PathParam("emailMessage") String emailMessage) {
		
		
		Email email = new Email();
		email.setFullName(fullName);
		email.setOccassionDate(CommonUtils.convertStringToDate(occassionDate));
		email.setFromEmail(fromEmail);
		email.setToEmail(toEmail);
		email.setEmailSubject(emailSubject);
		email.setEmailMessage(emailMessage);
		email.setUserIpAddress(httpRequest.getRemoteAddr());
		
		final JSONObject obj = new JSONObject();
		try {
			SendEmail.sendEmailTLS(email);
			saveSendEmail(email);
			obj.put("result", SUCCESS_MSG);
		} catch (Exception e) {
			logger.error("Error in sendMailPost, error is: " + e.getMessage());
			obj.put("result", FAILED_MSG);
		}
		return obj;
	}

	/**
	 * To persist email data into db.
	 * 
	 * @param email
	 */
	private void saveSendEmail(final Email email) {
			Session session = null;
			
			try {
				// set values to the data model.
				DonationRequestEmailModel dre = new DonationRequestEmailModel();
				java.sql.Timestamp createdDate = new java.sql.Timestamp(System.currentTimeMillis());
				dre.setCreatedDate(createdDate);
				dre.setFullName(email.getFullName());
				dre.setOccassionDate(email.getOccassionDate());
				dre.setFromEmail(email.getFromEmail());
				dre.setUserIpAddress(email.getUserIpAddress());
				
				session = HibernateUtil.getSessionFactory().getCurrentSession();
				
				session.beginTransaction();
				// Save session
				session.save(dre);
				session.getTransaction().commit();

			} catch (HibernateException e) {
				logger.error("Error saving email into DB, error is: " + e.getMessage());

			} catch (Exception e) {
				logger.error("Error saving email into DB, error is: " + e.getMessage());
			} 		
	}

	

	@GET
	@Path("/subscribemail/{subscriptionEmail}")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject subscribeMail(@PathParam("subscriptionEmail") String subscriptionEmail) {
		
		return subscribeMailPost(subscriptionEmail);
	}
	
	@POST
	@Path("/subscribemail/{subscriptionEmail}")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject subscribeMailPost(@PathParam("subscriptionEmail") String subscriptionEmail) {
		
		JSONObject obj = new JSONObject();
		try {
			saveSubscriptionEmail(subscriptionEmail);
			obj.put("result", "Subscrition is successful");
		} catch (Exception e) {
			obj.put("result", "Subscrition failed. Please try again later.");
		}
		
		return obj;
	}

	/**
	 * To persist email data into db.
	 * 
	 * @param email
	 */
	private void saveSubscriptionEmail(final String subscriptionEmail) {
			Session session = null;
			
			try {
				// set values to the data model.
				SubscriptionModel subs = new SubscriptionModel();
				java.sql.Timestamp createdDate = new java.sql.Timestamp(System.currentTimeMillis());
				subs.setCreatedDate(createdDate);
				subs.setSubscriptionEmail(subscriptionEmail);
				
				session = HibernateUtil.getSessionFactory().getCurrentSession();
				
				session.beginTransaction();
				// Save session
				session.save(subs);
				session.getTransaction().commit();

			} catch (HibernateException e) {
				logger.error("Error saving subscription email into DB, error is: " + e.getMessage());
				throw e;

			} catch (Exception e) {
				logger.error("Error saving subscription email into DB, error is: " + e.getMessage());
				throw e;
			} 		
	}
	
	
	@GET
	@Path("/contactemail/{name}/{phone}/{email}/{message}")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject contactUsMail(@PathParam("name") String name, @PathParam("phone") String phone, @PathParam("email") String email, @PathParam("message") String message) {
		
		return contactUsPost(name, phone, email, message);
	}
	
	@POST
	@Path("/contactemail/{name}/{phone}/{email}/{message}")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject contactUsPost(@PathParam("name") String name, @PathParam("phone") String phone, @PathParam("email") String toemail, @PathParam("message") String message)  {
		
		Email email = new Email();
		email.setFullName(name);
		email.setPhone(phone);
		email.setToEmail(toemail);
		
		email.setEmailMessage(message);
		email.setUserIpAddress(httpRequest.getRemoteAddr());
		
		final JSONObject obj = new JSONObject();
		try {
			SendEmail.sendEmailTLS(email);
			saveSendEmail(email);
			obj.put("result", SUCCESS_MSG);
		} catch (Exception e) {
			logger.error("Error in sendMailPost, error is: " + e.getMessage());
			obj.put("result", FAILED_MSG);
		}
		
		return obj;
	}

	
	
	
	/**
	 * @return the logger
	 */
	public static Logger getLogger() {
		return logger;
	}
	
	
}
	