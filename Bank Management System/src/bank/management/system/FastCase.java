package bank.management.system;

import javax.swing.*;
import java.util.Date;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class FastCase extends JFrame implements ActionListener
{
    JButton _100,_500,_1000,_2000,_5000,_10000,exit;
    String pinnumber;
    FastCase(String pinnumber)
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
        
        JLabel text = new JLabel("Select Withdraw Amount");
        text.setBounds(215,180,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        _100  = new JButton("Rs 100");
        _100.setBounds(166,270,150,30);
        image.add(_100);
        
        _500  = new JButton("Rs 500");
        _500.setBounds(350,270,150,30);
        image.add(_500);
        
        _1000  = new JButton("Rs 1000");
        _1000.setBounds(166,305,150,30);
        image.add(_1000);
        
        _2000  = new JButton("Rs 2000");
        _2000.setBounds(350,305,150,30);
        image.add(_2000);
        
        _5000  = new JButton("Rs 5000");
        _5000.setBounds(166,340,150,30);
        image.add(_5000);
        
        _10000  = new JButton("Rs 10000");
        _10000.setBounds(350,340,150,30);
        image.add(_10000);
        
        exit  = new JButton("Back");
        exit.setBounds(350,375,150,30);
        image.add(exit);
        
        _100.addActionListener(this);
        _500.addActionListener(this);
        _1000.addActionListener(this);
        _2000.addActionListener(this);
        _5000.addActionListener(this);
        _10000.addActionListener(this);
        exit.addActionListener(this);
        
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == exit)
        {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
        else
        {
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            Conn conn = new Conn();
            
            try
            {
                ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+pinnumber+"' ");
                int balance = 0;
                
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
                
                if(ae.getSource() != exit && balance < Integer.parseInt(amount))
                {
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                
                Date date = new Date();
                String query = "insert into bank values('"+pinnumber+"' , '"+date+"' , 'Withdrawl' , '"+amount+"')";
                conn.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null,"Rs. : "+amount + " Withdraw Successfully...");
                
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }
            catch(Exception e)
            {
                System.out.print(e);
            }
        }
        
            
    }
    
    public static void main(String args[])
    {
        new FastCase("");
    }
}
