
public class Customer 
{
String firstName;
String lastName;
String password;
String country; // could be an int if we have a preselected list of countries as storing an int should take less space in database
String birthdate;
String phone;
String email;

public Customer(String firstName, String lastName, String password, String country, String birthdate, String phone,
		String email) 
	{
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.password = password;
	this.country = country;
	this.birthdate = birthdate;
	this.phone = phone;
	this.email = email;
	}

public String getFirstName() 
	{
	return firstName;
	}

public void setFirstName(String firstName) 
	{
	this.firstName = firstName;
	}

public String getLastName() 
	{
	return lastName;
	}

public void setLastName(String lastName) 
	{
	this.lastName = lastName;
	}

public String getPassword() 
	{
	return password;
	}

public void setPassword(String password) 
	{
	this.password = password;
	}

public String getCountry() 
	{
	return country;
	}

public void setCountry(String country) 
	{
	this.country = country;
	}

public String getBirthdate() 
	{
	return birthdate;
	}

public void setBirthdate(String birthdate) 
	{
	this.birthdate = birthdate;
	}

public String getPhone() 
	{
	return phone;
	}

public void setPhone(String phone) 
	{
	this.phone = phone;
	}

public String getEmail() 
	{
	return email;
	}

public void setEmail(String email) 
	{
	this.email = email;
	}

}


