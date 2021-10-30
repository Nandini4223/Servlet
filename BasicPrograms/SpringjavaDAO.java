package BasicPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SpringjavaDAO {
	static Connection con = null; 
	 public static Connection getCon()  
   {    
   
    try {  
   	 System.out.println("creating connection");
        Class.forName("com.mysql.jdbc.Driver");  
     
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam", "root", "423");
        System.out.println("connection :"+con);
        
        if(con == null)
        {
        System.out.println("Connection not created");  
        }  else {
       	 System.out.println("connection created");
        }	 
        }
        catch (Exception e) {  
        System.out.println(e.toString());  
    }  
    return con;
} 
	 
	/*public static Connection getCon(){
        javax.sql.DataSource ds = null;
        javax.naming.InitialContext context =null;
        String dsource="";
        Connection con = null;
        try{
            dsource="java:/emploee";

            context = new javax.naming.InitialContext();
            ds = (javax.sql.DataSource) context.lookup(dsource);
            con =ds.getConnection( "root","423");

        }catch(Exception e){
            System.out.println("Exception while closing connection : "+e);
            e.printStackTrace();
        }
        return con;
    }*/

	public static Connection closecon() 
	{
		try {
			if (con !=null)
				con.close();
			System.out.println("connection is closed successfully:");
		}
		catch(SQLException se) 
		{
			se.printStackTrace();
		}
		return  con;
	}
 
	}


