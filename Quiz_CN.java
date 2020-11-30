    package log1;
    import java.awt.*;  
    import java.awt.event.*;  
    import javax.swing.*;  
      
    class Quiz_CN extends JFrame implements ActionListener  
    {  
       JLabel l;  
     JRadioButton jb[]=new JRadioButton[5];  
     JButton b1,b2;  
     ButtonGroup bg;  
     int count=0,current=0,x=1,y=1,now=0;  
     int m[]=new int[10];      
     Quiz_CN(String s)  
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
         jb[0].setBounds(50,80,100,20);  
       jb[1].setBounds(50,110,100,20);  
         jb[2].setBounds(50,140,100,20);  
        jb[3].setBounds(50,170,100,20);  
         b1.setBounds(100,240,100,30);  
         b2.setBounds(270,240,100,30);  
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
             Quiz_CN.class.getClass();
             
         }  
     }  
     void set()  
                   {  
                       jb[4].setSelected(true);  
                      if(current==0)  
                       {  
                           l.setText("Que1: The protocol data unit(PDU) for the application layer in the Internet stack is\r\n");  
                           jb[0].setText("Segment");jb[1].setText("Frame");jb[2].setText("Datagram");jb[3].setText("Message");   
                       }  
                       if(current==1)  
                       {  
                           l.setText("Que2: Which of the following transport layer protocolss is used to support electronic mail?");  
                           jb[0].setText("SMTP");jb[1].setText("IP");jb[2].setText("TCP");jb[3].setText("UDP");  
                      }  
                       if(current==2)  
                       {  
                           l.setText("Que3: In the IPv4 addressing format, the number of networks allowed under Class C addresses is");  
                           jb[0].setText("2^14");jb[1].setText("2^21");jb[2].setText("2^7");jb[3].setText("2^24");  
                       } 
                       if(current==3)  
                       {  
                           l.setText("Que4: Elapsed time between an inquiry and a response is called.");  
                           jb[0].setText("Transit Time");jb[1].setText("Delay Time");jb[2].setText("Processing Time");jb[3].setText("Response time");  
                       }  
                       if(current==4)  
                       {  
                           l.setText("Que5: Connection in which multi devices share a single link is called");  
                           jb[0].setText("Point to point");jb[1].setText("Multipoint");jb[2].setText("Time Shared");jb[3].setText("Spatially Shared");  
                       }  
                       if(current==5)  
                       {  
                           l.setText("Que6: National ISP networks are connected to one another by private switching stations called");  
                           jb[0].setText("Network Access Points");jb[1].setText("Peering Points");jb[2].setText("National ISP");jb[3].setText("Regional ISP");  
                       }  
                       if(current==6)  
                       {  
                           l.setText("Que7:  A communication path way that transfers data from one point to another is called ");  
                           jb[0].setText("Node");jb[1].setText("Link");jb[2].setText("Medium");  
                                       jb[3].setText("Topology");  
                       }  
                       if(current==7)  
                       {  
                           l.setText("Que8: Multipoint topology is");  
                           jb[0].setText("Bus");jb[1].setText("Star");jb[2].setText("Mesh");  
                                       jb[3].setText("Ring");         
                       }  
                       if(current==8)  
                       {  
                           l.setText("Que9: Which topology covers security, robust and eliminating traffic factor?");  
                           jb[0].setText("Mesh");jb[1].setText("Ring");jb[2].setText("Bus");jb[3].setText("Star");  
                       }  
                       if(current==9)  
                       {  
                           l.setText("Que10: Combination of two or more networks are called");  
                           jb[0].setText("Internetwork");jb[1].setText("WAN");jb[2].setText("MAN");  
                                       jb[3].setText("LAN");  
                       }  
                       l.setBounds(30,40,450,20);  
                       for(int i=0,j=0;i<=90;i+=30,j++)  
                           jb[j].setBounds(50,80+i,200,20);  
                   }  
                   boolean check()  
                   {  
                       if(current==0)  
                           return(jb[3].isSelected());  
                       if(current==1)  
                           return(jb[2].isSelected());  
                       if(current==2)  
                           return(jb[1].isSelected());  
                       if(current==3)  
                           return(jb[3].isSelected());  
                       if(current==4)  
                           return(jb[2].isSelected());  
                       if(current==5)  
                           return(jb[2].isSelected());  
                       if(current==6)  
                           return(jb[1].isSelected());  
                       if(current==7)  
                           return(jb[0].isSelected());  
                       if(current==8)  
                           return(jb[0].isSelected());  
                       if(current==9)  
                           return(jb[0].isSelected());  
                       return false;  
                   }  
                   public static void main(String s[])  
                   {  
                       new Quiz_CN("Online Test Of Computer Networks");  
                   }  

               }  
