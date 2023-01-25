package JdbcPractise;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded Successfully");
		}
		catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}

	}

}
