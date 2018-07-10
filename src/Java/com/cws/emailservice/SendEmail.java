package com.cws.emailservice;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Helper class to send emails.
 * 
 * 
 * @author Kevin
 *
 */
public class SendEmail {

	private static final Logger logger = LogManager.getLogger(SendEmail.class);
	
	private static final String SMTP_USER_NAME = "kivilabs2018@gmail.com";
	private static final String SMTP_PASSWORD = "puppies@2018";
	
	private static final boolean SMTP_AUTH = true;
	private static final boolean SMTP_STARTTLS = true;
	private static final String SMTP_SSL_TRUST = "smtp.gmail.com";
	private static final String SMTP_HOST = "smtp.gmail.com";
	private static final String SMTP_PORT_TLS = "587";
	private static final String SMTP_PORT_SSL = "465";
	
	/**
	 * Send email using TLS (Transport Layer Security).
	 * 
	 * @param email
	 */
	public static void sendEmailTLS(final Email email) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", SMTP_AUTH);
		props.put("mail.smtp.starttls.enable", SMTP_STARTTLS);
		props.put("mail.smtp.ssl.trust", SMTP_SSL_TRUST);
		props.put("mail.smtp.host", SMTP_HOST);
		props.put("mail.smtp.port", SMTP_PORT_TLS);

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(SMTP_USER_NAME, SMTP_PASSWORD);
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(SMTP_USER_NAME));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email.getToEmail()));
			message.setSubject(email.getEmailSubject());
			message.setText(email.getEmailMessage());

			Transport.send(message);

		} catch (Exception e) {
			logger.error("Error sending Email, error is: " + e.getMessage());
			throw new RuntimeException(e);
		}
	}

	/**
	 * Send email using SSL.
	 * 
	 * @param email
	 */
	public static void sendEmailSSL(final Email email) {
		Properties props = new Properties();
		props.put("mail.smtp.host", SMTP_HOST);
		props.put("mail.smtp.socketFactory.port", SMTP_PORT_SSL);
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", SMTP_AUTH);
		props.put("mail.smtp.port", SMTP_PORT_SSL);

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(SMTP_USER_NAME, SMTP_PASSWORD);
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(email.getFromEmail()));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email.getToEmail()));
			message.setSubject(email.getEmailSubject());
			message.setText(email.getEmailMessage());

			Transport.send(message);

		} catch (MessagingException e) {
			logger.error("Error sending Email, error is: " + e.getMessage());
			throw new RuntimeException(e);
		}
	}

}
