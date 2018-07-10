package com.cws.datamodel;

import java.math.BigInteger;
import java.util.Date;

/**
 * Model for DonationRequestEmail table.
 * 
 * @author Kevin
 *
 */
public class DonationRequestEmailModel {

	private BigInteger id;
	private Date createdDate;
	private String fullName;
	private Date occassionDate;
	private String fromEmail;
	private String toEmail;
	private String emailSubject;
	private String emailMessage;
	private String userIpAddress;
	/**
	 * @return the id
	 */
	public BigInteger getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(BigInteger id) {
		this.id = id;
	}
	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
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
	/**
	 * @return the userIpAddress
	 */
	public String getUserIpAddress() {
		return userIpAddress;
	}
	/**
	 * @param userIpAddress the userIpAddress to set
	 */
	public void setUserIpAddress(String userIpAddress) {
		this.userIpAddress = userIpAddress;
	}
	
}
