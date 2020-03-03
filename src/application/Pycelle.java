package application;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class Pycelle {

	private JFrame frame;
	private JTextField txtSocialNumber;
	private JTextField txtName;
	private JTextField txtPhoneNumber;
	private JTextField txtEmail;
	private JTextField txtTitle;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pycelle window = new Pycelle();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pycelle() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel startPanel = new JPanel();
		frame.getContentPane().add(startPanel, BorderLayout.CENTER);
		startPanel.setLayout(null);
		
		JButton btn_startPanel_CRDStaff = new JButton("Manage Staff");
		btn_startPanel_CRDStaff.setToolTipText("Click this to add new staff, show staff and delete staff in the application");
		btn_startPanel_CRDStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_startPanel_CRDStaff.setBounds(34, 114, 148, 23);
		startPanel.add(btn_startPanel_CRDStaff);
		
		JButton btn_startPanel_SecLevel = new JButton("Manage Security Levels");
		btn_startPanel_SecLevel.setToolTipText("Click this to manage current security levels for staff");
		btn_startPanel_SecLevel.setBounds(235, 114, 148, 23);
		startPanel.add(btn_startPanel_SecLevel);
		
		JPanel staffPanel = new JPanel();
		frame.getContentPane().add(staffPanel, BorderLayout.CENTER);
		staffPanel.setLayout(null);
		
		txtSocialNumber = new JTextField();
		txtSocialNumber.setText("Social number");
		txtSocialNumber.setBounds(63, 57, 96, 20);
		staffPanel.add(txtSocialNumber);
		txtSocialNumber.setColumns(10);
		
		txtName = new JTextField();
		txtName.setText("Name");
		txtName.setBounds(63, 88, 96, 20);
		staffPanel.add(txtName);
		txtName.setColumns(10);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setText("Phone number");
		txtPhoneNumber.setBounds(63, 119, 96, 20);
		staffPanel.add(txtPhoneNumber);
		txtPhoneNumber.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setText("E-mail");
		txtEmail.setBounds(63, 150, 96, 20);
		staffPanel.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtTitle = new JTextField();
		txtTitle.setText("Title");
		txtTitle.setBounds(63, 181, 96, 20);
		staffPanel.add(txtTitle);
		txtTitle.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(63, 212, 96, 20);
		staffPanel.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Security level 1");
		rdbtnNewRadioButton.setBounds(198, 92, 111, 23);
		staffPanel.add(rdbtnNewRadioButton);
	}
}
