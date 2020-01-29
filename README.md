# Credit Card API

## Download JAR
* https://github.com/csys-fresher-batch-2019/bankapp-megala/releases/download/v1.1/bank-1.0.0-SNAPSHOT.jar

### API 1: Validate Credit Card 
```java

import creditcard.CreditCard;
import creditcard.CreditCardService;
....

CreditCard card = new CreditCard();
card.setCreditCardNo(1234567890123456L);
card.setExpiryDate(LocalDate.parse("2020-12-31"));
card.setCVV(123);


try {
	boolean result = CreditCardService.validateCreditCard(card);
	System.out.pr
} catch (Exception e) {
	e.printStackTrace();
}
```

### API 2: Pay Amount to Credit Card (Online)
```java

import creditcard.CreditCard;
import creditcard.CreditCardService;
....

CreditCard card = new CreditCard();
card.setCreditCardNo(1234567890123456L);
card.setExpiryDate(LocalDate.parse("2020-12-31"));
card.setCVV(123);
int amount = 1000;
String comments = "GowthamRaj - SuperMarket Bill";
try {
	boolean result = CreditCardService.payAmount(card , amount, comments );
	System.out.println(result);
} catch (Exception e) {
	e.printStackTrace();
}
```
### API 3: Pay Amount using Credit Card (Billing Counter)
* Using Credit Card PIN
```java

import creditcard.CreditCard;
import creditcard.CreditCardService;
....

CreditCard card = new CreditCard();
card.setCreditCardNo(1234567890123456L);
card.setPin(1234);
int amount = 1000;
String comments = "GowthamRaj - SuperMarket Bill";
try {
	boolean result = CreditCardService.payAmount(card , amount, comments );
	System.out.println(result);
} catch (Exception e) {
	e.printStackTrace();
}
```
