package application;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class Pycelle extends JFrame{
	private Controller controller;
	private JFrame frame;
	private JTextField txtField_staffPanel_socialNumber;
	private JTextField txtfield_staffPanel_name;
	private JTextField txtField_staffPanel_phoneNumber;
	private JTextField txtField_staffPanel_eMail;
	private JTable JTable_staffPanel;
	private JPanel staffPanel;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pycelle window = new Pycelle(new Controller());
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pycelle(Controller controller) {
		setTitle("Start");
		this.controller = controller;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1083, 686);
		staffPanel = new JPanel();
		staffPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(staffPanel);
		staffPanel.setLayout(null);
		
		txtField_staffPanel_socialNumber = new JTextField();
		txtField_staffPanel_socialNumber.setBounds(103, 34, 96, 20);
		staffPanel.add(txtField_staffPanel_socialNumber);
		txtField_staffPanel_socialNumber.setColumns(10);
		
		txtfield_staffPanel_name = new JTextField();
		txtfield_staffPanel_name.setBounds(103, 65, 96, 20);
		staffPanel.add(txtfield_staffPanel_name);
		txtfield_staffPanel_name.setColumns(10);
		
		txtField_staffPanel_phoneNumber = new JTextField();
		txtField_staffPanel_phoneNumber.setBounds(103, 129, 96, 20);
		staffPanel.add(txtField_staffPanel_phoneNumber);
		txtField_staffPanel_phoneNumber.setColumns(10);
		
		txtField_staffPanel_eMail = new JTextField();
		txtField_staffPanel_eMail.setBounds(103, 160, 96, 20);
		staffPanel.add(txtField_staffPanel_eMail);
		txtField_staffPanel_eMail.setColumns(10);
		
		JButton btn_staffPanel_addStaff = new JButton("Add staff");
		btn_staffPanel_addStaff.setBounds(63, 212, 89, 23);
		staffPanel.add(btn_staffPanel_addStaff);
		
		JButton btn_staffPanel_delete = new JButton("Delete");
		btn_staffPanel_delete.setBounds(435, 212, 89, 23);
		staffPanel.add(btn_staffPanel_delete);
		
		JButton btn_staffPanel_update = new JButton("Update");
		btn_staffPanel_update.setBounds(336, 212, 89, 23);
		staffPanel.add(btn_staffPanel_update);
		
		JComboBox comboBox_startPanel_chooseTitle = new JComboBox();
		comboBox_startPanel_chooseTitle.setModel(new DefaultComboBoxModel(new String[] {"Teacher", "Professor", "Administator", "Janitor", "Receptionist", "Cleaning staff", "Guest"}));
		comboBox_startPanel_chooseTitle.setEditable(true);
		comboBox_startPanel_chooseTitle.setBounds(103, 96, 96, 22);
		staffPanel.add(comboBox_startPanel_chooseTitle);
		
		JButton btn_staffPanel_read = new JButton("Read?");
		btn_staffPanel_read.setBounds(162, 212, 89, 23);
		staffPanel.add(btn_staffPanel_read);
		
		JRadioButton rdbtn_staffPanel_secLvl2 = new JRadioButton("Public spaces");
		rdbtn_staffPanel_secLvl2.setBounds(236, 74, 129, 23);
		staffPanel.add(rdbtn_staffPanel_secLvl2);
		
		JRadioButton rdbtn_staffPanel_secLvl3 = new JRadioButton("Service rooms");
		rdbtn_staffPanel_secLvl3.setToolTipText("Server room, cleaning, kitchen");
		rdbtn_staffPanel_secLvl3.setBounds(236, 94, 232, 23);
		staffPanel.add(rdbtn_staffPanel_secLvl3);
		
		JRadioButton rdbtn_staffPanel_secLvl4 = new JRadioButton("Classrooms");
		rdbtn_staffPanel_secLvl4.setBounds(236, 114, 129, 23);
		staffPanel.add(rdbtn_staffPanel_secLvl4);
		
		JRadioButton rdbtn_staffPanel_secLvl5 = new JRadioButton("Offices");
		rdbtn_staffPanel_secLvl5.setBounds(236, 134, 129, 23);
		staffPanel.add(rdbtn_staffPanel_secLvl5);
		
		JRadioButton rdbtn_staffPanel_secLvl1 = new JRadioButton("Entrance");
		rdbtn_staffPanel_secLvl1.setBounds(236, 54, 129, 23);
		staffPanel.add(rdbtn_staffPanel_secLvl1);
		
		JLabel lbl_staffPanel_obligatorySN = new JLabel("*");
		lbl_staffPanel_obligatorySN.setBounds(92, 37, 11, 14);
		staffPanel.add(lbl_staffPanel_obligatorySN);
		
		JLabel lbl_staffPanel_obligatoryN = new JLabel("*");
		lbl_staffPanel_obligatoryN.setBounds(92, 68, 11, 14);
		staffPanel.add(lbl_staffPanel_obligatoryN);
		
		JLabel lbl_staffPanel_obligatoryT = new JLabel("*");
		lbl_staffPanel_obligatoryT.setBounds(92, 100, 11, 14);
		staffPanel.add(lbl_staffPanel_obligatoryT);
		
		JLabel lbl_staffPanel_chooseSecurityLevel = new JLabel("Person should have access to:");
		lbl_staffPanel_chooseSecurityLevel.setBounds(236, 37, 155, 14);
		staffPanel.add(lbl_staffPanel_chooseSecurityLevel);
		
		JLabel lbl_staffPanel_obligatorySL = new JLabel("*");
		lbl_staffPanel_obligatorySL.setBounds(381, 37, 11, 14);
		staffPanel.add(lbl_staffPanel_obligatorySL);
		
		JScrollPane scrollPane_staffPanel_txtA = new JScrollPane();
		scrollPane_staffPanel_txtA.setBounds(10, 276, 247, 69);
		staffPanel.add(scrollPane_staffPanel_txtA);
		
		JTextArea textArea_staffPanel = new JTextArea();
		scrollPane_staffPanel_txtA.setViewportView(textArea_staffPanel);
		
		JScrollPane scrollPane_staffPanel_Jtbl = new JScrollPane();
		scrollPane_staffPanel_Jtbl.setBounds(267, 276, 282, 69);
		staffPanel.add(scrollPane_staffPanel_Jtbl);
		
		JTable_staffPanel = new JTable();
		JTable_staffPanel.setModel(new DefaultTableModel(

			new Object[][] {
			},
			new String[] {
				"Name"
			}
		));

		scrollPane_staffPanel_Jtbl.setViewportView(JTable_staffPanel);
		
		JLabel lblSocialNumber = new JLabel("Social number:");
		lblSocialNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSocialNumber.setBounds(0, 40, 92, 14);
		staffPanel.add(lblSocialNumber);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setBounds(0, 71, 92, 14);
		staffPanel.add(lblName);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTitle.setBounds(0, 103, 92, 14);
		staffPanel.add(lblTitle);
		
		JLabel lblPhoneNumber = new JLabel("Phone number:");
		lblPhoneNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhoneNumber.setBounds(0, 135, 92, 14);
		staffPanel.add(lblPhoneNumber);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(0, 166, 92, 14);
		staffPanel.add(lblEmail);
	}
}
