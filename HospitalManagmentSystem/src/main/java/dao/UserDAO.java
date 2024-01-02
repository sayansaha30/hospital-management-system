package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dbUtill.Database;
import pojo.User;

public class UserDAO {
	
	public static int createUser(User user) {
		Connection connection = Database.getConnection();
		String query="INSERT INTO hospital_db.login_info (user_name, password, email) VALUES ('" + user.getName() +"', '"+user.getPassword()+"', '"+user.getEmail()+"')";
;
		try {
			System.out.println("Executing "+query);
			PreparedStatement prepareStatement = connection.prepareStatement(query);
			int executeUpdate = prepareStatement.executeUpdate(query);
			Database.closeConnection(connection);
			if(executeUpdate>0) {
				System.out.println("user added successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 1;
		
	}

}
