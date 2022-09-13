package module1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;

import Panels.HomePanel;
import Panels.SchedulePanel;
import Panels.ViewPanel;

public class MainDashboard extends JFrame {

	private JPanel contentPane;
	
	private HomePanel panelhome;
	private SchedulePanel panelshedule;
	private ViewPanel panelview;
	private static String email;
	/**
	 * Launch the application.
	 */
	public static void main(String emailId) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainDashboard frame = new MainDashboard(emailId);
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
	public MainDashboard(String email) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1081, 733);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//ln(email);
		panelhome = new HomePanel(email);
		panelshedule = new SchedulePanel(null);
		panelshedule.setBackground(new Color(255, 255, 255));
		panelview = new ViewPanel(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 256, 733);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel paneHome = new JPanel();
		paneHome.setBorder(new LineBorder(new Color(0, 0, 0)));
		paneHome.addMouseListener(new PanelButtonMouseAdapter(paneHome) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelhome);
			}
		});
		paneHome.setBackground(new Color(102, 204, 255));
		paneHome.setBounds(0, 310, 256, 56);
		panel.add(paneHome);
		paneHome.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("My Profile");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 22));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(32, 10, 174, 23);
		paneHome.add(lblNewLabel_1);

		
		JPanel panevaccine = new JPanel();
		panevaccine.setBorder(new LineBorder(new Color(0, 0, 0)));
		panevaccine.addMouseListener(new PanelButtonMouseAdapter(panevaccine) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelshedule);
			}
		});
		panevaccine.setBackground(new Color(102, 204, 255));
		panevaccine.setBounds(0, 365, 256, 56);
		panel.add(panevaccine);
		panevaccine.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Appoinment Schedule");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(-18, 10, 293, 23);
		panevaccine.add(lblNewLabel_1_1);


		
		JPanel paneview = new JPanel();
		paneview.setBorder(new LineBorder(new Color(0, 0, 0)));
		paneview.addMouseListener(new PanelButtonMouseAdapter(paneview) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelview);
			}
		});
		paneview.setBackground(new Color(102, 204, 255));
		paneview.setBounds(0, 420, 256, 56);
		panel.add(paneview);
		paneview.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("View Appointment");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Century Gothic", Font.BOLD, 22));
		lblNewLabel_1_2.setBounds(10, 10, 236, 23);
		paneview.add(lblNewLabel_1_2);
		
		JPanel panesign = new JPanel();
		paneview.addMouseListener(new PanelButtonMouseAdapter(panesign) {
		});
		panesign.setBorder(new LineBorder(new Color(0, 0, 0)));
		panesign.addMouseListener(new PanelButtonMouseAdapter(panesign));
		panesign.setBackground(new Color(255, 0, 0));
		panesign.setBounds(0, 624, 256, 56);
		panel.add(panesign);
		panesign.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("Sign Out");
		lblNewLabel_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_1_3.setBounds(61, 10, 137, 36);
		panesign.add(lblNewLabel_1_3);
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		
		JLabel lblNewLabel = new JLabel("New label");
		ImageIcon img=new ImageIcon(this.getClass().getResource("/dentalclinic.jpg"));
		lblNewLabel.setIcon(img);
		lblNewLabel.setBounds(10, 10, 236, 290);
		panel.add(lblNewLabel);
		ImageIcon img1=new ImageIcon(this.getClass().getResource("/dental.jpg"));
		JPanel panelmain = new JPanel();
		panelmain.setBounds(255, 0, 826, 733);
		contentPane.add(panelmain);
		panelmain.setLayout(null);
		
		panelmain.add(panelhome);
		panelmain.add(panelshedule);
		panelmain.add(panelview);
		
		menuClicked(panelhome);
		setUndecorated(true);
	}
	public void menuClicked(JPanel panel) {
		panelhome.setVisible(false);
		panelshedule.setVisible(false);
		panelview.setVisible(false);
		
		panel.setVisible(true);
	} 
	public class PanelButtonMouseAdapter extends MouseAdapter{
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
		public void mouseEntered(MouseEvent e) {
//			panel.setBackground(new Color(102, 204, 255));
		}
		@Override
		public void mouseExited(MouseEvent e) {
//			panel.setBackground(new Color(102, 204, 255));
		}
		@Override
		public void mousePressed(MouseEvent e) {
//			panel.setBackground(new Color(102, 204, 255));
//			JPanel panel2;	
//			panel2.showMessageDialog(null,"Invalid email or password!");
			//System.exit(0);
		}
		@Override
		public void mouseReleased(MouseEvent e) {

			//			panel.setBackground(new Color(102, 204, 255));
		
		}
	}
}
