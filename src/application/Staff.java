package application;

import java.util.ArrayList;

public class Staff {
	private String name;
	private String socialNumber;
	private String phoneNumber;
	private String email;
	private String title;
	private ArrayList<SecurityLevel> securityLevel = new ArrayList<SecurityLevel>();
                     
	public Staff(String name, String socialNumber, String phoneNumber, String email, String title) {
		this.name = name;
		this.socialNumber = socialNumber;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSocialNumber() {
		return socialNumber;
	}

	public void setSocialNumber(String socialNumber) {
		this.socialNumber = socialNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArrayList<SecurityLevel> getSecurityLevel() {
		return securityLevel;
	}

	public void setSecurityLevel(ArrayList<SecurityLevel> securityLevel) {
		this.securityLevel = securityLevel;
	}
	
	public void removeSecurityLevel() {
		this.securityLevel.clear();
	}

}
