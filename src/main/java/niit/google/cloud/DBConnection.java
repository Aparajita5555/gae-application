package niit.google.cloud;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Aparajita
 */
public class DBConnection {
    Connection con=null;
   
    public Connection getConnection()
    {
       
        try
        {
        	 System.out.println("hello1");
            Class.forName("com.mysql.jdbc.Driver");
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userManagementSystem","root","Reverberate@100");
       System.out.println("hello2");
       //System.out.println("hello1");
        }
        catch(Exception e)
        {
            System.out.println("hi"+e);
        }
        return con;
    }
}
