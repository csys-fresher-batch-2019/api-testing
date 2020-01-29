# Credit Card API

## Download JAR
* https://github.com/csys-fresher-batch-2019/bankapp-megala/releases/download/v1.1/bank-1.0.0-SNAPSHOT.jar

### API 1: Register Card 
```java

import creditcard.CreditCard;
import creditcard.CreditCardService;
....

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
