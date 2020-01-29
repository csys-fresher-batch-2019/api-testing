package bankapp;

import java.time.LocalDate;

import creditcard.CreditCard;
import creditcard.CreditCardService;

public class TestRegisterCreditCard {

	public static void main(String[] args) {

		CreditCard card = new CreditCard();
		card.setAccNo(100);
		card.setCreditCardNo(1234567890123456L);
		card.setExpiryDate(LocalDate.parse("2020-12-31"));
		
		
		try {
			CreditCardService.registerCreditCard(card);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
