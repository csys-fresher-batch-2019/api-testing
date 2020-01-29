# Credit Card API

## Download JAR
* url

### API 1: Register Card 
```java
CreditCard card = new CreditCard();
		card.setAccNo(100);
		card.setCreditCardNo(1234567890123456L);
		card.setExpiryDate(LocalDate.parse("2020-12-31"));
		
		
		try {
			CreditCardService.registerCreditCard(card);
		} catch (Exception e) {
			e.printStackTrace();
		}
```
