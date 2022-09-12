package Panels;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import com.vaccination.dao.*;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePanel extends JPanel {
	/**
	 * Create the panel.
	 */
	private static ArrayList<String> al;
	public HomePanel(String emailId) {
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		SelectOperation so = new SelectOperation();
		al = so.select_profiles_details(emailId);
		//System.out.println(al);
		//System.out.println(emailId);
		LoginDB lb1=new LoginDB();
		
		setBackground(new Color(245, 255, 250));
		setBounds(0, 0,  826, 733);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 826, 101);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME TO YOUR PROFILE");
		lblNewLabel_1.setForeground(new Color(0, 204, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(258, 23, 329, 44);
		panel.add(lblNewLabel_1);
		
		/*JButton btnNewButton = new JButton("X");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(772, 0, 54, 50);
		panel.add(btnNewButton);
		*/
		JButton btnX = new JButton("X");
		btnX.setForeground(new Color(255, 0, 0));
		btnX.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnX.setBackground(Color.WHITE);
		btnX.setBounds(772, 0, 54, 50);
		panel.add(btnX);
		JLabel lblNewLabel_2 = new JLabel("DENTAL CARE");
		lblNewLabel_2.setFont(new Font("Gill Sans MT", Font.BOLD, 23));
		lblNewLabel_2.setBounds(20, 23, 193, 35);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(34, 125, 758, 576);
		add(panel_1);
		panel_1.setLayout(null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setToolTipText("");
		separator_1.setBounds(369, 391, -31, -382);
		panel_1.add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(374, 7, 0, 2);
		panel_1.add(separator);
		
		JLabel Name = new JLabel();
		Name.setFont(new Font("Tahoma", Font.BOLD, 21));
		Name.setBounds(319, 78, 403, 33);
		panel_1.add(Name);
		
		JLabel dob = new JLabel();
		dob.setFont(new Font("Tahoma", Font.BOLD, 21));
		dob.setBounds(319, 158, 403, 33);
		panel_1.add(dob);
		
		JLabel mobileno = new JLabel();
		mobileno.setFont(new Font("Tahoma", Font.BOLD, 21));
		mobileno.setBounds(319, 245, 403, 33);
		panel_1.add(mobileno);
		
		JLabel emailid = new JLabel();
		emailid.setFont(new Font("Tahoma", Font.BOLD, 21));
		emailid.setBounds(319, 352, 403, 33);
		panel_1.add(emailid);
		
		JLabel gender = new JLabel();
		gender.setFont(new Font("Tahoma", Font.BOLD, 21));
		gender.setBounds(319, 464, 403, 33);
		panel_1.add(gender);
		
		try {
		Name.setVisible(true);
		//System.out.println(al.get(0));
		Name.setText(al.get(0));
		dob.setText(al.get(1));
		mobileno.setText(al.get(2));
		emailid.setText(al.get(3));
		gender.setText(al.get(4));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 250, 250));
		ImageIcon img=new ImageIcon(this.getClass().getResource("/user.png"));
		lblNewLabel.setIcon(img);
		lblNewLabel.setBounds(141, 51, 86, 77);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		ImageIcon img1=new ImageIcon(this.getClass().getResource("/contact.jpg"));
		lblNewLabel_3.setIcon(img1);
		lblNewLabel_3.setBackground(new Color(255, 250, 250));
		lblNewLabel_3.setBounds(141, 138, 86, 77);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		ImageIcon img2=new ImageIcon(this.getClass().getResource("/mail.png"));
		lblNewLabel_3_1.setIcon(img2);
		lblNewLabel_3_1.setBackground(new Color(255, 250, 250));
		lblNewLabel_3_1.setBounds(141, 221, 86, 77);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		ImageIcon img3=new ImageIcon(this.getClass().getResource("/gender.png"));
		lblNewLabel_3_1_1.setIcon(img3);
		lblNewLabel_3_1_1.setBackground(new Color(255, 250, 250));
		lblNewLabel_3_1_1.setBounds(141, 323, 105, 77);
		panel_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("");
		ImageIcon img4=new ImageIcon(this.getClass().getResource("/date.png"));
		lblNewLabel_3_1_1_1.setIcon(img4);
		lblNewLabel_3_1_1_1.setBackground(new Color(255, 250, 250));
		lblNewLabel_3_1_1_1.setBounds(141, 436, 105, 69);
		panel_1.add(lblNewLabel_3_1_1_1);
		}
		catch(Exception e) {
			e.printStackTrace();

		}
		setVisible(true);
	}
}
