package com.cws.datamodel;

import java.math.BigInteger;
import java.util.Date;

public class SubscriptionModel {

	private BigInteger id;
	private Date createdDate;
	private String subscriptionEmail;
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
	 * @return the subscriptionEmail
	 */
	public String getSubscriptionEmail() {
		return subscriptionEmail;
	}
	/**
	 * @param subscriptionEmail the subscriptionEmail to set
	 */
	public void setSubscriptionEmail(String subscriptionEmail) {
		this.subscriptionEmail = subscriptionEmail;
	}
	
	
}

