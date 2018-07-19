package com.cws.paymentservice;

import java.io.IOException;

import com.google.common.collect.ImmutableMap;

import io.practiceinsight.pinpayments.api.ChargesApi;
import io.practiceinsight.pinpayments.api.impl.ChargesApiImpl;
import io.practiceinsight.pinpayments.pojo.ChargeResponse;
import io.practiceinsight.pinpayments.pojo.ImmutableCard;
import io.practiceinsight.pinpayments.pojo.ImmutableCharge;

/*
 * 
 */
public class SendPayment {

	public void sendPinPayments(final Payment payment) {
		  
		ChargesApi chargesApi = new ChargesApiImpl();
		try {
			final ChargeResponse chargeResponse = chargesApi.create(ImmutableCharge.builder()
			    .email(payment.getEmail())
			    .currency("AUD")
			    .description(payment.getDescription())
			    .amount(new Integer(payment.getAmountToPay()))
			    .ipAddress(payment.getUserIpAddress())
			    .capture(String.valueOf(""))
			    .card(ImmutableCard.builder()
			      .number(payment.getCardNumber())
			      .expiryMonth(payment.getExpiryMonth())
			      .expiryYear(payment.getExpiryYear())
			      .cvc(payment.getCvc())
			      .name(payment.getNameOnCard())
			      .addressLine1(payment.getAddressLine1())
			      .addressLine2(payment.getAddressLine2())
			      .addressCity(payment.getCity())
			      .addressPostcode(payment.getPostCode())
			      .addressState(payment.getState())
			      .addressCountry(payment.getCountry())
			      .build())
			    .metadata(ImmutableMap.of("OrderNumber", "123456", "CustomerName", "Roland Robot"))
			    .build());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
