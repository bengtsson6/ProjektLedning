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
		
		
		
		
		
		Pycelle frame = new Pycelle(new Controller(staffRegister));
		frame.setVisible(true);
		
		
	}

}
