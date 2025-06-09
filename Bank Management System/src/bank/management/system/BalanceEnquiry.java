package bank.management.system;

import javax.swing.*;
import java.util.Date;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BalanceEnquiry extends JFrame implements ActionListener
{
    JButton back;
    String pinnumber;
    BalanceEnquiry(String pinnumber)
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
        
        Conn conn = new Conn();
        int balance = 0;
        try
        {
            ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+pinnumber+"' ");
                
            while(rs.next())   
            {
                if(rs.getString("type").equals("Deposit"))
                {
                    balance += Integer.parseInt(rs.getString("amount"));
                }
                else
                {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
             }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
        JLabel text = new JLabel("Your Current Account Balance is Rs : "+balance);
        text.setBounds(180,180,700,40);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,14));
        image.add(text);
        
        back = new JButton("Back");
        back.setBounds(355,370,150,30);
        back.addActionListener(this);
        image.add(back);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
        
        
    }
    
    public static void main(String args[])
    {
        new BalanceEnquiry("").setVisible(true);
    }
}
