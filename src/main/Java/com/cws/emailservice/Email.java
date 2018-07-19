package com.cws.emailservice;

import java.util.Date;

/**
 * 
 * Email bean.
 * 
 * @author Kevin
 *
 */
public class Email {
	private String fullName;
	private Date occassionDate;
	private String fromEmail;
	private String toEmail;
	private String ccEmail;
	private String emailSubject;
	private String emailMessage;
	private String userIpAddress;
	private String phone;
	


	/**
	 * @return the userIpAddress
	 */
	public String getUserIpAddress() {
		return userIpAddress;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @param userIpAddress the userIpAddress to set
	 */
	public void setUserIpAddress(String userIpAddress) {
		this.userIpAddress = userIpAddress;
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * @return the occassionDate
	 */
	public Date getOccassionDate() {
		return occassionDate;
	}
	/**
	 * @param occassionDate the occassionDate to set
	 */
	public void setOccassionDate(Date occassionDate) {
		this.occassionDate = occassionDate;
	}
	/**
	 * @return the fromEmail
	 */
	public String getFromEmail() {
		return fromEmail;
	}
	/**
	 * @param fromEmail the fromEmail to set
	 */
	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}
	/**
	 * @return the toEmail
	 */
	public String getToEmail() {
		return toEmail;
	}
	/**
	 * @param toEmail the toEmail to set
	 */
	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}
	/**
	 * @return the ccEmail
	 */
	public String getCcEmail() {
		return ccEmail;
	}
	/**
	 * @param ccEmail the ccEmail to set
	 */
	public void setCcEmail(String ccEmail) {
		this.ccEmail = ccEmail;
	}
	/**
	 * @return the emailSubject
	 */
	public String getEmailSubject() {
		return emailSubject;
	}
	/**
	 * @param emailSubject the emailSubject to set
	 */
	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}
	/**
	 * @return the emailMessage
	 */
	public String getEmailMessage() {
		return emailMessage;
	}
	/**
	 * @param emailMessage the emailMessage to set
	 */
	public void setEmailMessage(String emailMessage) {
		this.emailMessage = emailMessage;
	}
	
	
	
}
