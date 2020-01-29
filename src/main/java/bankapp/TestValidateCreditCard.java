package bankapp;

import creditcard.CreditCard;
import creditcard.CreditCardService;

public class TestValidateCreditCard {

	public static void main(String[] args) {

		try {
			testValidCardNo();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void testInvalidCardNo() throws Exception {
		CreditCard card = new CreditCard();		
		card.setCreditCardNo(123L);
		boolean result = CreditCardService.validateCreditCard(card);
		System.out.println("Valid:" + result);
	}
	
	public static void testValidCardNo() throws Exception {
		CreditCard card = new CreditCard();		
		card.setCreditCardNo(123L);
		boolean result = CreditCardService.validateCreditCard(card);
		System.out.println("Valid:" + result);
	}

}
