package srh.calender;

import java.sql.*;
import java.util.Scanner;

public class CreateEvent {
	
	String time;
	String name;
	String date;
	String description;
	String location;

	
	Scanner input = new Scanner (System.in);
	
     public void create() {
    	 
    	 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
	     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/calenderapp","root","password()12345");

	     Statement st= con.createStatement();
	     
			
	     System.out.print("Enter name of Event ");
    	     name = input.nextLine();  
    	 
    	 System.out.println("Date of Event || **** ENTER IN THIS FORMAT: dd-mm-yyyy ****");
    	     date = input.nextLine();
    	     
    	 System.out.println("Time of Event || **** ENTER IN THIS FORMAT: hr.min ****"); 
    	     time = input.nextLine();
    	        
    	 System.out.println("Description"); 
    	    description = input.nextLine(); 
    	    
    	 System.out.println("Location of Event");   
    	     location = input.next();
    	     
    	     
    	  String sql="insert into event(name,date,time,description,location) values('" + name + "','" + date + "','"+ time + "','"+description+ "','"+location+"')";
          st.executeUpdate(sql);
    	     
    	 
   //st.executeUpdate("insert into event value ('"+name+"','"+date+"','"+time+"','"+description+"','"+location+"')");
    	     
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 	 	 
     }
}
