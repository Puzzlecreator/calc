
package javaapplication5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class JavaApplication5 extends JFrame implements ActionListener{

  double nr1 = 0;
  double nr2;
  double rez;
  String op = null;
    
    String af=new String();
    String af1=new String();
    JTextField t1=new JTextField("",22);
    JPanel panel=new JPanel();
    JButton c=new JButton("C");
    JButton k=new JButton("()");
    JButton p=new JButton("%");
    JButton pjestim=new JButton("/");
    JButton b7=new JButton("7");
    JButton b8=new JButton("8");
    JButton b9=new JButton("9");
    JButton shumzim=new JButton("*");
    JButton b4=new JButton("4");
    JButton b5=new JButton("5");
    JButton b6=new JButton("6");
    JButton minus=new JButton("-");
    JButton b1=new JButton("1");
    JButton b2=new JButton("2");
    JButton b3=new JButton("3");
    JButton plus=new JButton("+");
    JButton pm=new JButton("+/-");
    JButton b0=new JButton("0");
    JButton pike=new JButton(".");
    JButton bb=new JButton("=");
    
    
   public JavaApplication5(){
   super("Klaus's Calculator");
   setLayout(new FlowLayout());
   setSize(275,385);
   getContentPane().setBackground(new Color(41, 61, 61));
   panel.setBackground(new Color(41, 61, 61));
   add(t1);
   t1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
   setLocationRelativeTo(null);
   t1.setBorder(BorderFactory.createLineBorder(Color.decode("#293d3d")));
   t1.setForeground(Color.WHITE);
   t1.setBackground(new Color(41, 61, 61));
   t1.setPreferredSize( new Dimension( 200, 50 ) );
   add(panel);
   panel.setLayout(new GridLayout(5,4,0,0));
   panel.add(c);
   panel.add(k);
   panel.add(p);
   panel.add(pjestim);
   panel.add(b7);
   panel.add(b8);
   panel.add(b9);
   panel.add(shumzim);
   panel.add(b4);
   panel.add(b5);
   panel.add(b6);
   panel.add(minus);
   panel.add(b1);
   panel.add(b2);
   panel.add(b3);
   panel.add(plus);
   panel.add(pm);
   panel.add(b0);
   panel.add(pike);
   panel.add(bb);
   panel.setPreferredSize(new Dimension(250,280));
   c.addActionListener(this);
   c.setFont(new Font("Arial",Font.BOLD,18));
   k.addActionListener(this);
   k.setFont(new Font("Arial",Font.BOLD,15));
   p.addActionListener(this);
   p.setFont(new Font("Arial",Font.BOLD,15));
   pjestim.addActionListener(this);
   b7.addActionListener(this);
   b7.setFont(new Font("Arial",Font.BOLD,15));
   b8.addActionListener(this);
   b8.setFont(new Font("Arial",Font.BOLD,15));
   b9.addActionListener(this);
   b9.setFont(new Font("Arial",Font.BOLD,15));
   shumzim.addActionListener(this);
   b4.addActionListener(this);
   b4.setFont(new Font("Arial",Font.BOLD,15));
   b5.addActionListener(this);
   b5.setFont(new Font("Arial",Font.BOLD,15));
   b6.addActionListener(this);
   b6.setFont(new Font("Arial",Font.BOLD,15));
   minus.addActionListener(this);
   b1.addActionListener(this);
   b1.setFont(new Font("Arial",Font.BOLD,15));
   b2.addActionListener(this);
   b2.setFont(new Font("Arial",Font.BOLD,15));
   b3.addActionListener(this);
   b3.setFont(new Font("Arial",Font.BOLD,15));
   plus.addActionListener(this);
   pm.addActionListener(this);
   pm.setFont(new Font("Arial",Font.BOLD,15));
   b0.addActionListener(this);
   b0.setFont(new Font("Arial",Font.BOLD,15));
   pike.addActionListener(this);
   pike.setFont(new Font("Arial",Font.BOLD,20));
   bb.addActionListener(this);
   c.setBackground(Color.WHITE);
   k.setBackground(Color.WHITE);
   p.setBackground(Color.WHITE);
   pjestim.setBackground(new Color(255, 117, 26));
   pjestim.setFont(new Font("Arial",Font.HANGING_BASELINE,20));
   pjestim.setForeground(Color.WHITE);
   b7.setBackground(Color.WHITE);
   b8.setBackground(Color.WHITE);
   b9.setBackground(Color.WHITE);
   shumzim.setBackground(new Color(255, 117, 26));
   shumzim.setForeground(Color.WHITE);
   shumzim.setFont(new Font("Arial",Font.CENTER_BASELINE,25));
   b4.setBackground(Color.WHITE);
   b5.setBackground(Color.WHITE);
   b6.setBackground(Color.WHITE);
   minus.setBackground(new Color(255, 117, 26));
   minus.setForeground(Color.WHITE);
   minus.setFont(new Font("Arial",Font.HANGING_BASELINE,25));
   b1.setBackground(Color.WHITE);
   b2.setBackground(Color.WHITE);
   b3.setBackground(Color.WHITE);
   plus.setBackground(new Color(255, 117, 26));
   plus.setForeground(Color.WHITE);
   plus.setFont(new Font("Arial",Font.HANGING_BASELINE,20));
   pm.setBackground(Color.WHITE);
   b0.setBackground(Color.WHITE);
   pike.setBackground(Color.WHITE);
   bb.setBackground(new Color(255, 117, 26));
   bb.setForeground(Color.WHITE);
   bb.setFont(new Font("Arial",Font.HANGING_BASELINE,25)); 

  setVisible(true);
 
   }
   public void actionPerformed(ActionEvent e){
         if(e.getSource()==c)
       {
        af="";
        t1.setText(af);
       }
         if(e.getSource()==b0)
       {
        af=t1.getText()+b0.getText();
        t1.setText(af);
       }
       if(e.getSource()==b7)
       {
        af=t1.getText()+b7.getText();
        t1.setText(af);
       }
       if(e.getSource()==b8)
       {
        af=t1.getText()+b8.getText();
        t1.setText(af);
       }
       if(e.getSource()==b9)
       {
        af=t1.getText()+b9.getText();
        t1.setText(af);
       }
       if(e.getSource()==shumzim)
       {nr1=Double.parseDouble(t1.getText());
       t1.setText("");
       op="*";
       }
       if(e.getSource()==b4)
       {
        af=t1.getText()+b4.getText();
        t1.setText(af);
       }
       if(e.getSource()==b5)
       {
        af=t1.getText()+b5.getText();
        t1.setText(af);
       }
       if(e.getSource()==b6)
       {
        af=t1.getText()+b6.getText();
        t1.setText(af);
       }
       if(e.getSource()==b1)
       {
        af=t1.getText()+b1.getText();
        t1.setText(af);
       }
       if(e.getSource()==b2)
       {
        af=t1.getText()+b2.getText();
        t1.setText(af);
       }
       if(e.getSource()==b3)
       {
        af=t1.getText()+b3.getText();
        t1.setText(af);
       }
       if(e.getSource()==pjestim)
       {nr1=Double.parseDouble(t1.getText());
       t1.setText("");
       op="/";
       }
       if(e.getSource()==minus)
       {
          nr1=Double.parseDouble(t1.getText());
       t1.setText("");
       op="-";
       }
       if(e.getSource()==plus)
       {
       nr1=Double.parseDouble(t1.getText());
       t1.setText("");
       op="+";
       }
       if(e.getSource()==bb)
       {
           nr2=Double.parseDouble(t1.getText());
           
           if(op=="+")
           {
               rez=nr1+nr2;
           t1.setText(Double.toString(rez));
           }
           else if(op=="-")
           {  rez=nr1-nr2;
           t1.setText(Double.toString(rez));
           }
           else if(op=="*")
           {  rez=nr1*nr2;
           t1.setText(Double.toString(rez));
           }
           else if(op=="/")
           {  rez=nr1/nr2;
           t1.setText(Double.toString(rez));
           }
           else if(op=="%")
           {  rez=nr1%nr2;
           t1.setText(Double.toString(rez));
           }

                
       }
       if(e.getSource()==p)
       {
           nr1=Double.parseDouble(t1.getText());
       t1.setText("");
       op="%";
        }
       if(e.getSource()==pm)
       {
        double o=Double.parseDouble(String.valueOf(t1.getText()));
        o=o*(-1);
        t1.setText(String.valueOf(o));
       }
       if(e.getSource()==pike){
           String pik=(String.valueOf(t1.getText()));
           pik=t1.getText()+".";
           t1.setText(String.valueOf(pik));
       }
   
   }
   public static void main(String[] args){
   JavaApplication5 x=new JavaApplication5();
   }
    
}
