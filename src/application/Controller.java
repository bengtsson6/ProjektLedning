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
	

}
