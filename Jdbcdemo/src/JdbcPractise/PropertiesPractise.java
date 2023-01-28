package JdbcPractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
public class PropertiesPractise {
    
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
               
		FileInputStream fis=new FileInputStream("app.properties");
		Properties properties = new Properties();
		properties.load(fis);
		
		 String url = properties.getProperty("url");
		
		 String username=properties.getProperty("username");
		 String password=properties.getProperty("password");
		
		
		System.out.println(username);
		
	}
	Connection JDBCconnectionutil() throws Exception {
		
		FileInputStream fis=new FileInputStream("app.properties");
		Properties properties = new Properties();
		properties.load(fis);
		
		 String url = properties.getProperty("url");
		
		 String username=properties.getProperty("username");
		 String password=properties.getProperty("password");
		 Connection connection = DriverManager.getConnection(url,username,password);
		 
		 return connection;
		
	}

	
}
