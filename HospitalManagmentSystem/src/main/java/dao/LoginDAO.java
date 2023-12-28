package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dbUtill.Database;
import pojo.LoginInfo;

public class LoginDAO {
	
	public static boolean isUserValid(LoginInfo user)   {
		
		boolean status=false;
		Connection con= Database.getConnection();
		String query="select * from login_info where user_name='"+user.getUserName()+"' and password='"+user.getPassword()+"'";
		System.out.println("Executing "+query);
		try {
		Statement stmt = con.createStatement();
		ResultSet rs= stmt.executeQuery(query);
		if(rs.next())
			status=true;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Database.closeConnection(con);
		return status;
	}

}
