package niit.google.cloud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;

public class Dao {
	
	DBConnection dbcon=new DBConnection();
	public int register(String name,String email, String password ) throws SQLException
	{
		Connection con=dbcon.getConnection();
		String sql="insert into user values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, password);
		int res=ps.executeUpdate();
		
		return res;
	}
	
	public String signIn(String email, String password)throws SQLException
	{
		System.out.println("hello3 ");
		Connection con=dbcon.getConnection();
		String sql="select password, name from user where email=?;";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, email);
		System.out.println("hello4 ");
	ResultSet res=ps.executeQuery();
			while(res.next())
		{
			String pass=res.getString(1);
			System.out.println("hello5 "+pass);
			if(pass.equals(password))
			{
				//return 1;
				String name=res.getString(2);
				System.out.println("hello "+name);
				return name;
			}
		}
		return null;	
	}
	

}
