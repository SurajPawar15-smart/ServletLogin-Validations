package mypack;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnectionProvider implements MyProvider {
 static Connection con=null;
 public static Connection getCon()
 {
	 try{
		 Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection(connUrl,username,password);
	 }
	 catch(Exception e){
		 e.printStackTrace();
	 }
	 return con;
 }
}
//com.mysql.jdbc.Driver