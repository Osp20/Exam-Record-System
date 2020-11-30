    package log1;
    import java.awt.*;  
    import java.awt.event.*;  
    import javax.swing.*;  
      
    class Quiz_SEPM extends JFrame implements ActionListener  
    {  
       JLabel l;  
     JRadioButton jb[]=new JRadioButton[5];  
     JButton b1,b2;  
     ButtonGroup bg;  
     int count=0,current=0,x=1,y=1,now=0;  
     int m[]=new int[10];      
     Quiz_SEPM(String s)  
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
             Quiz_SEPM.class.getClass();
             
         }  
     }  
     void set()  
                   {  
                       jb[4].setSelected(true);  
                       if(current==0)  
                       {  
                           l.setText("Que1: A client server computer program in which client runs in a web browser is termed as");  
                           jb[0].setText("web application");jb[1].setText("application software");jb[2].setText("product line software");jb[3].setText("embedded software");   
                       }  
                       if(current==1)  
                       {  
                           l.setText("Que2: Objexis team portal is developed by");  
                           jb[0].setText("Team Corporation");jb[1].setText("Objexis Corporation");jb[2].setText("Corel Corporation");jb[3].setText("IEEE Corporation");  
                      }  
                       if(current==2)  
                       {  
                           l.setText("Que3: First part of generic deployment activity is");  
                           jb[0].setText("transition");jb[1].setText("construction");jb[2].setText("elaboration");jb[3].setText("inception");  
                       } 
                       if(current==3)  
                       {  
                           l.setText("Que4: Sophisticated process management can be done by");  
                           jb[0].setText("artificial Intelligence software");jb[1].setText("web applications");jb[2].setText("system software");jb[3].setText("application software");  
                       }  
                       if(current==4)  
                       {  
                           l.setText("Que5: PSP process model defines framework activities that are");  
                           jb[0].setText("2");jb[1].setText("3");jb[2].setText("4");jb[3].setText("5");  
                       }  
                       if(current==5)  
                       {  
                           l.setText("Que6: Software process are adopted by");  
                           jb[0].setText("software engineers");jb[1].setText("telecommunication engineers");jb[2].setText("mechanical engineers");jb[3].setText("civil engineers");  
                       }  
                       if(current==6)  
                       {  
                           l.setText("Que7: Phase that delivers software increment and assesses work products that are produced as end users work with software is");  
                           jb[0].setText("transition");jb[1].setText("construction");jb[2].setText("elaboration");  
                                       jb[3].setText("inception");  
                       }  
                       if(current==7)  
                       {  
                           l.setText("Que8: Collection of use cases describe how outside actors interact with system and gain value from it is");  
                           jb[0].setText("use case model");jb[1].setText("use real model");jb[2].setText("developer model");  
                                       jb[3].setText("rational model");         
                       }  
                       if(current==8)  
                       {  
                           l.setText("Que9: Foundation of software engineering is");  
                           jb[0].setText("source layer");jb[1].setText("process layer");jb[2].setText("single layer");jb[3].setText("cell layer");  
                       }  
                       if(current==9)  
                       {  
                           l.setText("Que10: Problem pr a particular statement to be solved by pattern is described by");  
                           jb[0].setText("initial contex");jb[1].setText("solution");jb[2].setText("problem");  
                                       jb[3].setText("resulting context");  
                       }  
                       l.setBounds(30,40,450,20);  
                       for(int i=0,j=0;i<=90;i+=30,j++)  
                           jb[j].setBounds(50,80+i,200,20);  
                   }  
                   boolean check()  
                   {  
                	   if(current==0)  
                           return(jb[0].isSelected());  
                       if(current==1)  
                           return(jb[1].isSelected());  
                       if(current==2)  
                           return(jb[0].isSelected());  
                       if(current==3)  
                           return(jb[2].isSelected());  
                       if(current==4)  
                           return(jb[3].isSelected());  
                       if(current==5)  
                           return(jb[0].isSelected());  
                       if(current==6)  
                           return(jb[0].isSelected());  
                       if(current==7)  
                           return(jb[0].isSelected());  
                       if(current==8)  
                           return(jb[1].isSelected());  
                       if(current==9)  
                           return(jb[2].isSelected());  
                       return false;  
                   }  
                   public static void main(String s[])  
                   {  
                       new Quiz_SEPM("Online Test Of SEPM");  
                   }  

               }  
