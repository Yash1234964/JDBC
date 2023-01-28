package JDBCPreparedStatementPractise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

public class InsertDemo {

	static Connection connection =null;
	static PreparedStatement pstmt=null;
	static ResultSet resultSet=null;
	
	
	public static void main(String[] args) throws Exception {
		
		PropertiesPractise pp=new PropertiesPractise();
		try {
			connection =pp.jdbcConnectionUtil();
			
			String sqlInsertQuery="insert into student(sname,sage,saddress,gender) values(?,?,?,?)";
			if(connection!=null)
				pstmt=connection.prepareStatement(sqlInsertQuery);
			
			
			if(pstmt!=null) {
				pstmt.setString(1, "Gill");
				pstmt.setInt(2, 23);
				pstmt.setString(3, "MI");
				pstmt.setString(4,"M" );
			}
			
			int rowCount = pstmt.executeUpdate();
			System.out.println("Number of rows updated :: "+rowCount);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
			pp.jdbcStopLeak(connection, pstmt, null);
		}
			catch(Exception e){
		      		e.printStackTrace();
			}
		}
		
		
		
	}
}
