package JdbcPractise;
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.protocol.Resultset;
public class Test1 {

	

	public static void main(String[] args) throws SQLException {
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
			
		    String sqlSelectQuery ="select sid,sname,sage,saddress from student";
		    
		    
			 statement= connection.createStatement();
			resultset = statement.executeQuery(sqlSelectQuery);
			
			
			System.out.println("The implement class name  "+statement.getClass().getTypeName());
			System.out.println("The implement class name  "+resultset.getClass().getTypeName());
			
			while(resultset.next()) {
				Integer sid=resultset.getInt(1);
				String sname=resultset.getString(2);
				Integer sage=resultset.getInt(3);
				String saddress=resultset.getString(4);
				System.out.println(sid+" "+sname+" "+sage+" "+saddress );
				
			}
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
