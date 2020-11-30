    package log1;
    import java.awt.*;  
    import java.awt.event.*;  
    import javax.swing.*;  
      
    class Quiz1 extends JFrame implements ActionListener  
    {  
       JLabel l;  
     JRadioButton jb[]=new JRadioButton[5];  
     JButton b1,b2;  
     ButtonGroup bg;  
     int count=0,current=0,x=1,y=1,now=0;  
     int m[]=new int[10];      
     Quiz1(String s)  
     {  
         super(s);  
        l=new JLabel();  
         add(l);  
         bg=new ButtonGroup();  
         for(int i=0;i<5;i++)  
         {  
             jb[i]=new JRadioButton();     
             add(jb[i]);  
             bg.add(jb[i]);  
         }  
         b1=new JButton("Next");  
         b2=new JButton("Bookmark");  
         b1.addActionListener(this);  
        b2.addActionListener(this);  
         add(b1);add(b2);  
         set();  
         l.setBounds(30,40,450,20);  
         jb[0].setBounds(50,80,220,20);  
       jb[1].setBounds(50,110,220,20);  
         jb[2].setBounds(50,140,220,20);  
        jb[3].setBounds(50,170,220,20);  
         b1.setBounds(100,240,220,30);  
         b2.setBounds(270,240,220,30);  
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
         setLayout(null);  
         setLocation(250,100);  
         setVisible(true);  
         setSize(600,350);  
     }  
    public void actionPerformed(ActionEvent e)  
     {  
         if(e.getSource()==b1)  
         {  
             if(check())  
                 count=count+1;  
             current++;  
             set();    
             if(current==9)  
             {  
                 b1.setEnabled(false);  
                 b2.setText("Result");  
             }  
         }  
         if(e.getActionCommand().equals("Bookmark"))  
         {  
             JButton bk=new JButton("Bookmark"+x);  
             bk.setBounds(480,20+30*x,100,30);  
             add(bk);  
             bk.addActionListener(this);  
             m[x]=current;  
             x++;  
             current++;  
             set();    
             if(current==9)  
                 b2.setText("Result");  
             setVisible(false);  
             setVisible(true);  
         }  
         for(int i=0,y=1;i<x;i++,y++)  
         {  
         if(e.getActionCommand().equals("Bookmark"+y))  
         {  
             if(check())  
                 count=count+1;  
             now=current;  
             current=m[y];  
             set();  
             ((JButton)e.getSource()).setEnabled(false);  
             current=now;  
         }  
         }  
       
         if(e.getActionCommand().equals("Result"))  
         {  
             if(check())  
                 count=count+1;  
             current++;  
             //System.out.println("correct ans="+count);  
             JOptionPane.showMessageDialog(this,"correct ans="+count);  
             Quiz1.class.getClass();
             
         }  
     }  
     void set()  
                   {  
                       jb[4].setSelected(true);  
                      if(current==0)  
                       {  
                           l.setText("Que1:  A collection of related data.?");  
                           jb[0].setText("Information");jb[1].setText("Valuable information");jb[2].setText("Database");jb[3].setText("Metadata");   
                       }  
                       if(current==1)  
                       {  
                           l.setText("Que2: DBMS manages the interaction between __________ and database.");  
                           jb[0].setText("Users");jb[1].setText("Clients");jb[2].setText("End Users");jb[3].setText("Stake Holders");  
                      }  
                       if(current==2)  
                       {  
                           l.setText("Que3: Which of the following is not involved in DBMS?");  
                           jb[0].setText("End Users");jb[1].setText("Data");jb[2].setText("Application Request");jb[3].setText("HTML");  
                       } 
                       if(current==3)  
                       {  
                           l.setText("Que4: Which of the following isn’t a level of abstraction?");  
                           jb[0].setText("physical");jb[1].setText("logical");jb[2].setText("user");jb[3].setText("view");  
                       }  
                       if(current==4)  
                       {  
                           l.setText("Que5: DBMS is a set of __________ to access the data.");  
                           jb[0].setText("Codes");jb[1].setText("Programs");jb[2].setText("Information");jb[3].setText("Metadata");  
                       }  
                       if(current==5)  
                       {  
                           l.setText("Que6: Object=_________+relationships.");  
                           jb[0].setText("data");jb[1].setText("attributes");jb[2].setText("entity");jb[3].setText("constraints");  
                       }  
                       if(current==6)  
                       {  
                           l.setText("Que7: A model developed by Hammer and Mc Leod in 1981. ");  
                           jb[0].setText("SDM");jb[1].setText("OODBM");jb[2].setText("DDM");  
                                       jb[3].setText("RDM");  
                       }  
                       if(current==7)  
                       {  
                           l.setText("Que8: IMS stands for?");  
                           jb[0].setText("Information Mastering System");jb[1].setText("Instruction Management System");jb[2].setText("Instruction Manipulating System");  
                                       jb[3].setText("Information Management System");         
                       }  
                       if(current==8)  
                       {  
                           l.setText("Que9:  A characteristic of an entity.");  
                           jb[0].setText("Relation");jb[1].setText("Attribute");jb[2].setText("Parameter");jb[3].setText("Constraint");  
                       }  
                       if(current==9)  
                       {  
                           l.setText("Que10: Database is generally __________");  
                           jb[0].setText("System-centered");jb[1].setText("User-centered");jb[2].setText("Company-centered");  
                                       jb[3].setText("Data-centered");  
                       }  
                       l.setBounds(30,40,450,20);  
                       for(int i=0,j=0;i<=90;i+=30,j++)  
                           jb[j].setBounds(50,80+i,200,20);  
                   }  
                   boolean check()  
                   {  
                       if(current==0)  
                           return(jb[2].isSelected());  
                       if(current==1)  
                           return(jb[2].isSelected());  
                       if(current==2)  
                           return(jb[3].isSelected());  
                       if(current==3)  
                           return(jb[2].isSelected());  
                       if(current==4)  
                           return(jb[1].isSelected());  
                       if(current==5)  
                           return(jb[2].isSelected());  
                       if(current==6)  
                           return(jb[0].isSelected());  
                       if(current==7)  
                           return(jb[3].isSelected());  
                       if(current==8)  
                           return(jb[1].isSelected());  
                       if(current==9)  
                           return(jb[1].isSelected());  
                       return false;  
                   }  
                   public static void main(String s[])  
                   {  
                       new Quiz1("Online Test Of DBMS");  
                   }  

               }  
