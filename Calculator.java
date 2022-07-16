import java.awt.Color;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.text.NumberFormat.Style;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.PlainDocument;
import javax.swing.text.PlainView;
import javax.swing.text.AttributeSet.ColorAttribute;

public class Calculator implements Action {
    String oldValue;
    int Operator=0;
    boolean isOperatorClicked=false;
    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton,eightButton,nineButton,fourButton,fiveButton, sixButton,plusButton, clearButton;
    JButton oneButton,twoButton,threeButton,dotButton,zeroButton,equalButton, divideButton,crossButton,minusButton;
    Calculator(){
        jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        
        jf.getContentPane().setBackground(Color.PINK);
        jf.setLocation(100,50 );

        displayLabel=new JLabel();
        displayLabel.setBounds(30, 50,550,50);
        displayLabel.setBackground(Color.BLACK);
        displayLabel.setOpaque(true); 
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        jf.add(displayLabel);
        
        clearButton=new JButton("CLR");
        clearButton.setBounds(470,130, 80,80);
        clearButton.addActionListener(this);
        clearButton.setFont(new FontUIResource("Arial", Font.PLAIN, 20));
        
        jf.add(clearButton); 

        sevenButton=new JButton("7");
        sevenButton.setBounds(30, 130, 80,80);
        sevenButton.addActionListener(this);
        sevenButton.setFont(new FontUIResource("Arial", Font.PLAIN,40));
        jf.add(sevenButton); 

        eightButton=new JButton("8");
        eightButton.setBounds(140, 130, 80,80);
        eightButton.addActionListener(this);
        eightButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));

        jf.add(eightButton);

        nineButton=new JButton("9");
        nineButton.setBounds(250, 130,80,80);
        nineButton.addActionListener(this);
        nineButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));

        jf.add(nineButton);

        fourButton=new JButton("4");
        fourButton.setBounds(30,240,80,80);
        fourButton.addActionListener(this);
        fourButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));

        jf.add(fourButton);

        fiveButton=new JButton("5");
        fiveButton.setBounds(140,240, 80,80);
        fiveButton.addActionListener(this);
        fiveButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));

        jf.add(fiveButton);

        sixButton=new JButton("6");
        sixButton.setBounds(250,240,80,80);
        sixButton.addActionListener(this);
        sixButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));

        jf.add(sixButton);

        oneButton=new JButton("1");
        oneButton.setBounds(250,340,80,80);
        oneButton.addActionListener(this);
        oneButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));

        jf.add(oneButton);
        
        twoButton=new JButton("2");
        twoButton.setBounds(140,340, 80,80);
        twoButton.addActionListener(this);
        twoButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));

        jf.add(twoButton);

        threeButton=new JButton("3");
        threeButton.setBounds(30,340,80,80);
        threeButton.addActionListener(this);
        threeButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));

        jf.add(threeButton);

        dotButton=new JButton(".");
        dotButton.setBounds(30,450,80,80);
        dotButton.addActionListener(this);
        dotButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));

        jf.add(dotButton);

        zeroButton=new JButton("0");
        zeroButton.setBounds(140,450,80,80);
        zeroButton.addActionListener(this);
        zeroButton.setFont(new FontUIResource("Arial", Font.PLAIN, 40));

        jf.add(zeroButton);

        equalButton=new JButton("=");
        equalButton.setBounds(250,450,80,80);
        equalButton.addActionListener(this);
        
        jf.add(equalButton);

        divideButton=new JButton("/");
        divideButton.setBounds(360,130,80,80);
        divideButton.addActionListener(this);
        jf.add(divideButton);

        crossButton=new JButton("*");
        crossButton.setBounds(360,240,80,80);
        crossButton.addActionListener(this);
        jf.add(crossButton);

        minusButton=new JButton("-");
        minusButton.setBounds(360,340,80,80);
        minusButton.addActionListener(this);
        jf.add(minusButton);

        plusButton=new JButton("+");
        plusButton.setBounds(360,450,80,80);
        plusButton.addActionListener(this);
        jf.add(plusButton);

        
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
    public static void main(String[] args) {
    Calculator c=new  Calculator();
    } 
    @Override 
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sevenButton){
            if(isOperatorClicked){
                displayLabel.setText("7");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"7");
            }
            
        }else if(e.getSource()==eightButton){
            if(isOperatorClicked){
                displayLabel.setText("8");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"8");
            }
            
        }else if(e.getSource()==nineButton){
            if(isOperatorClicked){
                displayLabel.setText("9");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"9");
            }
           
        }else if(e.getSource()==fourButton){
            if(isOperatorClicked){
                displayLabel.setText("4");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"4");
            }
 
            
        }else if(e.getSource()==fiveButton){
            if(isOperatorClicked){
                displayLabel.setText("5");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"5");
            }
 
            
        }else if(e.getSource()==sixButton){
            if(isOperatorClicked){
                displayLabel.setText("6");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"6");
            }
 
        }else if(e.getSource()==oneButton){
            if(isOperatorClicked){
                displayLabel.setText("1");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"1");
            }
 
           
        }else if(e.getSource()==twoButton){
            if(isOperatorClicked){
                displayLabel.setText("2");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"2");
            }
 
           
        }else if(e.getSource()==threeButton){
            if(isOperatorClicked){
                displayLabel.setText("3");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"3");
            }
 
            
        }else if(e.getSource()==zeroButton){
            if(isOperatorClicked){
                displayLabel.setText("0");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"0");
            }
         }else if(e.getSource()==dotButton){
            displayLabel.setText(displayLabel.getText()+".");

        }else if(e.getSource()==divideButton){
            
            Operator=1;
            isOperatorClicked=true;
            oldValue=displayLabel.getText();
        }else if(e.getSource()==crossButton){
            Operator=2;
            isOperatorClicked=true;
            oldValue=displayLabel.getText();
          
        }else if(e.getSource()==minusButton){
            Operator=3;
            isOperatorClicked=true;
            oldValue=displayLabel.getText();
           
        }else if(e.getSource()==plusButton){
            Operator=4;
            isOperatorClicked=true;
            oldValue=displayLabel.getText();
            
        }else if(e.getSource()==equalButton){
            
            String newValue=displayLabel.getText();
            float oldValueF=Float.parseFloat(oldValue);
            float newValueF=Float.parseFloat(newValue);
            float result=0;
            switch(Operator){
                case 1:
                 result=oldValueF/newValueF;
                displayLabel.setText(result+"");
                break;
                case 2:
                 result=oldValueF*newValueF;
                displayLabel.setText(result+"");
                break;
                case 3:
                result=oldValueF-newValueF;
                displayLabel.setText(result+"");
                break;
                case 4:
                result=oldValueF+newValueF;
                displayLabel.setText(result+"");
                break;
            }

            
           



        }else if(e.getSource()==clearButton){
            displayLabel.setText("");
        }
        
    }
    @Override
    public Object getValue(String key) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void putValue(String key, Object value) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void setEnabled(boolean b) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub
        
    }
}
