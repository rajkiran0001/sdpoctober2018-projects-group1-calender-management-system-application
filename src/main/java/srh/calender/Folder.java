package srh.calender;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Folder {
	
	static String latest ;
	String option;
	
	Scanner input = new Scanner(System.in);
	
	public void file() {
		
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
		     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/calenderapp","root","password()12345");

		     Statement st= con.createStatement();
		     
		
		System.out.println("Create new folder || ENTER YES OR NO");
   	             System.out.println("Enter Option");
                   option = input.next();
                   
		       if (option.equals("yes")) {
		    	 System.out.println("Enter Folder Name");
		          latest = input.next();
		System.out.println("You have successfully created " + latest + " folder");
		       }else{
		    	   
			 System.out.println("folder not created");
			 
			 
		 }
		       String sql="insert into `folder`(latest,choice) values('" + latest + "','" + option + "')";
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

