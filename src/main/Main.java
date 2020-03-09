package main;

import java.awt.EventQueue;

import javax.swing.JFrame;

import application.*;


public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		StaffRegister staffRegister = new StaffRegister();
		
		Staff s1 = new Staff("Magnus", "904210-3245", "074002341", "Magnus@lund.se", "Janitor"); 
		Staff s2 = new Staff("Bo", "901032-4444", "079234111", "Bo@lund.se", "Teacher");
		staffRegister.addStaff(s1);
		staffRegister.addStaff(s2);
		
		SecurityLevel a1 = new SecurityLevel("Entrance");
		s1.addSecurityLevel(a1);
		
		Pycelle frame = new Pycelle(new Controller(staffRegister));
		frame.setVisible(true);
		
		
	}

}
