
public class PhoneNumber {
	
	private String areaCode;
	private String phoneNumber;
	
	public PhoneNumber(String areaCode, String phoneNumber) {
		this.areaCode = areaCode;
		this.phoneNumber = phoneNumber;
	}

	public String getAreaCode() {
		return areaCode;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getFullPhoneNumber() {
		return ("(" + areaCode + ") " + phoneNumber);
	}
	
}
