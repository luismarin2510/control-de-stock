package com.alura.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaCnexion {
	
	public static void main(String[] args) throws SQLException {
		Connection con;
		
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC", 
					"root", 
					"Lm102052*");
		
		con.close();
	}
 
}
