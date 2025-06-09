package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;


public class SignupOne extends JFrame implements ActionListener
{
    long random;
    JTextField nametf,fnametf,emailtf,addresstf,citytf,statetf,pincodetf;
    JDateChooser dateChooser;
    JRadioButton male,female,married,unmarried;
    ButtonGroup grp,grpm; 
    JButton next; 
            
    SignupOne()
    {
        
       
        // set swing :
        setSize(850,855);
        
        setLocation(300,10);
        setTitle("New Account Application Form - Page 1");
        setLayout(null);
        
        //set Backgrounds Color
        getContentPane().setBackground(Color.white);
        
        // get Random Number :
        Random rn = new Random();
        random = Math.abs((rn.nextLong() % 9000L) + 1000L);
        
        // set Form number Label : 
        JLabel formno = new JLabel("APPLICATION FORM NO : "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,700,40);
        add(formno);
        
        // set Person details Label : 
        JLabel personDetails = new JLabel("Page 1 : Personal Details");
        personDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personDetails.setBounds(290,80,400,30);
        add(personDetails);
        
        
        
        // Set Text Fields For Details :
        
        //Name :
        JLabel name = new JLabel("Name : ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,200,30);
        add(name);
        
        //Name TextField:
        nametf = new JTextField();
        nametf.setFont(new Font("Raleway",Font.BOLD,14));
        nametf.setBounds(300,140,400,30);
        add(nametf);
        
        //Father Name :
        JLabel fname = new JLabel("Father's Name : ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        //Fathers Name TextField:
        fnametf = new JTextField();
        fnametf.setFont(new Font("Raleway",Font.BOLD,14));
       fnametf.setBounds(300,190,400,30);
        add(fnametf);
        
        //DOB :
        JLabel dob = new JLabel("Date Of Birth : ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30); 
        add(dob);
        
        //DOB celender set :
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(Color.black);
        add(dateChooser);
         
        //Gender :
        JLabel gender = new JLabel("Gender : ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        //Radia Button for Gender : 
        male = new JRadioButton("Male");
        male.setFont(new Font("Raleway",Font.BOLD,18));
        male.setBounds(300,290,100,30);
        male.setBackground(Color.white);
        add(male);
        
        female = new JRadioButton("Female");
        female.setFont(new Font("Raleway",Font.BOLD,18));
        female.setBounds(450,290,100,30);
        female.setBackground(Color.white);
        add(female);
        
        grp = new ButtonGroup();
        grp.add(male);
        grp.add(female);
        
        
        
        
         //Email :
        JLabel email = new JLabel("Email : ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
        //Email TextField:
        emailtf = new JTextField();
        emailtf.setFont(new Font("Raleway",Font.BOLD,14));
        emailtf.setBounds(300,340,400,30);
        add(emailtf);
        
        
         //Merital Status :
        JLabel merital = new JLabel("Merital Status : ");
        merital.setFont(new Font("Raleway",Font.BOLD,20));
        merital.setBounds(100,390,200,30);
        add(merital);
        
        //Radia Button for Merital status : 
        married = new JRadioButton("Married");
        married.setFont(new Font("Raleway",Font.BOLD,18));
        married.setBounds(300,390,100,30);
        married.setBackground(Color.white);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setFont(new Font("Raleway",Font.BOLD,18));
        unmarried.setBounds(450,390,150,30);
        unmarried.setBackground(Color.white);
        add(unmarried);
        
        grpm = new ButtonGroup();
        grpm.add(married);
        grpm.add(unmarried);
        
         //Address :
        JLabel address = new JLabel("Address : ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
        //Address TextField:
        addresstf = new JTextField();
        addresstf.setFont(new Font("Raleway",Font.BOLD,14));
        addresstf.setBounds(300,440,400,30);
        add(addresstf);
        
         //City :
        JLabel city = new JLabel("City : ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        //City TextField:
        citytf = new JTextField();
        citytf.setFont(new Font("Raleway",Font.BOLD,14));
        citytf.setBounds(300,490,400,30);
        add(citytf);
        
         //State :
        JLabel state = new JLabel("State : ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        //State TextField:
        statetf = new JTextField();
        statetf.setFont(new Font("Raleway",Font.BOLD,14));
        statetf.setBounds(300,540,400,30);
        add(statetf);
        
         //Pincode:
        JLabel pincode = new JLabel("Pincode : ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        //pincode TextField:
        pincodetf = new JTextField();
        pincodetf.setFont(new Font("Raleway",Font.BOLD,14));
        pincodetf.setBounds(300,590,400,30);
        add(pincodetf);
        
        
        // next Page Button :
        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String formno = "" + random; // convert long to String for store form no in string formate
        String name = nametf.getText();
        String fname = fnametf.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        
        //gender :
        String gender = null;
        if(male.isSelected())
        {
            gender = "Male";
        }
        else if(female.isSelected())
        {
            gender = "Female";
        }
        
        String email = emailtf.getText();
        
        //merital
        String marital = null;
        if(married.isSelected())
        {
            marital = "Married";
        }
        else if(unmarried.isSelected())
        {
            marital = "Unmarried";
        }
        
        
        //---------
        
        String address = addresstf.getText();
        String city = citytf.getText();
        String state = statetf.getText();
        String pincode = pincodetf.getText();
        
        
        try
        {
            if(name.equals("") || fname.equals("") || dob.equals("") ||address.equals("") || city.equals("") || state.equals("") || pincode.equals(""))
            {
                JOptionPane.showMessageDialog(null , "Please Fill All Record . . .");
            }
            
            else
            {
                Conn cd = new Conn();
                String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
                cd.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null , "Data Submited...");
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error : "+e);
        }
        
        
        
        
    }
    
    public static void main(String args[])
    {
        new SignupOne();
    }
}
