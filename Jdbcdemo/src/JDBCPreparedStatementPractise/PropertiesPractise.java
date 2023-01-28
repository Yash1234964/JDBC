package JDBCPreparedStatementPractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.xdevapi.Statement;

public class PropertiesPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	Connection jdbcConnectionUtil() throws Exception {
		FileInputStream fis=new FileInputStream("app.properties");
		Properties properties = new Properties();
		properties.load(fis);

		 String url = properties.getProperty("url");
		
		 String username=properties.getProperty("username");
		 String password=properties.getProperty("password");
		
		Connection connection =DriverManager.getConnection(url,username,password);
		
		return connection;
	}
	
	void jdbcStopLeak(Connection connection,PreparedStatement pstmt,ResultSet resultSet) throws Exception {
		if(connection !=null)
			connection.close();
		
		if(pstmt!=null)
		 pstmt.close();
		
		if(resultSet != null)
			resultSet.close();
		
		
	}

}
