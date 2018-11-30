package srh.calender;

import java.text.SimpleDateFormat;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Clock {
	
	
	
	public void current() {
		
	   	 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
		     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/calenderapp","root","password()12345");

		     Statement st= con.createStatement();
		     
		    Date now = new Date();
	        String pattern = "yyyy-MM-dd HH:mm:ss";
	        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
	        String newdate = formatter.format(now);
	        
	        System.out.println( newdate);
		    
		
		   String sql="insert into event(current) values('" + newdate + "')";
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
