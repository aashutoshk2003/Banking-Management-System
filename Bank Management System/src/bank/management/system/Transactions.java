package bank.management.system;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener
{
    JButton deposit,withdrawl,fastcase,ministatement,pinchange,balanceenquery,exit;
    String pinnumber;
    Transactions(String pinnumber)
    {
        this.pinnumber = pinnumber;
        
        setSize(670 , 840);
        setLocation(410, 0);
        setUndecorated(true);
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("logo/atm2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(670,840,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,670,840);
        add(image);
        
        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(215,180,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        deposit  = new JButton("Deposit");
        deposit.setBounds(166,270,150,30);
        image.add(deposit);
        
        withdrawl  = new JButton("Case Withdrawl");
        withdrawl.setBounds(350,270,150,30);
        image.add(withdrawl);
        
        fastcase  = new JButton("Fast Case");
        fastcase.setBounds(350,305,150,30);
        image.add(fastcase);
        
        ministatement  = new JButton("Mini Statement");
        ministatement.setBounds(166,305,150,30);
        image.add(ministatement);
        
        pinchange  = new JButton("Pin Change");
        pinchange.setBounds(166,340,150,30);
        image.add(pinchange);
        
        balanceenquery  = new JButton("Balance Enquiry");
        balanceenquery.setBounds(350,340,150,30);
        image.add(balanceenquery);
        
        exit  = new JButton("Exit");
        exit.setBounds(350,375,150,30);
        image.add(exit);
        
        deposit.addActionListener(this);
        withdrawl.addActionListener(this);
        fastcase.addActionListener(this);
        ministatement.addActionListener(this);
        pinchange.addActionListener(this);
        balanceenquery.addActionListener(this);
        exit.addActionListener(this);
        
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == exit)
        {
            System.exit(0);
        }
        else if(ae.getSource() == deposit)
        {
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }
        else if(ae.getSource() == withdrawl)
        {
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }
        else if(ae.getSource() == fastcase)
        {
            setVisible(false);
            new FastCase(pinnumber).setVisible(true);
        }
        else if(ae.getSource() == pinchange)
        {
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }
        else if(ae.getSource() == balanceenquery)
        {
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }
        else if(ae.getSource() == ministatement)
        {
            
            new MiniStatement(pinnumber).setVisible(true);
        }
            
    }
    
    public static void main(String args[])
    {
        new Transactions("");
    }
}
