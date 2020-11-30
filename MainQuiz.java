package log1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class MainQuiz extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainQuiz frameQ = new MainQuiz();
					frameQ.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainQuiz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 863, 717);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 64, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelmain = new JPanel();
		panelmain.setForeground(Color.BLUE);
		panelmain.setBackground(Color.BLACK);
		panelmain.setBounds(12, 13, 827, 657);
		contentPane.add(panelmain);
		panelmain.setLayout(null);
		
		JButton btnqDBMS = new JButton("DBMS");
		btnqDBMS.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnqDBMS.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				
				btnqDBMS.setBackground(Color.GREEN);
			}
		});
		btnqDBMS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				btnqDBMS.setBackground(Color.GREEN);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				
				btnqDBMS.setBackground(Color.white);
			}
		});
		
		
		

		btnqDBMS.setBackground(Color.WHITE);
		
		btnqDBMS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 new Quiz1("Online Test Of Java");
				
			}
		});
		btnqDBMS.setBounds(41, 56, 319, 106);
		panelmain.add(btnqDBMS);
		
		JButton btnqCN = new JButton("CN");
		btnqCN.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnqCN.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				
				btnqCN.setBackground(Color.GREEN);
			}
		});
		btnqCN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				btnqCN.setBackground(Color.GREEN);
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				
				btnqCN.setBackground(Color.WHITE);
			}
		});
		btnqCN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 new Quiz_CN("Online Test Of Java");
			}
		});
		btnqCN.setBounds(452, 56, 319, 106);
		panelmain.add(btnqCN);
		
		JButton btnqTOC = new JButton("TOC");
		btnqTOC.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnqTOC.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				
				btnqTOC.setBackground(Color.GREEN);
			}
		});
		btnqTOC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				btnqTOC.setBackground(Color.GREEN);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				
				btnqTOC.setBackground(Color.WHITE);
			}
		});
		btnqTOC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 new Quiz_TOC("Online Test Of Java");
			}
			
		});
		btnqTOC.setBounds(41, 398, 319, 106);
		panelmain.add(btnqTOC);
		
		JButton btnqSEPM = new JButton("SE&PM");
		btnqSEPM.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnqSEPM.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				
				btnqSEPM.setBackground(Color.GREEN);
			}
		});
		btnqSEPM.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				btnqSEPM.setBackground(Color.GREEN);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				
				btnqSEPM.setBackground(Color.WHITE);
			}
		});
		btnqSEPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 new Quiz_SEPM("Online Test Of Java");
			}
		});
		btnqSEPM.setBounds(452, 398, 319, 106);
		panelmain.add(btnqSEPM);
		
		JButton btnqISEE = new JButton("ISEE");
		btnqISEE.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnqISEE.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				
				btnqISEE.setBackground(Color.GREEN);
			}
		});
		btnqISEE.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				btnqISEE.setBackground(Color.GREEN);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				
				btnqISEE.setBackground(Color.WHITE);
			}
		});
		btnqISEE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 new Quiz_ISEE("Online Test Of Java");
			}
		});
		btnqISEE.setBounds(249, 227, 319, 106);
		panelmain.add(btnqISEE);
		
		JButton btnback = new JButton("BACK");
		btnback.setBackground(new Color(255, 99, 71));
		btnback.setBounds(10, 611, 127, 36);
		panelmain.add(btnback);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBackground(new Color(255, 99, 71));
		btnExit.setBounds(690, 611, 127, 36);
		panelmain.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Vaibhav\\Pictures\\Poster\\Backgrounds\\Princegraphics45.jpg"));
		lblNewLabel.setBounds(0, 0, 827, 657);
		panelmain.add(lblNewLabel);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
			}
		});
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				SearchResult sr = new SearchResult();
				sr.createUI();
				
			}
		});
	}
}
