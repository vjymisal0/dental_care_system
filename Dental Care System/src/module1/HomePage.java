package module1;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 530);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage l = new LoginPage();
				l.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBackground(new Color(147, 112, 219));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(306, 381, 154, 33);
		contentPane.add(btnNewButton);
		
		JButton btnSingup = new JButton("SignUp");
		btnSingup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			RegistrationPage r = new RegistrationPage();
				r.setVisible(true);
				setVisible(false);
			}
		});
		btnSingup.setBorderPainted(false);
		btnSingup.setBackground(new Color(255, 20, 147));
		btnSingup.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSingup.setBounds(306, 442, 154, 33);
		contentPane.add(btnSingup);
		
		JLabel lblNewLabel_2 = new JLabel("A smile remains the most inexpensive gift..");
		lblNewLabel_2.setForeground(new Color(0, 51, 0));
		lblNewLabel_2.setFont(new Font("High Tower Text", Font.BOLD, 29));
		lblNewLabel_2.setBounds(99, 11, 596, 72);
		contentPane.add(lblNewLabel_2);
		
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
		btnX.setBounds(733, 10, 47, 49);
		contentPane.add(btnX);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon img=new ImageIcon(this.getClass().getResource("/dental.jpg"));
		lblNewLabel.setIcon(img);
		lblNewLabel.setBounds(267, 93, 242, 254);
		
		contentPane.add(lblNewLabel);
		setUndecorated(true);

	}
}
