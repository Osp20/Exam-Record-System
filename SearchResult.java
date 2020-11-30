package log1;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class SearchResult implements ActionListener{
JFrame frame, frame1;
JTextField textbox,textboxm;
JLabel label,label2;
JButton button,bq1;
JPanel panel;
static JTable table;

String driverName = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/stdlog";
String userName = "root";
String password = "root123";
String[] columnNames = {"Name", "Seat_No", "Mothers_Name", "Course", "DBMS", "TOC", "SEPM", "ISEE", "CN", "TOTAL","SGPA", "Percentage"};

public void createUI()
{
frame = new JFrame("Database Search Result");
//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(null);
textbox = new JTextField();
textbox.setBounds(150,30,150,20); 
label = new JLabel("Enter Seat No. :");
label.setBounds(10, 30, 100, 20);

label2 = new JLabel("Enter Mother Name :"); // new label for mt
label2.setBounds(10, 70, 120, 20);

textboxm = new JTextField();
textboxm.setBounds(150,70,150,20); 

button = new JButton("search");
button.setBounds(120,130,150,20);
button.addActionListener(this);

bq1 = new JButton("Take a Quiz");
bq1.setBounds(120,180,150,20);
bq1.addActionListener(this);

frame.add(textbox);
frame.add(label);
frame.add(label2);
frame.add(textboxm);
frame.add(button);
frame.add(bq1);
frame.setVisible(true);
frame.setSize(400,400); 
frame.setLocationRelativeTo(null);
} 

public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==button) {
		
		button = (JButton)ae.getSource();
		System.out.println("Showing Table Data.......");
		showTableData(); 

		
	}
	

if(ae.getSource()==bq1) {
	
	frame.dispose();
	
	MainQuiz frameQ = new MainQuiz();
	frameQ.setLocationRelativeTo(null);
	frameQ.setVisible(true);
	
}
	
}




public void showTableData()
{

frame1 = new JFrame("Database Search Result");
//frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame1.setLayout(new BorderLayout()); 
//TableModel tm = new TableModel();
DefaultTableModel model = new DefaultTableModel();
model.setColumnIdentifiers(columnNames);
//DefaultTableModel model = new DefaultTableModel(tm.getData1(), tm.getColumnNames()); 
//table = new JTable(model);
table = new JTable();
table.setModel(model); 
table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
table.setFillsViewportHeight(true);
JScrollPane scroll = new JScrollPane(table);
scroll.setHorizontalScrollBarPolicy(
JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
scroll.setVerticalScrollBarPolicy(
JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
String textvalue = textbox.getText();
String textvalue2 =textboxm.getText();

String name= "";
String seatno= "";
String mname= "";
String crc= "";

String dbm= "";
String tc= "";
String sepms= "";
String ise= "";

String cnn= "";
String tt= "";
String sgp= "";
String per= "";

try
{ 
Class.forName(driverName); 
Connection con = DriverManager.getConnection(url, userName, password);
String sql="select * from rec2 where Seat_no='"+textvalue+"' and Mothers_Name='"+textvalue2+"'";
PreparedStatement ps = con.prepareStatement(sql);

ResultSet rs = ps.executeQuery();
int i =0;
if(rs.next())
{
name = rs.getString("Name");
seatno = rs.getString("Seat_No");
mname = rs.getString("Mothers_Name");
crc = rs.getString("Course"); 
dbm = rs.getString("DBMS");
tc = rs.getString("TOC");
sepms = rs.getString("SEPM");
ise = rs.getString("ISEE"); 
cnn = rs.getString("CN");
tt = rs.getString("TOTAL");
sgp = rs.getString("SGPA");
per = rs.getString("Percentage");





model.addRow(new Object[]{name,seatno,mname,crc,dbm,tc,sepms,ise,cnn,tt,sgp,per});
i++; 
}
if(i <1)
{
JOptionPane.showMessageDialog(null, "No Record Found","Error",
JOptionPane.ERROR_MESSAGE);
}
if(i ==1)
{
System.out.println(i+" Record Found");
}
else
{
System.out.println(i+" Records Found");
}
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
JOptionPane.ERROR_MESSAGE);
}
frame1.add(scroll);
frame1.setVisible(true);
frame1.setSize(800,400);
frame1.setLocationRelativeTo(null);
}

public static void main(String args[])
{
SearchResult sr = new SearchResult();
sr.createUI();
}
}