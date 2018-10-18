
public class Account 
{
Customer someone;
String streetAddress;
String city;
String postalCode;
// String Country; this is a duplicate of information from class Customer, not required again unless the general idea is that customer can 
// select a different country than implicated by the address?
String cardHolderName;
int cardType; // 1=Mastercard, 2=Visa, 3=Discover
String cardNumber;
String expiry;

public Account(Customer someone, String streetAddress, String city, String postalCode, String cardHolderName,
		int cardType, String cardNumber, String expiry) 
	{
	super(); // automatically generated. I have no clue as to what this does here?
	this.someone = someone;
	this.streetAddress = streetAddress;
	this.city = city;
	this.postalCode = postalCode;
	this.cardHolderName = cardHolderName;
	this.cardType = cardType;
	this.cardNumber = cardNumber;
	this.expiry = expiry;
	}

public Customer getSomeone() 
	{
	return someone;
	}

public void setSomeone(Customer someone) 
	{
	this.someone = someone;
	}

public String getStreetAddress() 
	{
	return streetAddress;
	}

public void setStreetAddress(String streetAddress) 
	{
	this.streetAddress = streetAddress;
	}

public String getCity() 
	{
	return city;
	}

public void setCity(String city) 
	{
	this.city = city;
	}

public String getPostalCode() 
	{
	return postalCode;
	}

public void setPostalCode(String postalCode) 
	{
	this.postalCode = postalCode;
	}

public String getCardHolderName() 
	{
	return cardHolderName;
	}

public void setCardHolderName(String cardHolderName) 
	{
	this.cardHolderName = cardHolderName;
	}

public int getCardType() 
	{
	return cardType;
	}

public void setCardType(int cardType) 
	{
	this.cardType = cardType;
	}

public String getCardNumber() 
	{
	return cardNumber;
	}

public void setCardNumber(String cardNumber) 
	{
	this.cardNumber = cardNumber;
	}

public String getExpiry() 
	{
	return expiry;
	}

public void setExpiry(String expiry) 
	{
	this.expiry = expiry;
	}
	

}
