package module1;


import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import com.toedter.calendar.JDateChooser;
import com.vaccination.dao.DatabaseOperations;

import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
public class RegistrationPage extends JFrame {

	protected static final Window mobileNoError = null;
	private JPanel contentPane;
	private JTextField fullname;
	private JTextField lname;
	private JTextField Mnumber;
	private JTextField emailId;
	private JTextField address;
	private ButtonGroup bg = new ButtonGroup();
	protected Window emailError; 
	private JPasswordField pw;
	private JPasswordField cp;
	String gender;
	ArrayList al = new ArrayList(7);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationPage frame = new RegistrationPage();
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
	public RegistrationPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1341, 689);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Name = new JLabel("First name :");
		Name.setFont(new Font("Segoe UI Semibold", Font.BOLD, 19));
		Name.setBounds(626, 130, 197, 34);
		contentPane.add(Name);
		
		JLabel lblNewLabel_1 = new JLabel("Last name :");
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 19));
		lblNewLabel_1.setBounds(865, 130, 197, 34);
		contentPane.add(lblNewLabel_1);
		
		JLabel date = new JLabel("DOB :");
		date.setFont(new Font("Segoe UI Semibold", Font.BOLD, 19));
		date.setBounds(1094, 130, 197, 34);
		contentPane.add(date);
		
		JLabel lblNewLabel_3 = new JLabel("Mobile No: ");
		lblNewLabel_3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 19));
		lblNewLabel_3.setBounds(626, 247, 197, 34);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Gender :");
		lblNewLabel_5.setFont(new Font("Segoe UI Semibold", Font.BOLD, 19));
		lblNewLabel_5.setBounds(626, 377, 197, 34);
		contentPane.add(lblNewLabel_5);
		
		JLabel Address = new JLabel("Address :");
		Address.setFont(new Font("Segoe UI Semibold", Font.BOLD, 19));
		Address.setBounds(800, 403, 197, 34);
		contentPane.add(Address);
		
		fullname = new JTextField();
		fullname.setFont(new Font("Shruti", Font.BOLD, 15));
		fullname.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		fullname.setBounds(626, 163, 177, 24);
		contentPane.add(fullname);
		fullname.setColumns(10);
		
		lname = new JTextField();
		lname.setFont(new Font("Shruti", Font.BOLD, 15));
		lname.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lname.setColumns(10);
		lname.setBounds(865, 163, 177, 24);
		contentPane.add(lname);
		
		Mnumber = new JTextField();
		Mnumber.setFont(new Font("Shruti", Font.BOLD, 15));
		Mnumber.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Mnumber.setColumns(10);
		Mnumber.setBounds(626, 279, 177, 24);
		contentPane.add(Mnumber);
		
		emailId = new JTextField();
		emailId.setFont(new Font("Shruti", Font.BOLD, 15));
		emailId.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		emailId.setColumns(10);
		emailId.setBounds(865, 279, 177, 24);
		contentPane.add(emailId);
		
		address = new JTextField();
		address.setFont(new Font("Shruti", Font.BOLD, 15));
		address.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		address.setColumns(10);
		address.setBounds(800, 452, 400, 82);
		contentPane.add(address);
		
		JDateChooser dob = new JDateChooser();
		dob.setDateFormatString("yyyy-mm-dd");
		dob.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		dob.setBounds(1094, 163, 177, 24);
		contentPane.add(dob);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
		
		
			@Override
			public void mouseClicked(MouseEvent e) {
				gender = "Male";
				
			}
		});
		rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
		bg.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton.setBounds(625, 429, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				gender = "Female";
			}
		});
		rdbtnFemale.setBackground(new Color(255, 255, 255));
		bg.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnFemale.setBounds(626, 470, 103, 21);
		contentPane.add(rdbtnFemale);
		
		JRadioButton rdbtnTrans = new JRadioButton("Other");
		rdbtnTrans.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				gender = "Other";
			}
		});
		rdbtnTrans.setBackground(new Color(255, 255, 255));
		bg.add(rdbtnTrans);
		rdbtnTrans.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnTrans.setBounds(626, 517, 103, 21);
		contentPane.add(rdbtnTrans);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		ImageIcon img=new ImageIcon(this.getClass().getResource("/Screenshot_1.png"));
		lblNewLabel_7.setIcon(img);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(10, 6, 576, 673);
		contentPane.add(lblNewLabel_7);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage hp = new HomePage();
				hp.setVisible(true);
				setVisible(false);
			}
		});
		btnBack.setBorderPainted(false);
		btnBack.setBackground(Color.RED);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(1023, 583, 177, 34);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_8 = new JLabel("Register for your Dental Services");
		lblNewLabel_8.setForeground(new Color(138, 43, 226));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Segoe UI", Font.BOLD, 30));
		lblNewLabel_8.setBounds(551, 6, 596, 45);
		contentPane.add(lblNewLabel_8);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnX.setBorderPainted(false);
		btnX.setBackground(new Color(255, 0, 0));
		btnX.setBounds(1291, 0, 50, 51);
		contentPane.add(btnX);
		
		JLabel mobileNo = new JLabel("");
		mobileNo.setHorizontalAlignment(SwingConstants.CENTER);
		mobileNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mobileNo.setForeground(new Color(255, 0, 0));
		mobileNo.setBounds(703, 228, 197, 24);
		contentPane.add(mobileNo);
		
		JLabel emailerr = new JLabel("");
		emailerr.setHorizontalAlignment(SwingConstants.CENTER);
		emailerr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		emailerr.setForeground(Color.RED);
		emailerr.setBounds(907, 228, 177, 24);
		contentPane.add(emailerr);
		setUndecorated(true);
		
		JLabel req1 = new JLabel("");
		req1.setHorizontalAlignment(SwingConstants.CENTER);
		req1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		req1.setForeground(Color.RED);
		req1.setBounds(656, 119, 177, 21);
		contentPane.add(req1);
		
		JLabel req2 = new JLabel("");
		req2.setHorizontalAlignment(SwingConstants.CENTER);
		req2.setForeground(Color.RED);
		req2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		req2.setBounds(907, 119, 177, 21);
		contentPane.add(req2);
		
		JLabel req3 = new JLabel("");
		req3.setHorizontalAlignment(SwingConstants.CENTER);
		req3.setForeground(Color.RED);
		req3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		req3.setBounds(1126, 108, 165, 21);
		contentPane.add(req3);
		
		JLabel req4 = new JLabel("");
		req4.setHorizontalAlignment(SwingConstants.CENTER);
		req4.setForeground(Color.RED);
		req4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		req4.setBounds(907, 403, 332, 34);
		contentPane.add(req4);
		
		JLabel req5 = new JLabel("");
		req5.setHorizontalAlignment(SwingConstants.CENTER);
		req5.setForeground(Color.RED);
		req5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		req5.setBounds(626, 546, 141, 34);
		contentPane.add(req5);
		
		JLabel req6 = new JLabel("");
		req6.setForeground(Color.RED);
		req6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		req6.setBounds(1094, 313, 183, 24);
		contentPane.add(req6);
		
		JLabel req7 = new JLabel("");
		req7.setForeground(Color.RED);
		req7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		req7.setBounds(907, 313, 183, 24);
		contentPane.add(req7);
		
		pw = new JPasswordField();
		pw.setFont(new Font("Shruti", Font.BOLD, 15));
		pw.setBorder(new LineBorder(Color.BLACK, 2));
		pw.setBounds(1094, 281, 177, 22);
		contentPane.add(pw);
		
		cp = new JPasswordField();
		cp.setBorder(new LineBorder(Color.BLACK, 2));
		cp.setBounds(814, 343, 177, 24);
		contentPane.add(cp);

		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean valName, valName1,valbutton, valMobileNo, valEmail, valDob, valGender, valAddress, valPass, valConfPass,valPass1;
				boolean validate = true;
				Pattern ptr;
				Matcher match;
				valName = fullname.getText().equals("");
				if (valName) {
					req1.setText("* Required");
					req1.setVisible(true);
				valName=false;
				validate = false;
				} else {
					req1.setVisible(false);
				valName=true;
				}
				valName1 = lname.getText().equals("");
				if (valName1) {
					req2.setText("* Required");
					req2.setVisible(true);
					valName1=false;
					validate = false;
				} else {
					req2.setVisible(false);
					valName=true;
				}
				valAddress = address.getText().equals("");
				if (valAddress) {
					req4.setText("* Required");
					req4.setVisible(true);
					valAddress=false;
					validate = false;
				} else {
					req4.setVisible(false);
					valAddress=true;
				}
				valbutton = bg.isSelected(null);
				if (valbutton) {
					req5.setText("* Required");
					req5.setVisible(true);
					valbutton = false;
					validate = false;
				} else {
					req5.setVisible(false);
					valbutton=true;
				}
				valPass = pw.getPassword().equals("");
				
