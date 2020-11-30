    package log1;
    import java.awt.*;  
    import java.awt.event.*;  
    import javax.swing.*;  
      
    class Quiz_TOC extends JFrame implements ActionListener  
    {  
       JLabel l;  
     JRadioButton jb[]=new JRadioButton[5];  
     JButton b1,b2;  
     ButtonGroup bg;  
     int count=0,current=0,x=1,y=1,now=0;  
     int m[]=new int[10];      
     Quiz_TOC(String s)  
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
             Quiz_TOC.class.getClass();
             
         }  
     }  
     void set()  
                   {  
                       jb[4].setSelected(true);  
                      if(current==0)  
                       {  
                           l.setText("Que1: A language is regular if and only if");  
                           jb[0].setText("accepted by DFA");jb[1].setText("accepted by PDA");jb[2].setText("accepted by LBA");jb[3].setText("accepted by Turing machine");   
                       }  
                       if(current==1)  
                       {  
                           l.setText("Que2: Regular expression are");  
                           jb[0].setText("Type 0 language");jb[1].setText("Type 1 language");jb[2].setText("Type 2 language");jb[3].setText("Type 3 language");  
                      }  
                       if(current==2)  
                       {  
                           l.setText("Que3: Which of the following are not quantifiers?");  
                           jb[0].setText("swingKleene plus +");jb[1].setText("Kleene star *");jb[2].setText("Question mark ?");jb[3].setText("None of the mentioned");  
                       } 
                       if(current==3)  
                       {  
                           l.setText("Que4: Which of the following languages have built in regexps support?");  
                           jb[0].setText("Perl");jb[1].setText("Java");jb[2].setText("Python");jb[3].setText("C++");  
                       }  
                       if(current==4)  
                       {  
                           l.setText("Que5: The following is/are an approach to process a regexp:");  
                           jb[0].setText("Contruction of NFA and subsequently, a DFA.");jb[1].setText("Thompson’s Contruction Algorithm");jb[2].setText("Both (a) and (b)");jb[3].setText("None of the mentioned");  
                       }  
                       if(current==5)  
                       {  
                           l.setText("Que6: Regular expressions are closed under");  
                           jb[0].setText("Union");jb[1].setText("Intersection");jb[2].setText("Kleen star");jb[3].setText("All of the mentioned");  
                       }  
                       if(current==6)  
                       {  
                           l.setText("Que7: L and ~L are recursive enumerable then L is ");  
                           jb[0].setText("Regular");jb[1].setText("Context free");jb[2].setText("Context sensitive");  
                                       jb[3].setText("Recursive");  
                       }  
                       if(current==7)  
                       {  
                           l.setText("Que8: Which of the following is true?");  
                           jb[0].setText("Every subset of a regular set is regular");jb[1].setText("Every finite subset of non-regular set is regular");jb[2].setText("The union of two non regular set is not regular");  
                                       jb[3].setText("Infinite union of finite set is regular");         
                       }  
                       if(current==8)  
                       {  
                           l.setText("Que9: Which of the following is not a regular expression?");  
                           jb[0].setText("[(a+b)*-(aa+bb)]*");jb[1].setText("[(0+1)-(0b+a1)*(a+b)]*");jb[2].setText("(01+11+10)*");jb[3].setText("(1+2+0)*(1+2)*");  
                       }  
                       if(current==9)  
                       {  
                           l.setText("Que10: A language is regular if and only if");  
                           jb[0].setText("context free grammar");jb[1].setText("non context free grammar");jb[2].setText("english grammar");  
                                       jb[3].setText("none of the mentioned");  
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
                           return(jb[0].isSelected());  
                       if(current==2)  
                           return(jb[3].isSelected());  
                       if(current==3)  
                           return(jb[0].isSelected());  
                       if(current==4)  
                           return(jb[2].isSelected());  
                       if(current==5)  
                           return(jb[3].isSelected());  
                       if(current==6)  
                           return(jb[3].isSelected());  
                       if(current==7)  
                           return(jb[1].isSelected());  
                       if(current==8)  
                           return(jb[1].isSelected());  
                       if(current==9)  
                           return(jb[0].isSelected());  
                       return false;  
                   }  
                   public static void main(String s[])  
                   {  
                       new Quiz_TOC("Online Test Of TOC");  
                   }  

               }  
