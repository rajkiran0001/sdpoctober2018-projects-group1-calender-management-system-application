package srh.calender;
import java.sql.*;
import java.util.Scanner;

public class Calender  {
	
	static String ans;
	
    public static void main( String[] args ) {
    	
    	LoginDetail l = new LoginDetail();
            l.login();
         
        CreateEvent c = new CreateEvent();
        CreateEvent co= new CreateEvent();
            c.create();
        
        Priority p = new Priority();
        Priority pr = new Priority();
            p.importance();
            
            
        Recursive r = new Recursive();
        Recursive re = new Recursive();
                r.add();        
            
        Folder f = new Folder();
        Folder fo = new Folder();
             f.file();
                
        Share s = new Share();
        Share sh = new Share();
             s.invite();   
             
       System.out.println ("Event Created on:");
  
        Clock ck = new Clock();
        Clock cl = new Clock();
             ck.current();        
    }
}
