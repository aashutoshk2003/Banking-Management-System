package bank.management.system;

import java.sql.*;

public class Conn
{
    
    Connection c;
    Statement s,s1;
    
    
    public Conn()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","");
            s = c.createStatement();
            s1 = c.createStatement();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
