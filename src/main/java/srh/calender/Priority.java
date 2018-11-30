package srh.calender;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
   
public class Priority {
	String rate;
	
	Scanner input = new Scanner(System.in);
	
	public void importance() {
		
		 
   	 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
	     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/calenderapp","root","password()12345");

	     Statement st= con.createStatement();
	     
		
	System.out.println("Add Event Priority ||  ENTER 1-High..2-Medium..3-Low");	
	          rate = input.nextLine();
	          
	          String sql="insert into event(rate) values('" + rate + "')";
	          st.executeUpdate(sql);
	    	     
	          
   	    } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
	  	
	}
}
