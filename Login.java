package log1;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textFieldstd;
	private JPasswordField passwordFieldstd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
					frame.setTitle("Exam Record System");
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 850, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 0, 51));
		contentPane.setForeground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 248, 220));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(10, 132, 424, 409);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Login");
		lblNewLabel.setForeground(new Color(72, 209, 204));
		lblNewLabel.setBounds(130, 10, 206, 53);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 17));
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME");
		lblNewLabel_1.setForeground(new Color(72, 209, 204));
		lblNewLabel_1.setBounds(10, 77, 131, 59);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setForeground(new Color(72, 209, 204));
		lblNewLabel_2.setBounds(10, 181, 158, 59);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		textField = new JTextField();
		textField.setBounds(148, 90, 258, 36);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					
					try {
						if(textField.getText().equals("pass") && textField_1.getText().equals("12345"))
						{
						
							JOptionPane.showMessageDialog(null,"Authorization Success");
							dispose();
							MainRec framem1 = new MainRec();
							framem1.setVisible(true);
							framem1.setLocationRelativeTo(null);
						}
						else
							JOptionPane.showMessageDialog(null,"Authorization Failure");
						textField_1.setText(null);
					}
					catch(Exception en)
					{
						JOptionPane.showMessageDialog(null,e);
					}
					
				}
				
				
			}
		});
		textField_1.setBounds(148, 194, 258, 36);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setBounds(113, 268, 155, 37);
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					try {
						if(textField.getText().equals("pass") && textField_1.getText().equals("12345"))
						{
						
							JOptionPane.showMessageDialog(null,"Authorization Success");
							dispose();
							MainRec framem1 = new MainRec();
							framem1.setVisible(true);
							framem1.setLocationRelativeTo(null);
						}
						else
							JOptionPane.showMessageDialog(null,"Authorization Failure");
						textField_1.setText(null);
					}
					catch(Exception en)
					{
						JOptionPane.showMessageDialog(null,e);
					}
			}
			
			
		});
		
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 15));
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Vaibhav\\Pictures\\Download\\421300-popular-full-size-hd-wallpaper-for-pc-1920x1080-for-iphone-5s.jpg"));
		lblNewLabel_5.setBounds(0, 0, 424, 409);
		panel_1.add(lblNewLabel_5);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 102));
		panel.setForeground(Color.MAGENTA);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(444, 132, 369, 409);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Student Login");
		lblNewLabel_3.setForeground(new Color(72, 209, 204));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(21, 86, 115, 37);
		panel.add(lblNewLabel_3);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(72, 209, 204));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(21, 190, 101, 37);
		panel.add(lblPassword);
		
		textFieldstd = new JTextField();
		textFieldstd.setBounds(191, 93, 129, 28);
		panel.add(textFieldstd);
		textFieldstd.setColumns(10);
		
		passwordFieldstd = new JPasswordField();
		passwordFieldstd.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					
					try {
						if(textFieldstd.getText().equals("student") && passwordFieldstd.getText().equals("1234"))
						{
						
							JOptionPane.showMessageDialog(null,"!!! Student Login Successfull !!!");
							SearchResult sr = new SearchResult();
							sr.createUI(); 
							
						}
						else
							JOptionPane.showMessageDialog(null,"wrong");
						passwordFieldstd.setText(null);
					}
					catch(Exception en)
					{
						JOptionPane.showMessageDialog(null,e);
					}
					
				}
				
				
			}
		});
		passwordFieldstd.setBounds(191, 196, 129, 30);
		panel.add(passwordFieldstd);
		
		JButton btnNewButton_1 = new JButton("Student Login");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(textFieldstd.getText().equals("student") && passwordFieldstd.getText().equals("1234"))
					{
					
						JOptionPane.showMessageDialog(null,"!!! Student Login Successfull !!!");
						SearchResult sr = new SearchResult();
						sr.createUI(); 
						
					}
					else
						JOptionPane.showMessageDialog(null,"wrong");
					passwordFieldstd.setText(null);
				}
				catch(Exception en)
				{
					JOptionPane.showMessageDialog(null,e);
				}
				
			}
		});
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBounds(98, 263, 155, 37);
		panel.add(btnNewButton_1);
		
		JLabel lblStudentLogin = new JLabel("Student Login");
		lblStudentLogin.setForeground(new Color(72, 209, 204));
		lblStudentLogin.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 17));
		lblStudentLogin.setBounds(138, 10, 164, 53);
		panel.add(lblStudentLogin);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Vaibhav\\Pictures\\Download\\421300-popular-full-size-hd-wallpaper-for-pc-1920x1080-for-iphone-5s.jpg"));
		lblNewLabel_6.setBounds(0, 0, 369, 409);
		panel.add(lblNewLabel_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBorder(new LineBorder(Color.RED, 4, true));
		panel_2.setBounds(23, 10, 773, 111);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblExamRecordSystem = new JLabel("EXAM RECORD SYSTEM");
		lblExamRecordSystem.setForeground(new Color(72, 209, 204));
		lblExamRecordSystem.setFont(new Font("Arial", Font.BOLD, 30));
		lblExamRecordSystem.setBounds(212, 35, 453, 52);
		panel_2.add(lblExamRecordSystem);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Vaibhav\\Pictures\\Download\\421300-popular-full-size-hd-wallpaper-for-pc-1920x1080-for-iphone-5s.jpg"));
		lblNewLabel_4.setBounds(0, 0, 836, 663);
		contentPane.add(lblNewLabel_4);
	}
}
