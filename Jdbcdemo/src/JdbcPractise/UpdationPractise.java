package JdbcPractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdationPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection connection=null;
		Statement statement=null;
		ResultSet resultset=null;
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("Driver loaded Successfully");
			
			String url = "jdbc:mysql://localhost:3306/practise1";
			
			String username="root";
			String password="yashr8143";
			
			
			connection = DriverManager.getConnection(url,username,password);
			
			System.out.println("The implement class name  "+connection.getClass().getTypeName());
			
//		    String sqlSelectQuery ="select sid,sname,sage,saddress from student";
		    
		    
			 statement= connection.createStatement();
//			resultset = statement.executeQuery(sqlSelectQuery);
			
			String sqlUpdationQuery="update student set saddress='MI' where sid=5";
			int rowAffected=statement.executeUpdate(sqlUpdationQuery);
			System.out.println("No of rows affected  "+rowAffected);
			
//			System.out.println("The implement class name  "+statement.getClass().getTypeName());
//			System.out.println("The implement class name  "+resultset.getClass().getTypeName());
			
			
			
		}
//		catch(ClassNotFoundException ce) {
//			ce.printStackTrace();
//		}
	catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(connection!=null) {
			try {
				connection.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
			}
		}

	}

}
