package application;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.Color;

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
	private JTextField txtField_staffPanel_name;
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
	
	public void JTablefiller() {
	DefaultTableModel modelStaff = (DefaultTableModel) JTable_staffPanel.getModel();
	modelStaff.setRowCount(0);
	for(Staff staff : controller.getAllStaff()) {
		modelStaff.addRow(new Object[] { staff.getSocialNumber(), staff.getName(), staff.getTitle(), staff.getPhoneNumber(), staff.getEmail(), " " });
		}
	}
	/**
	 * Create the application.
	 */
	public Pycelle(Controller controller) {
		setTitle("Staff Register");
		this.controller = controller;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		staffPanel = new JPanel();
		staffPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(staffPanel);
		staffPanel.setLayout(null);	
		
		JRadioButton rdbtn_staffPanel_secLvl2 = new JRadioButton("Public spaces");
		rdbtn_staffPanel_secLvl2.setBounds(421, 69, 129, 23);
		staffPanel.add(rdbtn_staffPanel_secLvl2);
		
		JRadioButton rdbtn_staffPanel_secLvl3 = new JRadioButton("Service rooms");
		rdbtn_staffPanel_secLvl3.setToolTipText("Server room, cleaning, kitchen");
		rdbtn_staffPanel_secLvl3.setBounds(421, 89, 232, 23);
		staffPanel.add(rdbtn_staffPanel_secLvl3);
		
		JRadioButton rdbtn_staffPanel_secLvl4 = new JRadioButton("Classrooms");
		rdbtn_staffPanel_secLvl4.setBounds(421, 109, 129, 23);
		staffPanel.add(rdbtn_staffPanel_secLvl4);
		
		JRadioButton rdbtn_staffPanel_secLvl5 = new JRadioButton("Offices");
		rdbtn_staffPanel_secLvl5.setBounds(421, 129, 129, 23);
		staffPanel.add(rdbtn_staffPanel_secLvl5);
		
		JRadioButton rdbtn_staffPanel_secLvl1 = new JRadioButton("Entrance");
		rdbtn_staffPanel_secLvl1.setBounds(421, 49, 129, 23);
		staffPanel.add(rdbtn_staffPanel_secLvl1);
		
		txtField_staffPanel_socialNumber = new JTextField();
		txtField_staffPanel_socialNumber.setBounds(213, 32, 131, 20);
		staffPanel.add(txtField_staffPanel_socialNumber);
		txtField_staffPanel_socialNumber.setColumns(10);
		
		txtField_staffPanel_name = new JTextField();
		txtField_staffPanel_name.setBounds(213, 63, 131, 20);
		staffPanel.add(txtField_staffPanel_name);
		txtField_staffPanel_name.setColumns(10);
		
		txtField_staffPanel_phoneNumber = new JTextField();
		txtField_staffPanel_phoneNumber.setBounds(213, 127, 131, 20);
		staffPanel.add(txtField_staffPanel_phoneNumber);
		txtField_staffPanel_phoneNumber.setColumns(10);
		
		txtField_staffPanel_eMail = new JTextField();
		txtField_staffPanel_eMail.setBounds(213, 158, 131, 20);
		staffPanel.add(txtField_staffPanel_eMail);
		txtField_staffPanel_eMail.setColumns(10);
		
		JComboBox comboBox_staffPanel_chooseTitle = new JComboBox();
		comboBox_staffPanel_chooseTitle.setModel(new DefaultComboBoxModel(new String[] {"Teacher", "Professor", "Administator", "Janitor", "Receptionist", "Cleaning staff", "Guest"}));
		comboBox_staffPanel_chooseTitle.setEditable(true);
		comboBox_staffPanel_chooseTitle.setBounds(213, 94, 131, 22);
		staffPanel.add(comboBox_staffPanel_chooseTitle);
		
		JScrollPane scrollPane_staffPanel_txtA = new JScrollPane();
		scrollPane_staffPanel_txtA.setBounds(106, 276, 238, 69);
		staffPanel.add(scrollPane_staffPanel_txtA);
		
		JTextArea textArea_staffPanel = new JTextArea();
		scrollPane_staffPanel_txtA.setViewportView(textArea_staffPanel);
		
		JScrollPane scrollPane_staffPanel_Jtbl = new JScrollPane();
		scrollPane_staffPanel_Jtbl.setBounds(384, 276, 300, 69);
		staffPanel.add(scrollPane_staffPanel_Jtbl);
		
		JTable_staffPanel = new JTable();
		JTable_staffPanel.setAutoCreateRowSorter(true);
		JTable_staffPanel.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Social Number", "Name", "Title", "Phone Number", "Email", "Access"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		JTable_staffPanel.getColumnModel().getColumn(0).setPreferredWidth(116);
		JTable_staffPanel.getColumnModel().getColumn(3).setPreferredWidth(99);
		JTable_staffPanel.getColumnModel().getColumn(5).setPreferredWidth(191);

		scrollPane_staffPanel_Jtbl.setViewportView(JTable_staffPanel);
		
		JTablefiller();
		
		JTable_staffPanel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 1) {
					JTable target = (JTable) e.getSource();
					int row = target.getSelectedRow();
					txtField_staffPanel_socialNumber.setText(target.getValueAt(row, 0).toString());
					txtField_staffPanel_name.setText(target.getValueAt(row, 1).toString());
					comboBox_staffPanel_chooseTitle.setSelectedItem(target.getValueAt(row, 2));
					txtField_staffPanel_phoneNumber.setText(target.getValueAt(row, 3).toString());
					txtField_staffPanel_eMail.setText(target.getValueAt(row, 4).toString());
					//FindPerson metod för access
					for (SecurityLevel level : controller.findStaff(target.getValueAt(row, 0).toString()).getSecurityLevel()){
						if (level.getLevel().equals("Entrance")) {
							rdbtn_staffPanel_secLvl1.setSelected(true);
						}
					}
				}
			}
		});
		

		
		JButton btn_staffPanel_addStaff = new JButton("Add staff");
		btn_staffPanel_addStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String socialNumber = txtField_staffPanel_socialNumber.getText();
				String name = txtField_staffPanel_name.getText();
				String title = comboBox_staffPanel_chooseTitle.getSelectedItem().toString();
				String phoneNumber = txtField_staffPanel_phoneNumber.getText();
				String email = txtField_staffPanel_eMail.getText();
				
				
				if (socialNumber.equals("") || name.equals("") || title.equals("")) {
					textArea_staffPanel.setForeground(Color.RED);
					textArea_staffPanel.setText("Please enter mandatory information");
				} else if (controller.findStaff(socialNumber) != null){
					textArea_staffPanel.setText("Staff with Social Number: " + socialNumber + " already exists");					
				} else {
					controller.addStaff(name, socialNumber, phoneNumber, email, title);
					textArea_staffPanel.setForeground(Color.BLACK);
					textArea_staffPanel.setText(name + " has been added");
					txtField_staffPanel_socialNumber.setText("");
					txtField_staffPanel_name.setText("");
					txtField_staffPanel_phoneNumber.setText("");
					txtField_staffPanel_eMail.setText("");
					comboBox_staffPanel_chooseTitle.setSelectedIndex(0);
				}
				
				JTablefiller();
			}
		});
		btn_staffPanel_addStaff.setBounds(110, 212, 89, 23);
		staffPanel.add(btn_staffPanel_addStaff);
		
		JButton btn_staffPanel_delete = new JButton("Delete");
		btn_staffPanel_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String socialNumber = txtField_staffPanel_socialNumber.getText();
				if (socialNumber.equals("")) {
					textArea_staffPanel.setForeground(Color.RED);
					textArea_staffPanel.setText("Please enter a social number");
				} else if (controller.findStaff(socialNumber) != null) {
					controller.removeStaff(socialNumber);
					txtField_staffPanel_socialNumber.setText("");
					txtField_staffPanel_name.setText("");
					txtField_staffPanel_phoneNumber.setText("");
					txtField_staffPanel_eMail.setText("");
					comboBox_staffPanel_chooseTitle.setSelectedIndex(0);
					textArea_staffPanel.setForeground(Color.BLACK);
					textArea_staffPanel.setText("Staff has been removed");
				} else {
					textArea_staffPanel.setForeground(Color.RED);
					textArea_staffPanel.setText("Staff with social number: " + socialNumber + " doesn't exist");
				}
				
				
				JTablefiller();
			 }
		  });
		
		btn_staffPanel_delete.setBounds(576, 212, 89, 23);
		staffPanel.add(btn_staffPanel_delete);
		
		JButton btn_staffPanel_update = new JButton("Update");
		btn_staffPanel_update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String socialNumber = txtField_staffPanel_socialNumber.getText();
				String name = txtField_staffPanel_name.getText();
				String title = comboBox_staffPanel_chooseTitle.getSelectedItem().toString();
				String phoneNumber = txtField_staffPanel_phoneNumber.getText();
				String email = txtField_staffPanel_eMail.getText();
				if (controller.findStaff(socialNumber) != null) {
					controller.updateStaff(socialNumber, name, phoneNumber, email, title);
					txtField_staffPanel_socialNumber.setText("");
					txtField_staffPanel_name.setText("");
					txtField_staffPanel_phoneNumber.setText("");
					txtField_staffPanel_eMail.setText("");
					comboBox_staffPanel_chooseTitle.setSelectedIndex(0);
					textArea_staffPanel.setForeground(Color.BLACK);
					textArea_staffPanel.setText("Staff has been updated");
				} else {
					textArea_staffPanel.setForeground(Color.RED);
					textArea_staffPanel.setText("Pick an existing social number to update");
				}
					
				JTablefiller();
				 }
			  });
		
		btn_staffPanel_update.setBounds(431, 212, 89, 23);
		staffPanel.add(btn_staffPanel_update);
		
		JLabel lbl_staffPanel_chooseSecurityLevel = new JLabel("Person should have access to: *");
		lbl_staffPanel_chooseSecurityLevel.setBounds(421, 32, 218, 14);
		staffPanel.add(lbl_staffPanel_chooseSecurityLevel);
		
		JLabel lblSocialNumber = new JLabel("Social number: *");
		lblSocialNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblSocialNumber.setBounds(110, 38, 92, 14);
		staffPanel.add(lblSocialNumber);
		
		JLabel lblName = new JLabel("Name: *");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setBounds(110, 69, 92, 14);
		staffPanel.add(lblName);
		
		JLabel lblTitle = new JLabel("Title: *");
		lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitle.setBounds(110, 101, 92, 14);
		staffPanel.add(lblTitle);
		
		JLabel lblPhoneNumber = new JLabel("Phone number:");
		lblPhoneNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhoneNumber.setBounds(110, 133, 92, 14);
		staffPanel.add(lblPhoneNumber);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setBounds(110, 164, 92, 14);
		staffPanel.add(lblEmail);
	}
}
