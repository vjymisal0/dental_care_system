package Panels;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import com.vaccination.dao.SelectOperation;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ViewPanel extends JPanel {
	private JTextField aadharNo;
	private JTextField MobileNo;

	/**
	 * Create the panel.
	 */
	public ViewPanel(String adharNo) {
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setBackground(new Color(224, 255, 255));
		setBounds(0 , 0, 826, 733);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(0, 0, 826, 102);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("VACCINE A IS MUST TO FIGHT AGAINST COVID");
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(155, 36, 491, 30);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBackground(new Color(153, 255, 255));
		panel_1.setBounds(20, 131, 770, 565);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Appointment Details");
		lblNewLabel.setFont(new Font("Dubai Light", Font.BOLD, 30));
		lblNewLabel.setBounds(230, 30, 330, 37);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Date :");
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBounds(70, 204, 148, 24);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Vaccine Name :");
		lblNewLabel_2_1_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2_1_1_1.setBounds(70, 265, 148, 24);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Vaccine Center :");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2_1_1_1_1.setBounds(70, 331, 172, 24);
		panel_1.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Adhaar No :");
		lblNewLabel_2_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(70, 144, 111, 24);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel date = new JLabel("");
		date.setFont(new Font("Shruti", Font.BOLD, 15));
		date.setBounds(266, 199, 188, 29);
		panel_1.add(date);
		
		JLabel vac_name = new JLabel("");
		vac_name.setFont(new Font("Shruti", Font.BOLD, 15));
		vac_name.setBounds(266, 265, 188, 29);
		panel_1.add(vac_name);
		
		JLabel vac_center = new JLabel("");
		vac_center.setFont(new Font("Shruti", Font.BOLD, 15));
		vac_center.setBounds(266, 331, 188, 29);
		panel_1.add(vac_center);
		
		MobileNo = new JTextField();
		MobileNo.setBounds(209, 146, 245, 29);
		panel_1.add(MobileNo);
		MobileNo.setColumns(10);
		
		JButton btnNewButton = new JButton("Go");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectOperation so = new SelectOperation();
				ArrayList<String> al = new ArrayList<String>(); 
//				System.out.println(aadharNo.getText());
				al = so.select_appointment_details(MobileNo.getText());
//				System.out.println(so.select_appointment_details(aadharNo.getText()));
				date.setText(al.get(0));
				vac_name.setText(al.get(1));
				vac_center.setText(al.get(2));
				System.out.println(al);
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(464, 140, 56, 37);
		panel_1.add(btnNewButton);

		setVisible(true);
	}
}
