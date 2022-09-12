package module1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;

import com.vaccination.dao.LoginDB;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField passwordField;
	private JPasswordField pwField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.setBackground(new Color(255, 255, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Username :");
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_2.setBounds(28, 179, 120, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password :");
		lblNewLabel_2_1.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel_2_1.setBounds(28, 262, 104, 31);
		contentPane.add(lblNewLabel_2_1);
		
		username = new JTextField();
		username.setFont(new Font("Shruti", Font.BOLD, 15));
//		username.setHorizontalAlignment(SwingConstants.CENTER);
		username.setBounds(142, 178, 204, 35);
		contentPane.add(username);
		username.setColumns(10);
		
		JLabel req3 = new JLabel("");
		req3.setForeground(Color.RED);
		req3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		req3.setBounds(642, 488, 161, 19);
		contentPane.add(req3);
		
		
		JLabel req2 = new JLabel("");
		req2.setForeground(new Color(135, 206, 250));
		req2.setFont(new Font("Tahoma", Font.BOLD, 13));
		req2.setBounds(315, 488, 161, 19);
		contentPane.add(req2);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean valusern,valusern2,valpass,valpass2,boolean1;
				String uname = username.getText();
				String pass = new String( pwField.getPassword());
				LoginDB lb1=new LoginDB();
				boolean1=lb1.SelectStatement(uname, pass);
				valpass = pwField.getPassword().equals("");
				valusern = username.getText().equals("");
				if(boolean1==true)
				{
					MainDashboard db = new MainDashboard(username.getText());
//					System.out.println(username.getText());
					db.main(username.getText());
					db.setVisible(true);
					setVisible(false);
					//JOptionPane.showMessageDialog(null, "Log In Succesfull");
				}
				else 
				{
					JOptionPane.showMessageDialog(null,"Invalid email or password!");
				}
				
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(51, 255, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(88, 327, 153, 31);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage hp = new HomePage();
				hp.setVisible(true);
				setVisible(false);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBorderPainted(false);
		btnBack.setBackground(new Color(255, 0, 51));
		btnBack.setBounds(88, 395, 153, 31);
		contentPane.add(btnBack);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(265, 352, -131, 19);
		contentPane.add(passwordField);
		
		pwField = new JPasswordField();
		pwField.setFont(new Font("Shruti", Font.BOLD, 15));
		pwField.setBounds(142, 261, 204, 35);
		contentPane.add(pwField);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(new Color(51, 0, 51));
		panel.setBounds(0, 0, 790, 77);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome....");
		lblNewLabel.setBounds(182, 10, 187, 49);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 27));
		
//		JButton btnX = new JButton("X");
		/*btnX.setForeground(Color.RED);
		btnX.setBounds(748, 0, 42, 39);
		panel.add(btnX);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnX.setBackground(new Color(255, 255, 255));
		*/
		JButton btnX = new JButton("X");
		btnX.setForeground(new Color(255, 0, 0));
		btnX.setBounds(748, 0, 42, 39);
		btnX.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnX.setBackground(Color.WHITE);
		panel.add(btnX);
//		btnX.setBounds(733, 10, 47, 49);
//		contentPane.add(btnX);
		JLabel lblPleaseLogin = new JLabel("Please LogIn ");
		lblPleaseLogin.setForeground(new Color(255, 102, 255));
		lblPleaseLogin.setFont(new Font("Century Gothic", Font.BOLD, 27));
		lblPleaseLogin.setBounds(355, 6, 219, 49);
		panel.add(lblPleaseLogin);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		ImageIcon img=new ImageIcon(this.getClass().getResource("/registration.jpg"));
		lblNewLabel_1.setIcon(img);
		lblNewLabel_1.setBounds(354, 132, 426, 335);
		contentPane.add(lblNewLabel_1);
		setUndecorated(true);


	}
}

