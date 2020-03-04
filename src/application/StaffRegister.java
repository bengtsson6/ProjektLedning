package application;

import java.util.ArrayList;

public class StaffRegister {
	
	ArrayList<Staff> staffRegister = new ArrayList<Staff>();
	
	
	public void setStaffRegister(ArrayList<Staff> staffRegister) {
		this.staffRegister = staffRegister;
	}
	public ArrayList<Staff> getStaffRegister(){
		return staffRegister;
	}
	public void addStaff(Staff staff) {
		staffRegister.add(staff);
	}
	
	public Staff findStaff(String SocialNumber) {
		for (Staff tmp : staffRegister) {
			if (tmp.getSocialNumber().equals(SocialNumber)) {
				return tmp;
			}
		}
		return null;
	}
	public Staff removeStaff(String SocialNumber) {
		if (this.findStaff(SocialNumber) != null) {
			Staff tmp = new Staff();
			tmp = findStaff(SocialNumber);
			staffRegister.remove(this.findStaff(SocialNumber));
			return tmp;
		}
		return null;
	}
	public SecurityLevel findSecurityLevel(String level){
		for (Staff staff : staffRegister) {
			for (SecurityLevel tmp : staff.getSecurityLevel()) {
				if (tmp.getLevel().equals(level)) {
					return tmp;
				}
			}
		}
		return null;
	}
	
}
