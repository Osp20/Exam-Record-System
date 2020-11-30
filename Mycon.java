package log1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import com.mysql.jdbc.Statement;
import com.sun.net.httpserver.Authenticator.Result;

public class Mycon extends JFrame {


	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stdlog?useSSL=false","root","root123");  
					//here sonoo is database name, root is username and password  
					JOptionPane.showMessageDialog(null, "!!!! Connection Successful !!!! --->  "+con);
					con.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
