package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.util.*;

public class SignupThree extends JFrame implements ActionListener
{
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancle;
    String formno;
    
    SignupThree(String formno)
    {
        this.formno = formno;
        setSize(850,820);
        setLocation(350,0);
        
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel l1 = new JLabel("Page 3 : Account Details ");
        l1.setFont(new Font("raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        
        // Account TYpe Label and Radio Button:
        JLabel type = new JLabel("Account Type : ");
        type.setFont(new Font("raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("raleway",Font.BOLD,16));
        r1.setBackground(Color.white);
        r1.setBounds(100 , 180 , 200 , 20);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("raleway",Font.BOLD,16));
        r2.setBackground(Color.white);
        r2.setBounds(350 , 180 , 200 , 20);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("raleway",Font.BOLD,16));
        r3.setBackground(Color.white);
        r3.setBounds(100 , 220 , 200 , 20);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("raleway",Font.BOLD,16));
        r4.setBackground(Color.white);
        r4.setBounds(350 , 220 , 250 , 20);
        add(r4);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        //=============================================================
        
        
        // == card number Label and number == 
        JLabel card = new JLabel("Card Number : ");
        card.setFont(new Font("raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);
        
        JLabel number = new JLabel("xxxx-xxxx-xxxx-4814");
        number.setFont(new Font("raleway",Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);
        
        JLabel carddetails = new JLabel("Your 16 Digit Card Number");
        carddetails.setFont(new Font("raleway",Font.BOLD,12));
        carddetails.setBounds(100,330,300,20);
        add(carddetails);
        //===================================================
        
        // == PIN Label and number == 
        JLabel pin = new JLabel("PIN : ");
        pin.setFont(new Font("raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        JLabel pnumber = new JLabel("xxxx");
        pnumber.setFont(new Font("raleway",Font.BOLD,22));
        pnumber.setBounds(330,370,300,30);
        add(pnumber);
        
        JLabel pindetails = new JLabel("Your 4 Digit PIN");
        pindetails.setFont(new Font("raleway",Font.BOLD,12));
        pindetails.setBounds(100,400,300,20);
        add(pindetails);
        //===================================================
        
        // == services label and checkbox == 
        JLabel services = new JLabel("Services Require : ");
        services.setFont(new Font("raleway",Font.BOLD,22));
        services.setBounds(100,450,400,30);
        add(services);
        
        c1 = new JCheckBox("ATM Card");
        c1.setFont(new Font("raleway",Font.BOLD,16));
        c1.setBackground(Color.white);
        c1.setBounds(100 , 480 , 200 , 30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("raleway",Font.BOLD,16));
        c2.setBackground(Color.white);
        c2.setBounds(350 , 480 , 200 , 30);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("raleway",Font.BOLD,16));
        c3.setBackground(Color.white);
        c3.setBounds(100 , 530 , 200 , 30);
        add(c3);
        
        c4 = new JCheckBox("Email & SMS Alert!");
        c4.setFont(new Font("raleway",Font.BOLD,16));
        c4.setBackground(Color.white);
        c4.setBounds(350 , 530 , 200 , 30);
        add(c4);
        
        
        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("raleway",Font.BOLD,16));
        c5.setBackground(Color.white);
        c5.setBounds(100 , 580 , 200 , 30);
        add(c5);
        
        c6 = new JCheckBox("E Statement");
        c6.setFont(new Font("raleway",Font.BOLD,16));
        c6.setBackground(Color.white);
        c6.setBounds(350 , 580 , 200 , 30);
        add(c6);
        
        c7 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge");
        c7.setFont(new Font("raleway",Font.BOLD,12));
        c7.setBackground(Color.white);
        c7.setBounds(100 , 630 , 600 , 30);
        add(c7);
        
       
        //===================================================
        
        
        
        // == Submit button and Cancle Button ==
        submit = new JButton("Submit");
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setFont(new Font("raleway",Font.BOLD,14));
        submit.setBounds(250,690,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancle = new JButton("Cancle");
        cancle.setBackground(Color.black);
        cancle.setForeground(Color.white);
        cancle.setFont(new Font("raleway",Font.BOLD,14));
        cancle.setBounds(420,690,100,30);
        cancle.addActionListener(this);
        add(cancle);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == submit)
        {
            String accounttype = null;
            if(r1.isSelected())
            {
                accounttype = "Savaing Account";
            }
            else if(r2.isSelected())
            {
                accounttype = "Fixed Deposit Account";
            }
            else if(r3.isSelected())
            {
                accounttype = "Current Account";
            }
            else if(r4.isSelected())
            {
                accounttype = "Recurring Deposit Account";
            }
            
            
            Random random = new Random();
            String cardnumber =""+ Math.abs((random.nextLong() % 90000000L) + 5040936000000000L); 
            String pinnumber = ""+ Math.abs((random.nextLong() % 9000L) + 1000L);
            
            String facility = "";
            if(c1.isSelected())
            {
                facility+="  ATM Card";
            }
            else if(c2.isSelected())
            {
                facility+="  Internet Banking";
            }
            else if(c3.isSelected())
            {
                facility+="  Mobile Banking";
            }
            else if(c4.isSelected())
            {
                facility+="  Email & SMS Alert!";
            }
            else if(c5.isSelected())
            {
                facility+="  Cheque Book";
            }
            else if(c6.isSelected())
            {
                facility+="  E Statement";
            }
            
            
            try
            {
                if(accounttype.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Account Type Is Required ");
                }
                else
                {
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+formno+"','"+accounttype+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                    String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null,"Card Number : "+cardnumber +"\n Pin : "+pinnumber);
                    
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(true);
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else if(ae.getSource() == cancle)
        {
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    public static void main(String args[])
    {
        new SignupThree("");
    }
}
