package log1;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.StatementImpl;
import javax.swing.JScrollPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class MainRec extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textdbm;
	private JTextField texttoc;
	private JTextField textsepm;
	private JTextField textisee;
	private JTextField textcn;
	private JTextField textnm;
	private JTextField textsn;
	private JTextField textmn;
	private JTextField texttm;
	private JTextField textper;
	private JPasswordField passwordField;
	private JTextField textcrc;
	private JFrame truncframe;

	
	String driverName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/stdlog";
	String userName = "root";
	String password = "root123";
	private JTextField textsgpa;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainRec framem1 = new MainRec();
					framem1.setTitle("Exam Record System");
					framem1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainRec() {
		setTitle("EXAM RECORD SYSTEM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1102, 748);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 51));
		contentPane.setBorder(new LineBorder(new Color(102, 51, 153), 3, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(565, 57, 466, 513);
		contentPane.add(scrollPane);
		
		JTextArea txtarea = new JTextArea();
		txtarea.setFont(new Font("Arial Black", Font.PLAIN, 13));
		txtarea.setBackground(new Color(255, 255, 224));
		scrollPane.setViewportView(txtarea);
		
		JLabel label = new JLabel("Student Name : ");
		label.setForeground(new Color(0, 0, 0));
		label.setBounds(10, 63, 93, 13);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Seat Number : ");
		label_1.setBounds(10, 103, 93, 13);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Mother's Name : ");
		label_2.setBounds(10, 138, 103, 13);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("SUBJECTS");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_3.setBounds(205, 215, 103, 37);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("DBMS");
		label_4.setBounds(10, 265, 46, 13);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("TOC");
		label_5.setBounds(10, 312, 46, 13);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("SE&PM");
		label_6.setBounds(10, 355, 46, 13);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("ISEE");
		label_7.setBounds(10, 401, 46, 13);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("CN");
		label_8.setBounds(10, 450, 46, 13);
		contentPane.add(label_8);
		
		JButton buttonadds = new JButton("ADD");
		buttonadds.setBackground(new Color(0, 0, 139));
		buttonadds.setForeground(new Color(255, 215, 0));
		buttonadds.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection=DriverManager.getConnection(url,"root","root123");
					String query="insert into rec2 values(?,?,?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement pat=(PreparedStatement) connection.prepareStatement(query);
					pat.setString(1, textnm.getText());
					pat.setString(2, textsn.getText());
					pat.setString(3, textmn.getText());
					pat.setString(4, textcrc.getText());
					pat.setString(5, textdbm.getText());
					pat.setString(6, texttoc.getText());
					pat.setString(7, textsepm.getText());
					pat.setString(8, textisee.getText());
					pat.setString(9, textcn.getText());
					pat.setString(10, texttm.getText());
					pat.setString(11, textsgpa.getText());
					pat.setString(12, textper.getText());
					
					pat.execute();
					JOptionPane.showMessageDialog(null,"Data Added");
				}catch(ClassNotFoundException | SQLException e1) {
					JOptionPane.showMessageDialog(null,"Data Duplicated");
					e1.printStackTrace();
					
				}
				
				
			}
		});
		buttonadds.setBounds(10, 627, 85, 21);
		contentPane.add(buttonadds);
		
		JButton button_1 = new JButton("TOTAL");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int db=Integer.parseInt(textdbm.getText());
				int tc=Integer.parseInt(texttoc.getText());
				int sep=Integer.parseInt(textsepm.getText());
				int ise=Integer.parseInt(textisee.getText());
				int cn=Integer.parseInt(textcn.getText());
				
				//sum total
				String ans=String.valueOf(db+tc+sep+ise+cn);
				texttm.setText(ans);
				// per
				int answ=Integer.parseInt(ans);
				float per=((answ*100))/500;
				String answerp=String.valueOf(per);
				textper.setText(answerp);
				
				//sgpa total
				int anss=Integer.parseInt(ans);
				float sga=(((anss*8.08f)/500));
				//float sga=(((anss*100)/500))/8.08f;
				String answer=String.valueOf(sga);
				textsgpa.setText(answer);
				
				
				
				
				
				
			}
		});
		button_1.setForeground(new Color(255, 215, 0));
		button_1.setBackground(new Color(0, 0, 139));
		button_1.setBounds(131, 627, 85, 21);
		contentPane.add(button_1);
		
		JButton btndisp = new JButton("DISPLAY");
		btndisp.setForeground(new Color(255, 215, 0));
		btndisp.setBackground(new Color(0, 0, 139));
		btndisp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtarea.append("\n=====================================================\n"
						+ "\t            STUDENT RESULT RECORD\n"
						+ "=====================================================\n"
					    + "\n\tName:\t\t" + textnm.getText()
						+ "\n\tSeat No.:\t\t" + textsn.getText()
						+ "\n\tMother Name:\t\t" + textmn.getText()
						+ "\n\tCOURSE:\t\t" + textcrc.getText()
						+ "\n=====================================================\n"
						+ "                                         SUBJECT MARKS\n"
						+ "\n\tDBMS:\t\t   " + textdbm.getText()
						+ "\n\tTOC:\t\t   " + texttoc.getText()
						+ "\n\tSEPM:\t\t   " + textsepm.getText()
						+ "\n\tISEE:\t\t   " + textisee.getText()
						+ "\n\tCN:\t\t   " + textcn.getText()
						+ "\n=====================================================\n"
						+ "\n\tTOTAL MARKS:\t   " + texttm.getText()
						+ "\n\tSGPA:\t\t   " + textsgpa.getText()
						+ "\n\tPERCENTAGE:\t\t   " + textper.getText()+"\n"
						+ "\n\t\t ***\n");
				
			}
		});
		btndisp.setBounds(258, 627, 103, 21);
		contentPane.add(btndisp);
		
		JButton button_3 = new JButton("CLEAR");
		button_3.setForeground(new Color(255, 215, 0));
		button_3.setBackground(new Color(0, 0, 139));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtarea.setText(null);
				textnm.setText(null);
				textsn.setText(null);
				textmn.setText(null);
				textcrc.setText(null);
				textdbm.setText(null);
				texttoc.setText(null);
				textsepm.setText(null);
				textisee.setText(null);
				texttm.setText(null);
				textper.setText(null);
				textcn.setText(null);
				textsgpa.setText(null);
				
			}
		});
		button_3.setBounds(258, 658, 103, 27);
		contentPane.add(button_3);
		
		JButton btnprint = new JButton("PRINT");
		btnprint.setForeground(new Color(255, 215, 0));
		btnprint.setBackground(new Color(0, 0, 139));
		btnprint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					txtarea.print();
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnprint.setBounds(757, 596, 93, 27);
		contentPane.add(btnprint);
		
		JButton button_5 = new JButton("EXIT");
		button_5.setForeground(new Color(255, 215, 0));
		button_5.setBackground(new Color(0, 0, 139));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_5.setBounds(985, 674, 93, 27);
		contentPane.add(button_5);
		
		textdbm = new JTextField();
		textdbm.setHorizontalAlignment(SwingConstants.CENTER);
		textdbm.setBackground(new Color(255, 255, 224));
		textdbm.setColumns(10);
		textdbm.setBounds(120, 262, 96, 19);
		contentPane.add(textdbm);
		
		texttoc = new JTextField();
		texttoc.setHorizontalAlignment(SwingConstants.CENTER);
		texttoc.setBackground(new Color(255, 255, 224));
		texttoc.setColumns(10);
		texttoc.setBounds(120, 309, 96, 19);
		contentPane.add(texttoc);
		
		textsepm = new JTextField();
		textsepm.setHorizontalAlignment(SwingConstants.CENTER);
		textsepm.setBackground(new Color(255, 255, 224));
		textsepm.setColumns(10);
		textsepm.setBounds(120, 352, 96, 19);
		contentPane.add(textsepm);
		
		textisee = new JTextField();
		textisee.setHorizontalAlignment(SwingConstants.CENTER);
		textisee.setBackground(new Color(255, 255, 224));
		textisee.setColumns(10);
		textisee.setBounds(120, 398, 96, 19);
		contentPane.add(textisee);
		
		textcn = new JTextField();
		textcn.setHorizontalAlignment(SwingConstants.CENTER);
		textcn.setBackground(new Color(255, 255, 224));
		textcn.setColumns(10);
		textcn.setBounds(120, 447, 96, 19);
		contentPane.add(textcn);
		
		textnm = new JTextField();
		textnm.setBackground(new Color(255, 255, 224));
		textnm.setColumns(10);
		textnm.setBounds(145, 63, 340, 21);
		contentPane.add(textnm);
		
		textsn = new JTextField();
		textsn.setBackground(new Color(255, 255, 224));
		textsn.setColumns(10);
		textsn.setBounds(145, 99, 340, 21);
		contentPane.add(textsn);
		
		textmn = new JTextField();
		textmn.setBackground(new Color(255, 255, 224));
		textmn.setColumns(10);
		textmn.setBounds(145, 134, 340, 21);
		contentPane.add(textmn);
		
		JLabel lblNewLabel = new JLabel("PERCENTAGE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setBounds(301, 533, 85, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TOTAL MARKS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setBounds(34, 521, 93, 36);
		contentPane.add(lblNewLabel_1);
		
		texttm = new JTextField();
		texttm.setFont(new Font("Tahoma", Font.BOLD, 10));
		texttm.setForeground(new Color(25, 25, 112));
		texttm.setBackground(Color.LIGHT_GRAY);
		texttm.setBounds(145, 527, 96, 25);
		contentPane.add(texttm);
		texttm.setColumns(10);
		
		textper = new JTextField();
		textper.setFont(new Font("Tahoma", Font.BOLD, 10));
		textper.setForeground(new Color(25, 25, 112));
		textper.setBackground(Color.LIGHT_GRAY);
		textper.setBounds(414, 526, 96, 28);
		contentPane.add(textper);
		textper.setColumns(10);
		
		JButton btnsrc = new JButton("Teacher's login");
		btnsrc.setForeground(new Color(255, 215, 0));
		btnsrc.setBackground(new Color(0, 0, 139));
		btnsrc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(passwordField.getText().equals("admin"))
					{
						JFrame frame3 = new JFrame("SQL TABLE DATABASE"); 
					    Sqtable stl=new Sqtable();
						stl.main(null);
						passwordField.setText(null);
						
					}
					else
						JOptionPane.showMessageDialog(null,"access denied");
					passwordField.setText(null);
				}
				catch(Exception en)
				{
					JOptionPane.showMessageDialog(null,e);
				}
		}
				
			
				
		});
		btnsrc.setBounds(897, 13, 134, 21);
		contentPane.add(btnsrc);
		
		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					try {
						if(passwordField.getText().equals("admin"))
						{
							JFrame frame3 = new JFrame("SQL TABLE DATABASE"); 
						    Sqtable stl=new Sqtable();
							stl.main(null);
							
						}
						else
							JOptionPane.showMessageDialog(null,"access denied");
					}
					catch(Exception en)
					{
						JOptionPane.showMessageDialog(null,e);
					}
				}
				
				
			}
		});
		passwordField.setBackground(new Color(245, 245, 220));
		passwordField.setBounds(719, 14, 153, 19);
		contentPane.add(passwordField);
		
		JLabel lblCourse = new JLabel("COURSE");
		lblCourse.setBounds(10, 174, 103, 13);
		contentPane.add(lblCourse);
		
		textcrc = new JTextField();
		textcrc.setBackground(new Color(255, 255, 224));
		textcrc.setColumns(10);
		textcrc.setBounds(145, 171, 340, 21);
		contentPane.add(textcrc);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setForeground(new Color(255, 215, 0));
		btnNewButton.setBackground(new Color(0, 0, 139));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login frame = new Login();
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
			}
		});
		btnNewButton.setBounds(10, 10, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnTruncate = new JButton("TRUNCATE");
		btnTruncate.setForeground(new Color(255, 215, 0));
		btnTruncate.setBackground(new Color(0, 0, 139));
		btnTruncate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection=DriverManager.getConnection(url,"root","root123");
					
					int yn=JOptionPane.showConfirmDialog(truncframe,"Do you want to clear All","confirm",JOptionPane.YES_NO_OPTION);
					if(yn==0)
					{
					String query="truncate table rec2";
					PreparedStatement pat=(PreparedStatement) connection.prepareStatement(query);		
					pat.execute();
					JOptionPane.showMessageDialog(null," !!! ALL RECORD CLEARED !!! ");
					}
					
						
				}catch(ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
			
			}
		});
		btnTruncate.setBounds(529, 627, 118, 21);
		contentPane.add(btnTruncate);
		
		JLabel lblsgpa = new JLabel("SGPA");
		lblsgpa.setHorizontalAlignment(SwingConstants.CENTER);
		lblsgpa.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblsgpa.setBounds(390, 293, 74, 46);
		contentPane.add(lblsgpa);
		
		textsgpa = new JTextField();
		textsgpa.setHorizontalAlignment(SwingConstants.CENTER);
		textsgpa.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 19));
		textsgpa.setBackground(new Color(230, 230, 250));
		textsgpa.setBounds(359, 352, 147, 65);
		contentPane.add(textsgpa);
		textsgpa.setColumns(10);
		
		JButton btndel = new JButton("DELETE");
		btndel.setBackground(new Color(0, 0, 128));
		btndel.setForeground(Color.YELLOW);
		btndel.setFont(new Font("Tahoma", Font.BOLD, 10));
		btndel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection=DriverManager.getConnection(url,"root","root123");
					String query="delete from rec2 where Name='"+textnm.getText()+"' and Seat_no='"+textsn.getText()+"'";
					PreparedStatement pat=(PreparedStatement) connection.prepareStatement(query);		
					pat.execute();
					JOptionPane.showMessageDialog(null," !!! RECORD REMOVED !!! ");
				}catch(ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
					
				}
				
				
			}
		});
		btndel.setBounds(396, 627, 110, 21);
		contentPane.add(btndel);
		
		JButton btnltr = new JButton("LGenerate");
		btnltr.setBackground(new Color(230, 230, 250));
		btnltr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				
				txtarea.append("\n\t\t\tFrom,\n\t\t\tG.H.R.I.E.T, \n\t\t\tWagholi,\n\t\t\tPune - 412207"
						+ "\n    G.H.R.I.E.T, \n    Wagholi,\n    Pune - 412207"
						+ "\n\n               Subject : Informing Students Academic Activity"
						+ "\n\n    Dear Parents/Guardian,"
						+ "\n          My name is Mr.GANESH KADAM, and I am class coordinater"
						+ "\n     of TE "+textcrc.getText()+"  this letter is to inform you that your Son/Daughter \n     " +textnm.getText()+" got  "+textper.getText()+" % and provide you the academic \n      result of your ward is "+textsgpa.getText()
						+ " SGPA \n\n     I request you to kindly let me know that your ward is attending\n     lectures and practicals regularly."
						+ "\n\n"
						+ "\n           Thank you so much for your time and let me know if you "
						+ "\n      have any questions."
						+ "\n\n          Yours Faithfully,"
						+ "\n       Mr.GANESH KADAM "
						+ "\n"
						
					);
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnltr.setBounds(930, 573, 103, 37);
		contentPane.add(btnltr);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Vaibhav\\Pictures\\Poster\\Backgrounds\\Princegraphics25.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1088, 711);
		contentPane.add(lblNewLabel_2);
	}
}