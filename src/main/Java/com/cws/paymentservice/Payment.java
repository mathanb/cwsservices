package com.cws.paymentservice;

public class Payment {

	private String amountToPay;
	private String description;
	private String nameOnCard;
	private String cardNumber;
	private String expiryMonth;
	private String expiryYear;
	private String cvc;
	private String email;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String postCode;
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}	

	/**
	 * @return the postCode
	 */
	public String getPostCode() {
		return postCode;
	}
	/**
	 * @param postCode the postCode to set
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	private String country;
	private String UserIpAddress;
	/**
	 * @return the amountToPay
	 */
	public String getAmountToPay() {
		return amountToPay;
	}
	/**
	 * @param amountToPay the amountToPay to set
	 */
	public void setAmountToPay(String amountToPay) {
		this.amountToPay = amountToPay;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the nameOnCard
	 */
	public String getNameOnCard() {
		return nameOnCard;
	}
	/**
	 * @param nameOnCard the nameOnCard to set
	 */
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}
	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	/**
	 * @return the expiryMonth
	 */
	public String getExpiryMonth() {
		return expiryMonth;
	}
	/**
	 * @param expiryMonth the expiryMonth to set
	 */
	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	/**
	 * @return the expiryYear
	 */
	public String getExpiryYear() {
		return expiryYear;
	}
	/**
	 * @param expiryYear the expiryYear to set
	 */
	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}
	/**
	 * @return the cvc
	 */
	public String getCvc() {
		return cvc;
	}
	/**
	 * @param cvc the cvc to set
	 */
	public void setCvc(String cvc) {
		this.cvc = cvc;
	}
	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}
	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}
	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the userIpAddress
	 */
	public String getUserIpAddress() {
		return UserIpAddress;
	}
	/**
	 * @param userIpAddress the userIpAddress to set
	 */
	public void setUserIpAddress(String userIpAddress) {
		UserIpAddress = userIpAddress;
	}

}
