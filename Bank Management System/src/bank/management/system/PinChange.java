package bank.management.system;

import javax.swing.*;
import java.util.Date;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class PinChange extends JFrame implements ActionListener
{
    JPasswordField pin,repin;
    JButton change,back;
    String pinnumber;
    PinChange(String pinnumber)
    {
        this.pinnumber= pinnumber;
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
        
        JLabel text = new JLabel("Change Your PIN");
        text.setBounds(240,180,700,40);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,22));
        image.add(text);
        
        JLabel pintext = new JLabel("New PIN");
        pintext.setBounds(170,230,180,25);
        pintext.setForeground(Color.white);
        pintext.setFont(new Font("System",Font.BOLD,16));
        image.add(pintext);
        
        pin = new JPasswordField();
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        pin.setBounds(320,230,180,25);
        image.add(pin);
        
        JLabel repintext = new JLabel("Re-Enter New PIN");
        repintext.setBounds(170,260,180,25);
        repintext.setForeground(Color.white);
        repintext.setFont(new Font("System",Font.BOLD,16));
        image.add(repintext);
        
        repin = new JPasswordField();
        repin.setFont(new Font("Raleway",Font.BOLD,25));
        repin.setBounds(320,260,180,25);
        image.add(repin);
        
        
        change = new JButton("Change");
        change.setBounds(355,340,150,30);
        image.add(change);
        
        back = new JButton("Back");
        back.setBounds(355,375,150,30);
        image.add(back);
        
        change.addActionListener(this);
        back.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == change)
        {
            
        
            try
            {
                String npin = pin.getText();
                String rpin = repin.getText();

                if(!npin.equals(rpin))
                {
                    JOptionPane.showMessageDialog(null,"Entered Pin Does Not Match...");
                    return;
                }
                
                if(npin.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Please Enter New PIN");
                    return;
                }
                
                if(rpin.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Please Re_Enter New PIN");
                    return;
                }
                
                Conn conn = new Conn();
                String query1 = "Update bank set pin = '"+rpin+"' where pin='"+pinnumber+"'";
                String query2 = "Update login set pinnumber = '"+rpin+"' where pinnumber='"+pinnumber+"'";
                String query3 = "Update signupthree set pin = '"+rpin+"' where pin='"+pinnumber+"'";
                
                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);
                
                JOptionPane.showMessageDialog(null,"PIN Changed Successfully...");
                
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else
        {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String args[])
    {
        new PinChange("").setVisible(true);
    }

    
}
