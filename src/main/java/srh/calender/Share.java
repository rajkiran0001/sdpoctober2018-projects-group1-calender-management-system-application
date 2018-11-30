package srh.calender;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Share extends Folder{
	String send;

	Scanner input = new Scanner(System.in);
	
	public void invite(){
		
		 
	   	 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
		     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/calenderapp","root","password()12345");

		     Statement st= con.createStatement();
		     
		
		System.out.println("Do you want to share this event ||  ENTER YES OR NO ");
		     send = input.next();
		     
		     if (send.equals("yes")) {
		    	 System.out.println("Event has been shared to "  + Folder.latest);
		     }else {
		    	 
		    	 System.out.println("Event was not shared");
		     }
		     
		     String sql="insert into `share`(invite) values('" + send + "')";
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
