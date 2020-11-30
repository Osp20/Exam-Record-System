package log1;
import java.awt.BorderLayout;
import javax.swing.*;
import java.sql.*;
import java.util.Vector;

public class Sqtable{
public static void main(String[] args){
Connection con = null;
Statement st = null; 
 ResultSet rs = null; 
 String s;


//connect your app to mysql database 

try{ con = DriverManager.getConnection("jdbc:mysql://localhost/stdlog","root","root123");
 st = con.createStatement();
 s = "select * from rec2"; 
 rs = st.executeQuery(s);
 ResultSetMetaData rsmt = rs.getMetaData(); 
 int c = rsmt.getColumnCount();
 Vector column = new Vector(c);

 for(int i = 1; i <= c; i++) {
 column.add(rsmt.getColumnName(i)); 
 } 

 Vector data = new Vector(); 
 Vector row = new Vector(); 

 while(rs.next()) { 
 row = new Vector(c); 

 for(int i = 1; i <= c; i++){
 row.add(rs.getString(i)); 
 } 

 data.add(row); 
 } 

 JFrame frame3 = new JFrame("SQL TABLE DATABASE"); 
 frame3.setSize(800,800); 
 frame3.setLocationRelativeTo(null); 
 //frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 JPanel panel = new JPanel(); 
 JTable table = new JTable(data,column);
 JScrollPane jsp = new JScrollPane(table); 
 panel.setLayout(new BorderLayout()); 
 panel.add(jsp,BorderLayout.CENTER); 
 frame3.setContentPane(panel); 
 frame3.setVisible(true); 
 frame3.setLocationRelativeTo(null);
 
 }catch(Exception e){ JOptionPane.showMessageDialog(null, "ERROR"); }
finally{
 try{ st.close(); 
 rs.close(); 
 con.close(); 
 }
catch(Exception e){ JOptionPane.showMessageDialog(null, "ERROR CLOSE"); 
 } 
 } 
 }
 } 
