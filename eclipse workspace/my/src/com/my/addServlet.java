package com.my;

import java.io.IOException;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;


public class addServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException, ServletException
	{
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/salon","root","");
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("select * from managers");
			
			rs.next();

			String name = rs.getString("nic");
			
//			String json = new Gson().toJson(name);
//			res.setContentType("application/json");
//	         res.setCharacterEncoding("UTF-8");
			res.getWriter().write(name);
			
	         
			
			
		} 
		
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		
		
		
	
		
		
		
		 
	}
	
	
	
	
	
}
