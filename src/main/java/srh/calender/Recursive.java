package srh.calender;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Recursive {
	
	String repeat;
	String occurence;
	
	Scanner input = new Scanner (System.in);
	
	public void add() {
		
		 
	   	 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
		     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/calenderapp","root","password()12345");

		     Statement st= con.createStatement();
			
		
	System.out.println("Is this Event recursive || ENTER YES OR NO");
	        occurence = input.next();
	        
	       if (occurence.equals("yes")) {
	System.out.println("Enter number of repetition"); 
	        repeat = input.next();
	       }else {
	    	   
	        	System.out.println("Event is not recursive");
	        }
	       
	       
	       String sql="insert into `recursive` (occurence,repetition) values('" + occurence + "','" + repeat + "')";
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
