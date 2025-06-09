package bank.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{
    JButton sign_in,clear,sign_up;
    JTextField cardtf;
    JPasswordField pintf;
    
    Login()
    {
        //set Swing 
        setSize(750,500);
        
        setLocation(300,200);
        
        //set Heading of swing :
        setTitle("AUTOMATED TAILER MACHINE");
        
        //set Background Color :
        getContentPane().setBackground(Color.white);
        
        
        //set Logo of Bank :
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("logo/logo.png"));
        Image i2 = i1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel blogo = new JLabel(i3);
        setLayout(null);
        blogo.setBounds(70,8,150,150);
        add(blogo);
        
        // welcome text:
        JLabel wel = new JLabel("WELCOME TO ATM");
        wel.setFont(new Font("Times new Roman",Font.BOLD,38));
        wel.setBounds(230,65,400,40);
        add(wel);
        
        //set Label for Card no:
        JLabel cardno = new JLabel("Card No. : ");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120,150,150,40);
        add(cardno);
        
        
        //set Text Field for Card no :
        cardtf = new JTextField();
        cardtf.setFont(new Font("Raleway",Font.BOLD,26));
        cardtf.setBounds(300,150,300,40);
        add(cardtf);
        
        
        //set Label for PIn:
        JLabel pin = new JLabel("PIN : ");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120,210,150,40);
        add(pin);
        
        //set Text Field for pin :
        pintf = new JPasswordField();
        pintf.setFont(new Font("Raleway",Font.BOLD,26));
        pintf.setBounds(300,210,300,40);
        add(pintf);
        
        // sing in :
        sign_in = new JButton("SIGN IN");
        sign_in.setFont(new Font("Raleway",Font.BOLD,16));
        sign_in.setBounds(300,280,140,40);
        sign_in.setBackground(Color.black);
        sign_in.setForeground(Color.white);
        add(sign_in);
        
        // Clear :
        clear = new JButton("CLEAR");
        clear.setFont(new Font("Raleway",Font.BOLD,16));
        clear.setBounds(460,280,140,40);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        add(clear);
        
        // sing UP :
        sign_up = new JButton("SIGN UP");
        sign_up.setFont(new Font("Raleway",Font.BOLD,16));
        sign_up.setBounds(300,340,300,40);
        sign_up.setBackground(Color.black);
        sign_up.setForeground(Color.white);
        add(sign_up);
        
        
        // add Action Listener
        sign_in.addActionListener(this);
        clear.addActionListener(this);
        sign_up.addActionListener(this);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        
        if(ae.getSource() == sign_in)
        {
            Conn c=new Conn();
            String cardnumber=cardtf.getText();
            String pinnumber=pintf.getText();
            String query="select * from login where cardnumber= '"+cardnumber+"' and pinnumber = '"+pinnumber+"'";
           
            try
            {
                ResultSet rs=c.s.executeQuery(query);
                if(rs.next())
                {
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else if(ae.getSource() == sign_up)
        {
            setVisible(false);
            new SignupOne().setVisible(true);
        }
        else if(ae.getSource() == clear)
        {
            cardtf.setText("");
            pintf.setText("");
        }
        
    }
    
    
    
    public static void main(String args[])
    {
        new Login();
    }
}
