package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Withdrawl extends JFrame implements ActionListener
{
    JButton withdraw,back;
    JTextField amount;
    String pinnumber;
    Withdrawl(String pinnumber)
    {
        this.pinnumber = pinnumber;
        
        setSize(670 , 840);
        setLocation(410, 0);
        //setUndecorated(true);
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("logo/atm2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(670,840,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,670,840);
        add(image);
        
        JLabel text = new JLabel("Enter The Amount You Want to Withdraw");
        text.setBounds(188,180,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        amount = new JTextField();
        amount.setBounds(188,230,300,25);
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        image.add(amount);
        
        
        withdraw = new JButton("Withdraw");
        withdraw.setBounds(355,330,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
        back = new JButton("Back");
        back.setBounds(355,370,150,30);
        back.addActionListener(this);
        image.add(back);
        
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == withdraw)
        {
            String number = amount.getText();
            Date date = new Date();
            
            if(number.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please Enter The Amount");
            }
            else 
            {
                try
                {
                    Conn conn = new Conn();
                    String query = "insert into bank values('"+pinnumber+"' , '"+date+"' , 'Withdraw' , '"+number+"')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Rs. : "+number+" Deposit Successfully...");
                    
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        }
        else if(ae.getSource() == back)
        {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String args[])
    {
        new Withdrawl("");
    }
}
