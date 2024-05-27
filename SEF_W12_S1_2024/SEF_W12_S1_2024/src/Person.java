
public class Person {
	
	private String name;
	private PhoneNumber officePhoneNumber;
	private PhoneNumber homePhoneNumber;

	// can create constructor or set methods to allow
	// the user of the Person class to initialize the
	// name and office phone number of the person.
	
	public String getName() {
		return name;
	}
	
	public String getOfficePhoneNumber() {
		return officePhoneNumber.getFullPhoneNumber();
	}

	public String getHomePhoneNumber() {
		return homePhoneNumber.getFullPhoneNumber();
	}
	
}
