package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;


public class SignupTwo extends JFrame implements ActionListener
{
    
    JTextField pntf,antf,existing_accounttf,senior_citizentf;
    JRadioButton yes,no,yes1,no1;
    ButtonGroup grp,grp1; 
    JButton next; 
    JComboBox religiondd,categorydd,incomedd,educationaldd,occupationdd;
    String formno;
            
    SignupTwo(String formno)
    {
       
        this.formno = formno;
       
        // set swing :
        setSize(850,855);
        
        setLocation(300,10);
        setTitle("New Account Application Form - Page 1");
        setLayout(null);
        
        //set Backgrounds Color
        getContentPane().setBackground(Color.white);
        
        //set Title :
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2 ");
        
        
        
        
        // set Person details Label : 
        JLabel additionalDetails = new JLabel("Page 2 : Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        
        
        // Set Text Fields For Details :
        
        //Religion :
        JLabel religion = new JLabel("Religion : ");
        religion.setFont(new Font("Raleway",Font.BOLD,20));
        religion.setBounds(100,140,200,30);
        add(religion);
        
        // Drop Down Menu For Religion : 
        String valReligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        religiondd = new JComboBox(valReligion);
        religiondd.setBackground(Color.white);
        religiondd.setBounds(300,140,400,30);
        add(religiondd);
        
        
        
        
        //Category :
        JLabel category = new JLabel("Category : ");
        category.setFont(new Font("Raleway",Font.BOLD,20));
        category.setBounds(100,190,200,30);
        add(category);
        
        // Drop Down Menu For Category : 
        String valCategory[] = {"General","OBC","SC","ST","Other"};
        categorydd = new JComboBox(valCategory);
        categorydd.setBackground(Color.white);
        categorydd.setBounds(300,190,400,30);
        add(categorydd);
        
        
        //Income :
        JLabel income = new JLabel("Income : ");
        income.setFont(new Font("Raleway",Font.BOLD,20));
        income.setBounds(100,240,200,30); 
        add(income);
        
        // Drop Down Menu For Income : 
        String valIncome[] = {"NULL","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
        incomedd = new JComboBox(valIncome);
        incomedd.setBackground(Color.white);
        incomedd.setBounds(300,240,400,30);
        add(incomedd);
        
       
         
        //Educational :
        JLabel educational = new JLabel("Educational  ");
        educational.setFont(new Font("Raleway",Font.BOLD,20));
        educational.setBounds(100,290,200,30);
        add(educational);
        
         //Qualification :
        JLabel qualification = new JLabel("Qualification : ");
        qualification.setFont(new Font("Raleway",Font.BOLD,20));
        qualification.setBounds(100,320,200,30);
        add(qualification);
        
        
        // Drop Down Menu For Educational : 
        String valEducational[] = {"Non Graduation","Graduate","Post Graduation","Others"};
        educationaldd = new JComboBox(valEducational);
        educationaldd.setBackground(Color.white);
        educationaldd.setBounds(300,300,400,30);
        add(educationaldd);
        
        
        //Occupation :
        JLabel occupation = new JLabel("Occupation : ");
        occupation.setFont(new Font("Raleway",Font.BOLD,20));
        occupation.setBounds(100,380,200,30);
        add(occupation);
        
        
        // Drop Down Menu For Occupation : 
        String valOccupation[] = {"Salaried","Self Employed","Bussiness","Student","Retired","Others"};
        occupationdd = new JComboBox(valOccupation);
        occupationdd.setBackground(Color.white);
        occupationdd.setBounds(300,380,400,30);
        add(occupationdd);
        
        
        
         //PAN Number :
        JLabel pn = new JLabel("PAN Number : ");
        pn.setFont(new Font("Raleway",Font.BOLD,20));
        pn.setBounds(100,440,200,30);
        add(pn);
        
        
        //PAN Number TextField:
        pntf = new JTextField();
        pntf.setFont(new Font("Raleway",Font.BOLD,14));
        pntf.setBounds(300,440,400,30);
        add(pntf);
        
        
         //Aadhar Number :
        JLabel an = new JLabel("Aadhar Number : ");
        an.setFont(new Font("Raleway",Font.BOLD,20));
        an.setBounds(100,490,200,30);
        add(an);
        
        //Aadhar Number TextField:
        antf = new JTextField();
        antf.setFont(new Font("Raleway",Font.BOLD,14));
        antf.setBounds(300,490,400,30);
        add(antf);
        
         //Senior Citizen :
        JLabel senior_citizen = new JLabel("Senior Citizen : ");
        senior_citizen.setFont(new Font("Raleway",Font.BOLD,20));
        senior_citizen.setBounds(100,540,200,30);
        add(senior_citizen);
        
        //Radia Button for Senior Citizen : 
        yes = new JRadioButton("YES");
        yes.setFont(new Font("Raleway",Font.BOLD,18));
        yes.setBounds(300,540,100,30);
        yes.setBackground(Color.white);
        add(yes);
        
        no = new JRadioButton("NO");
        no.setFont(new Font("Raleway",Font.BOLD,18));
        no.setBounds(450,540,100,30);
        no.setBackground(Color.white);
        add(no);
        
        grp = new ButtonGroup();
        grp.add(yes);
        grp.add(no);
        
         //Pincode:
        JLabel existing_account = new JLabel("Existing Account : ");
        existing_account.setFont(new Font("Raleway",Font.BOLD,20));
        existing_account.setBounds(100,590,200,30);
        add(existing_account);
        
       //Radia Button for Senior Citizen : 
        yes1 = new JRadioButton("YES");
        yes1.setFont(new Font("Raleway",Font.BOLD,18));
        yes1.setBounds(300,590,100,30);
        yes1.setBackground(Color.white);
        add(yes1);
        
        no1 = new JRadioButton("NO");
        no1.setFont(new Font("Raleway",Font.BOLD,18));
        no1.setBounds(450,590,100,30);
        no1.setBackground(Color.white);
        add(no1);
        
        grp1 = new ButtonGroup();
        grp1.add(yes1);
        grp1.add(no1);
        
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
        String sreligion = (String) religiondd.getSelectedItem();
        String scategorydd = (String) categorydd.getSelectedItem();
        String sincomedd = (String) incomedd.getSelectedItem();
        String seducationaldd = (String) educationaldd.getSelectedItem();
        String soccupationdd = (String) occupationdd.getSelectedItem();
        
        String span = pntf.getText();   
        String sadar = antf.getText();
        
        //get Radio Button  Senior Citizen: 
        String rsenior = null;
        if(yes.isSelected())
        {
            rsenior = "YES";
        }
        else if(no.isSelected())
        {
            rsenior = "NO";
        }
        
        
        //get Radio Button Exicting Account: 
        String raccount = null;
        if(yes1.isSelected())
        {
            raccount = "YES";
        }
        else if(no1.isSelected())
        {
            raccount = "NO";
        }
        
        
        // Data Base enter Value : 
         try
        {
            if(span.equals("") || sadar.equals("") )
            {
                JOptionPane.showMessageDialog(null,"Please Fill All Record . . .");
            }
            
            else
            {
                Conn cd = new Conn();
                String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategorydd+"','"+sincomedd+"','"+seducationaldd+"','"+soccupationdd+"','"+span+"','"+sadar+"','"+rsenior+"','"+raccount+"')";
                cd.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null , "Data Submited...");
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            }   
            
        }
        catch(Exception e)
        {
            System.out.println("Error : "+e);
        }
        
        
        
    }
    
    public static void main(String args[])
    {
        new SignupTwo("");
    }
}
