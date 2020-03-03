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
import javax.swing.JComboBox;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

public class Pycelle {

	private JFrame frame;
	private JTextField txtField_staffPanel_socialNumber;
	private JTextField txtfield_staffPanel_name;
	private JTextField txtField_staffPanel_phoneNumber;
	private JTextField txtField_staffPanel_eMail;
	private JTable JTable_staffPanel;


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
		frame.setBounds(100, 100, 573, 393);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel staffPanel = new JPanel();
		frame.getContentPane().add(staffPanel, "name_1636471965543000");
		staffPanel.setLayout(null);
		
		txtField_staffPanel_socialNumber = new JTextField();
		txtField_staffPanel_socialNumber.setText("Social number");
		txtField_staffPanel_socialNumber.setBounds(63, 34, 96, 20);
		staffPanel.add(txtField_staffPanel_socialNumber);
		txtField_staffPanel_socialNumber.setColumns(10);
		
		txtfield_staffPanel_name = new JTextField();
		txtfield_staffPanel_name.setText("Name");
		txtfield_staffPanel_name.setBounds(63, 65, 96, 20);
		staffPanel.add(txtfield_staffPanel_name);
		txtfield_staffPanel_name.setColumns(10);
		
		txtField_staffPanel_phoneNumber = new JTextField();
		txtField_staffPanel_phoneNumber.setText("Phone number");
		txtField_staffPanel_phoneNumber.setBounds(63, 129, 96, 20);
		staffPanel.add(txtField_staffPanel_phoneNumber);
		txtField_staffPanel_phoneNumber.setColumns(10);
		
		txtField_staffPanel_eMail = new JTextField();
		txtField_staffPanel_eMail.setText("E-mail");
		txtField_staffPanel_eMail.setBounds(63, 160, 96, 20);
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
		comboBox_startPanel_chooseTitle.setBounds(63, 96, 96, 22);
		staffPanel.add(comboBox_startPanel_chooseTitle);
		
		JButton btn_staffPanel_read = new JButton("Read?");
		btn_staffPanel_read.setBounds(162, 212, 89, 23);
		staffPanel.add(btn_staffPanel_read);
		
		JRadioButton rdbtn_staffPanel_secLvl2 = new JRadioButton("Security level 2");
		rdbtn_staffPanel_secLvl2.setBounds(165, 100, 129, 23);
		staffPanel.add(rdbtn_staffPanel_secLvl2);
		
		JRadioButton rdbtn_staffPanel_secLvl3 = new JRadioButton("Security level 3");
		rdbtn_staffPanel_secLvl3.setBounds(165, 120, 129, 23);
		staffPanel.add(rdbtn_staffPanel_secLvl3);
		
		JRadioButton rdbtn_staffPanel_secLvl4 = new JRadioButton("Security level 4");
		rdbtn_staffPanel_secLvl4.setBounds(165, 140, 129, 23);
		staffPanel.add(rdbtn_staffPanel_secLvl4);
		
		JRadioButton rdbtn_staffPanel_secLvl5 = new JRadioButton("Security level 5");
		rdbtn_staffPanel_secLvl5.setBounds(165, 160, 129, 23);
		staffPanel.add(rdbtn_staffPanel_secLvl5);
		
		JRadioButton rdbtn_staffPanel_secLvl1 = new JRadioButton("Security level 1");
		rdbtn_staffPanel_secLvl1.setBounds(165, 80, 129, 23);
		staffPanel.add(rdbtn_staffPanel_secLvl1);
		
		JLabel lbl_staffPanel_obligatorySN = new JLabel("*");
		lbl_staffPanel_obligatorySN.setBounds(52, 37, 11, 14);
		staffPanel.add(lbl_staffPanel_obligatorySN);
		
		JLabel lbl_staffPanel_obligatoryN = new JLabel("*");
		lbl_staffPanel_obligatoryN.setBounds(52, 68, 11, 14);
		staffPanel.add(lbl_staffPanel_obligatoryN);
		
		JLabel lbl_staffPanel_obligatoryT = new JLabel("*");
		lbl_staffPanel_obligatoryT.setBounds(52, 100, 11, 14);
		staffPanel.add(lbl_staffPanel_obligatoryT);
		
		JLabel lbl_staffPanel_chooseSecurityLevel = new JLabel("Choose security level:");
		lbl_staffPanel_chooseSecurityLevel.setBounds(180, 68, 114, 14);
		staffPanel.add(lbl_staffPanel_chooseSecurityLevel);
		
		JLabel lbl_staffPanel_obligatorySL = new JLabel("*");
		lbl_staffPanel_obligatorySL.setBounds(169, 68, 11, 14);
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
	}
}
