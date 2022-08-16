

package calculator;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;



public class Calculator extends Applet {

    
    Display display = new Display ();
    
    public void init(){
        
        setLayout(new BorderLayout());
        add("North",display);
        
        Keypad keypad = new Keypad();
        add("Center",keypad);
        
        
        
    }
 
    
    public static void main(String[] args) {

        JFrame f = new JFrame("Calculator");
        
        Calculator cal = new Calculator();
        
        cal.init();
        
        f.setSize(500,600);
        f.add("Center",cal);
        f.show();
        
        f.getRootPane().setBorder(BorderFactory.createMatteBorder(12, 12,12,12, Color.LIGHT_GRAY));
        
        
        
        
        
    }
    
    class Display extends Panel{
        
        double digit1 = 0 ;
        int     op = 0;
        boolean equals = false;
        int maxlen = 10;
        String valText;
        JLabel jlblDisplay = new JLabel("0",SwingConstants.RIGHT);
       
        Display (){
            
            setLayout(new BorderLayout());
            jlblDisplay.setBorder(new LineBorder (Color.BLACK,4));
            jlblDisplay.setFont(new Font("Arial",Font.BOLD,50));
            add("Center",jlblDisplay);
            repaint();
             Clear()       ;
                    
             
                    
                    
        }
        
        void backSpace(){
            String backspace = null;
            
            if(jlblDisplay.getText().length()>0){
                StringBuilder strB = new StringBuilder(jlblDisplay.getText());
                strB.deleteCharAt(jlblDisplay.getText().length()-1);
                backspace = strB.toString();
                jlblDisplay.setText(backspace);
            }
            if(jlblDisplay.getText().equals(" "))
            {
                jlblDisplay.setText("0");
                
            }
        }
        
        private void operation()
        {
            if (valText.length()==0)return;
            
            Double digit2 = Double.valueOf(valText);
            digit1 = digit2.doubleValue();
            
            equals = false;
            valText = "0";
            
        
        }
        
        void Equals(){
            
            double answer;
             if (valText.length()==0)return;
            Double digit2 = Double.valueOf(valText);
            
            switch(op){
                case 1:
                    answer = digit1+digit2.doubleValue();
                break;
                case 2:
                    answer = digit1-digit2.doubleValue();
                break;
                              case 3:
                    answer = digit1*digit2.doubleValue();
                break;
                              case 4:
                    answer = digit1/digit2.doubleValue();
                break;
                
                              case 5:
                    answer = digit1%digit2.doubleValue();
                break;
                              default:
                                  answer=0;
                                  break;
            }
             
            valText = new Double(answer).toString();
                                  viewResult();
                                  equals=true;
                                  digit1=0;
                                  op=0;
                
            }
            
  
            void Zero()   {
                op =  1 ;
                operation();
                
            }

            void Plus()   {
                op =  1 ;
                operation();
                
            }
        
            void Minus()   {
                op =2 ;
                operation();
                
            }
            void Mult()   {
                op = 3 ;
                operation();
                
            }
            
            void Div()   {
                op =4;
                operation();
                
            }
            
            void Mod()   {
                op =  5 ;
                operation();
                
            }
            
            void PM(){
                
                if (valText.length()==0)return;
                if (valText.charAt(0) =='-')valText = valText.substring(1);
                else valText = "-" + valText;
                
                viewResult();
                
            }
            
           void Digit(String digit){

               checkEquals();

if(valText.length()== 1 && valText.charAt(0)=='0' &&digit.charAt(0) !='.')
               valText = valText.substring(1);
if(valText.length()<maxlen)           
valText = valText+digit;

viewResult();
           }
          
           void Dot()
           {
        checkEquals();
               
               if(valText.indexOf('.')!=-1)
               return;
               
               if(valText.length()<maxlen)
               valText = valText + ".";
               viewResult();
               
    }
          
