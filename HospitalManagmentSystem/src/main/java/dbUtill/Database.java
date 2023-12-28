package dbUtill;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	private static String url="jdbc:mysql://localhost:3306/hospital_db";
    private static String user="root";
    private static String password="Welcome@1234";
	
	public static Connection getConnection() {
		Connection con=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            // Class.forName("com.mysql.cj.jdbc.Driver");
            con= (DriverManager.getConnection(url,user,password));
        }
        catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(con !=null) {
        	System.out.println("Database connection Successfull");
        }
        return con;
		
	}
	
	public static void closeConnection(Connection con)  {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
