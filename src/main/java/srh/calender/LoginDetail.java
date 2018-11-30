package srh.calender;

import java.sql.*;
import java.util.Scanner;

public class LoginDetail {
	
	         String userid = "?";
	private  String username;
    private  String password;
    
    Scanner input = new Scanner (System.in);

	public void login() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/calenderapp","root","password()12345");

		    Statement st= con.createStatement();
		    
		
		System.out.println("Please Enter Username");
		    username = input.next();
		
		System.out.println("Please Enter Password");
		     password = input.next();
		     
		     String sql="insert into user(username,password) values('" + username + "','" + password + "')";
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