//				match = ptr.matcher(pw.getText());
				if (valPass) {
					req6.setText("* Invalid Password!");
					req6.setVisible(true);
					valPass=false;
					validate = false;
				} else {
					req6.setVisible(false);
					valPass=true;
				}
			
//				match = ptr.matcher(pw.getText());
				valPass1=!(String.valueOf(pw.getPassword()).equals(String.valueOf(cp.getPassword())));
				if (valPass1) {
					req7.setText("* Invalid Password!");
					req7.setVisible(true);
					valPass1=false;
					validate = false;
				} else {
					req7.setVisible(false);
					valPass1=true;
				}
				valEmail = emailId.getText().equals("");
					ptr = Pattern.compile("[a-zA-Z0-9]{3,20}@[A-Za-z]{3,10}.(com|in)");
					match = ptr.matcher(emailId.getText());
					
					if (!(match.find() && match.group().equals(emailId.getText()))) {
					
						emailerr.setText("* Incorrect email");
						emailerr.setVisible(true);
						valEmail=false;
						validate = false;
					} else {
						emailerr.setVisible(false);
						valEmail=true;
					}
				valMobileNo = Mnumber.getText().equals("");
					ptr = Pattern.compile("(0/91)?[6-9][0-9]{9}");
					match = ptr.matcher(Mnumber.getText());
					 
					if (!(match.find() && match.group().equals(Mnumber.getText()))) {
						mobileNo.setText("* Incorrect Number");
						mobileNo.setVisible(true);
						valMobileNo=false;
						validate = false;
					} else {
						
						mobileNo.setVisible(false);
						valMobileNo=true;
					}
					if(validate==true)
					{
						/*
						Login lp = new Login();
						lp.setVisible(true);
						setVisible(false);*/
						JOptionPane.showMessageDialog(null,"Registered Successfully!");
						String fName=fullname.getText();
						String lName=lname.getText();
						String mobileNo=Mnumber.getText();
						String eMail=emailId.getText();
						String password=new String(pw.getPassword());
						
						String Gender = gender;
						String address1  = address.getText();
						String dob1 = dob.getDate().toString();
						DatabaseOperations db = new DatabaseOperations();
						db.Jdbc(fName, lName,mobileNo, eMail, password, Gender,address1, dob1);
					}
					
			}
		
		});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRegister.setBorderPainted(false);
		btnRegister.setBackground(new Color(0, 250, 154));
		btnRegister.setBounds(782, 583, 177, 34);
		contentPane.add(btnRegister);
		
		JLabel lblNewLabel_3_1 = new JLabel("Email ID :");
		lblNewLabel_3_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 19));
		lblNewLabel_3_1.setBounds(865, 247, 197, 34);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Password :");
		lblNewLabel_3_1_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 19));
		lblNewLabel_3_1_1.setBounds(1094, 247, 197, 34);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Confirm Password :");
		lblNewLabel_3_1_1_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 19));
		lblNewLabel_3_1_1_1.setBounds(626, 334, 197, 34);
		contentPane.add(lblNewLabel_3_1_1_1);
		
		
	}
}

