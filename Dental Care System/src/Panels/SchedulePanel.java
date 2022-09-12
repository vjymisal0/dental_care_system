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
	private final ButtonGroup checkbox = new ButtonGroup();
	String treatments;

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
		
		JComboBox center = new JComboBox();
		center.setModel(new DefaultComboBoxModel(new String[] {"", "Siddhivinayak Dental Clinic, Solapur", "Yash Dental Clinic, Solapur", "Sri Sai Dental Care, Solapur", "Dr.Katkar Dental Clinic, Solapur", "Bhalerao Dental Clinic, Solapur"}));
		/*center.addItem("");
		center.addItem("Siddhivinayak Dental Clinic, Solapur");
		center.addItem("Yash Dental Clinic, Solapur");
		center.addItem("Sri Sai Dental Care, Solapur");
		center.addItem("Dr.Katkar Dental Clinic, Solapur");
		center.addItem("Bhalerao Dental Clinic, Solapur");*/
		center.setBounds(274, 441, 324, 29);
		panel_1.add(center);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("CEMENT FILL");
		chckbxNewCheckBox.addMouseListener(new MouseAdapter() {
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				treatments = "CEMENT FILL";
				
			}
		});
		checkbox.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setForeground(new Color(0, 250, 154));
		chckbxNewCheckBox.setBackground(new Color(51, 0, 102));
		chckbxNewCheckBox.setFont(new Font("Century Gothic", Font.BOLD, 20));
		chckbxNewCheckBox.setBounds(135, 306, 161, 35);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxTeethWhitening = new JCheckBox("TEETH WHITENING");
		chckbxNewCheckBox.addMouseListener(new MouseAdapter() {
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				treatments = "TEETH WHITENING";
				
			}
		});
		checkbox.add(chckbxTeethWhitening);
		chckbxTeethWhitening.setForeground(new Color(0, 250, 154));
		chckbxTeethWhitening.setFont(new Font("Century Gothic", Font.BOLD, 20));
		chckbxTeethWhitening.setBackground(new Color(51, 0, 102));
		chckbxTeethWhitening.setBounds(357, 303, 206, 35);
		panel_1.add(chckbxTeethWhitening);
		
		JCheckBox chckbxTeethCleanings = new JCheckBox("TEETH CLEANINGS");
		chckbxNewCheckBox.addMouseListener(new MouseAdapter() {
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				treatments = "TEETH WHITENING";
				
			}
		});
		checkbox.add(chckbxTeethCleanings);
		chckbxTeethCleanings.setForeground(new Color(0, 250, 154));
		chckbxTeethCleanings.setFont(new Font("Century Gothic", Font.BOLD, 20));
		chckbxTeethCleanings.setBackground(new Color(51, 0, 102));
		chckbxTeethCleanings.setBounds(135, 353, 206, 35);
		panel_1.add(chckbxTeethCleanings);
		
		JCheckBox chckbxTeethBondings = new JCheckBox("TEETH BONDINGS");
		chckbxNewCheckBox.addMouseListener(new MouseAdapter() {
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				treatments = "TEETH BONDINGS";
				
			}
		});
		checkbox.add(chckbxTeethBondings);
		chckbxTeethBondings.setForeground(new Color(0, 250, 154));
		chckbxTeethBondings.setFont(new Font("Century Gothic", Font.BOLD, 20));
		chckbxTeethBondings.setBackground(new Color(51, 0, 102));
		chckbxTeethBondings.setBounds(361, 353, 206, 35);
		panel_1.add(chckbxTeethBondings);
		
		JButton btnNewButton = new JButton("Schedule Appoinment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Registered Successfully!");
				String Mobileno=MobileNo.getText();
				String DATE = date.getDate().toString();
				String Treatments=treatments;
				//String Treatments = vaccionchose;
				String TimeSlot=(String) center.getSelectedItem();
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
