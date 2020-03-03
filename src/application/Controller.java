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

}
