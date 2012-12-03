package com.fourm.wehelpsu.DB;
import java.sql.*;

public class DBConnection{
	public Connection retDBConnection(){
		String dbUrl = "jdbc:mysql://WehelpsuForum.db.10048474.hostedresource.com";
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection (dbUrl,"WehelpsuForum","Happy@143");
			return con;
		} catch(ClassNotFoundException e) {
			System.out.println("In class not found: "+e.getMessage());
		}catch(SQLException e) {
			System.out.println("In sqlexception: "+e.getMessage());
		}catch(Exception e){
			System.out.println("In exception: "+e.getMessage());
		}
		return con;
	}  

}  