           private void checkEquals() {
               
               if(equals ==true){
                   equals = false;
                   valText = "0";
               }
               
               
               
           }
           void Clear(){
           
               digit1 = 0;
               op=0;
               valText="0";
               equals = false;
               viewResult();
               
           }
           
           private void viewResult(){
           
               jlblDisplay.setText(valText);
               repaint();
               
           
           
           }          
    }         
              
        
    class Keypad extends Panel
            implements ActionListener{
        
        Button btnDel,btnC,btnMod,btnPM,btn7,
                btn8,btn9,btnAdd,btn4,btn5,btn6,btnSub,btn1,btn2,btn3,
                btnMult,btnDec,btn0,btnEqu,btnDiv;
        
        Keypad(){
            
            Font font  =  new Font("Arial",Font.BOLD,50);
            setFont(font);
            
            btnDel = new Button("Del");
            add(btnDel);
            btnDel.addActionListener(this);
            
            btnC = new Button("C");
            add(btnC);
            btnC.addActionListener(this);
            
            btnMod = new Button("%");
            add(btnMod);
            btnMod.addActionListener(this);
            
            btnPM = new Button("\u00B1");
            add(btnPM);
            btnPM.addActionListener(this);
            
            btn7 = new Button("7");
            add(btn7);
            btn7.addActionListener(this);
            
            btn8 = new Button("8");
            add(btn8);
            btn8.addActionListener(this);
            
            btn9 = new Button("9");
            add(btn9);
            btn9.addActionListener(this);
            
            btnAdd = new Button("+");
            add(btnAdd);
            btnAdd.addActionListener(this);
            
              btn4 = new Button("4");
            add(btn4);
            btn4.addActionListener(this);
            
              btn5 = new Button("5");
            add(btn5);
            btn5.addActionListener(this);
            
              btn6 = new Button("6");
            add(btn6);
            btn6.addActionListener(this);
            
              btnSub = new Button("-");
            add(btnSub);
            btnSub.addActionListener(this);
            
              btn1 = new Button("1");
            add(btn1);
            btn1.addActionListener(this);
            
              btn2 = new Button("2");
            add(btn2);
            btn2.addActionListener(this);
            
              btn3 = new Button("3");
            add(btn3);
            btn3.addActionListener(this);
            
              btnMult = new Button("*");
            add(btnMult);
            btnMult.addActionListener(this);
            
              btnDec = new Button(".");
            add(btnDec);
            btnDec.addActionListener(this);
            
              btn0 = new Button("0");
            add(btn0);
            btn0.addActionListener(this);
            
              btnEqu = new Button("=");
            add(btnEqu);
            btnEqu.addActionListener(this);
            
              btnDiv = new Button("/");
            add(btnDiv);
            btnDiv.addActionListener(this);
            
            setLayout (new GridLayout(5,4,4,4));
            
        }

        public void actionPerformed(ActionEvent event) {
         
            Object object = event.getSource();
            
            if(object ==btnDel){display.backSpace();  }
            if(object ==btnC){display.Clear();      }
            if(object ==btnMod){display.Mod();  }
            if(object ==btnPM){display.PM(); }
          
            if(object ==btn7){display.Digit("7");  }
            if(object ==btn8){display.Digit("8");}
            if(object ==btn9){display.Digit("9");}
            if(object ==btnAdd){display.Plus();}
            
            
            if(object ==btn4){display.Digit("4");}
            if(object ==btn5){display.Digit("5");}
            if(object ==btn6){display.Digit("6");}
            if(object ==btnSub){display.Minus();}
            
            if(object ==btn1){display.Digit("1");}
            if(object ==btn2){display.Digit("2");}
            if(object ==btn3){display.Digit("3");}
            if(object ==btnMult){display.Mult();}
            
            if(object ==btn0){display.Digit("0");}
            if(object ==btnDec){display.Digit(".");}
            if(object ==btnEqu){display.Equals();}
            if(object ==btnDiv){display.Div();}
            
            
            
          
      
          
           
          
        
            }
    }

}