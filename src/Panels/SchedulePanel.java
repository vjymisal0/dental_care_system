package Panels;

import com.vaccination.dao.*;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import com.utility.dao.EmailNotification;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.DropMode;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;

public class SchedulePanel extends JPanel {
	private JTextField MobileNo;
	String vaccionchose;
	private JTextField email;
	String treatments;
	private final ButtonGroup bg = new ButtonGroup();

	/**
	 * Create the panel.
	 */
	public SchedulePanel(String to) {
		setForeground(new Color(204, 255, 255));
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 826, 733);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(51, 255, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(new Color(204, 255, 255));
		panel.setBounds(0, 0, 826, 101);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BE TRUE TO YOUR TEETH OR THEY WILL BE FALSE TO YOU...");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Dubai Medium", Font.BOLD, 22));
		lblNewLabel.setBounds(77, 21, 719, 56);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBackground(new Color(51, 0, 102));
		panel_1.setBounds(24, 121, 769, 591);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Adhaar No:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1.setBounds(135, 140, 132, 46);
		panel_1.add(lblNewLabel_1);
		
		MobileNo = new JTextField();
		MobileNo.setBounds(274, 154, 308, 27);
		panel_1.add(MobileNo);
		MobileNo.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Date :");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(135, 196, 132, 46);
		panel_1.add(lblNewLabel_1_1);
		
		JDateChooser date = new JDateChooser();
		date.setBounds(274, 217, 305, 27);
		panel_1.add(date);
		
		JLabel lblNewLabel_1_2 = new JLabel("Choose Treatment: ");
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(260, 252, 292, 46);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Center :");
		lblNewLabel_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(135, 428, 132, 46);
		panel_1.add(lblNewLabel_1_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("CEMENT FILLING");
		rdbtnNewRadioButton.setBackground(new Color(51, 0, 102));
		rdbtnNewRadioButton.setForeground(new Color(240, 255, 255));
		rdbtnNewRadioButton.setFont(new Font("Myanmar Text", Font.BOLD, 15));
		bg.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				treatments = "CEMENT FILLING";
				
			}
		});

		rdbtnNewRadioButton.setBounds(142, 306, 217, 35);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("TEETH BNDINGS");
		rdbtnNewRadioButton_1.setBackground(new Color(51, 0, 102));
		rdbtnNewRadioButton_1.setForeground(new Color(240, 255, 255));
		rdbtnNewRadioButton_1.setFont(new Font("Myanmar Text", Font.BOLD, 15));
		bg.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			 treatments = "TEETH BNDINGS";
				
			}
		});
		rdbtnNewRadioButton_1.setBounds(399, 306, 217, 35);
		panel_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("TEETH WHITENING");
		rdbtnNewRadioButton_2.setBackground(new Color(51, 0, 102));
		rdbtnNewRadioButton_2.setForeground(new Color(240, 255, 255));
		rdbtnNewRadioButton_2.setFont(new Font("Myanmar Text", Font.BOLD, 15));
		bg.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				treatments = "TEETH WHITENING";
				
			}
		});
		rdbtnNewRadioButton_2.setBounds(142, 365, 217, 35);
		panel_1.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("ROOT CANAL");
		rdbtnNewRadioButton_3.setBackground(new Color(51, 0, 102));
		rdbtnNewRadioButton_3.setForeground(new Color(240, 255, 255));
		rdbtnNewRadioButton_3.setFont(new Font("Myanmar Text", Font.BOLD, 15));
		bg.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				treatments = "Root Canal Treatment";
				
			}
		});
		rdbtnNewRadioButton_3.setBounds(399, 365, 217, 35);
		panel_1.add(rdbtnNewRadioButton_3);
		
		
		JComboBox center = new JComboBox();
		center.addItem("");
		center.addItem("City Dental Care, Solapur");
		center.addItem("Ashwini Dental Clinic, Solapur");
		center.addItem("Railway Dental Hospital, Solapur");
		center.addItem("Yashodhara Dental Hospital, Solapur");
		center.addItem("Ambika Hospital, Solapur");
		center.setBounds(274, 441, 324, 29);
		panel_1.add(center);
		
		JButton btnNewButton = new JButton("Schedule Appoinment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Registered Successfully!");
				String Mobileno=MobileNo.getText();
				String DATE = date.getDate().toString();
				String Treatments=treatments;
				//String Treatments = vaccionchose;
				String TimeSlot= (String) center.getSelectedItem();
				DatabaseOperations db = new DatabaseOperations();
				db.appointment(Mobileno,DATE, Treatments, TimeSlot) ;
				EmailNotification en = new EmailNotification();
				en.sendAppointmentBookedMail(email.getText());
				JOptionPane.showMessageDialog(null, "Slot Booked Successfully\nCheck your mail for confirmation", "Success",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(153, 204, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(282, 510, 223, 35);
		panel_1.add(btnNewButton);
		
		email = new JTextField();
		email.setFont(new Font("Arial", Font.BOLD, 12));
		email.setColumns(10);
		email.setBounds(274, 98, 308, 27);
		panel_1.add(email);
		
		JLabel lblNewLabel_1_4 = new JLabel("Email Id :");
		lblNewLabel_1_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(135, 85, 132, 46);
		panel_1.add(lblNewLabel_1_4);
	
		setVisible(true);
	}
}
