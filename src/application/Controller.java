package application;
import java.util.ArrayList;

public class Controller {
	
	private StaffRegister staffRegister = new StaffRegister();
	
	public Controller() {
		this.staffRegister = new StaffRegister();
		
	}
	
	public Controller(StaffRegister staffRegister) {
		this.staffRegister = staffRegister;
	}
	
	public Staff addStaff(String name, String socialNumber, String phoneNumber, String email, String title) {
		Staff staff = new Staff(name, socialNumber, phoneNumber, email, title);
		staffRegister.addStaff(staff);
		return staff;
	}
	public Staff removeStaff(String socialNumber) {
		Staff tmp = staffRegister.findStaff(socialNumber);
		staffRegister.removeStaff(socialNumber);
		return tmp;
	}
	public Staff updateStaff(String socialNumber, String name, String phoneNumber, String email, String title) {
		staffRegister.findStaff(socialNumber).setName(name);
		staffRegister.findStaff(socialNumber).setPhoneNumber(phoneNumber);
		staffRegister.findStaff(socialNumber).setEmail(email);
		staffRegister.findStaff(socialNumber).setTitle(title);
		return staffRegister.findStaff(socialNumber);
	}
	public String getStaffSecurityLevel(String socialNumber) {
		String levels = new String();
		for (SecurityLevel level : staffRegister.findStaff(socialNumber).getSecurityLevel()) {
			levels += level.getLevel() + ", ";
		}
		return levels;
	}
	public ArrayList<Staff> getAllStaff(){
		return this.staffRegister.getStaffRegister();
	}

}
