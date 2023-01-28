package DatePractise;

import java.util.Date;


public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Date udate=new Date();
		System.out.println(udate);
		long value=udate.getTime();
           
		java.sql.Date sqlDate = new java.sql.Date(value);
		System.out.println("Date is ::  "+sqlDate);
	}

}
