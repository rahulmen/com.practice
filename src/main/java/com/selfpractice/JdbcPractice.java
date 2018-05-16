package com.selfpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcPractice {
	
	public static void main(String[] args) {
		try {
			String name = "com.mysql.jbbc.Driver";
			String user="root";
			String pass="root";
			Class.forName(name);
			
			Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/Employeeportal", user, pass);
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("select * from employeeInfo where name = 'Mandy'");
			
			while(rs.next()) {
				System.out.println(rs.getString("name"));
			}}catch(Exception e) {
				System.out.println(e);
			}
		}}
		
	


