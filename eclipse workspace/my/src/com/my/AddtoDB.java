package com.my;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class AddtoDB extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	{
		studentDAO dao = new studentDAO();
	}

}

class studentDAO
{
	Connection con = null;
	
	public void connect() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/forJava","root","");
	}
	
	
	
	public student addStudent(student s) throws Exception
	{
		String query = "insert into student values (?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, s.id);
		pst.setString(2, s.name);
		pst.setString(3, s.school);
		pst.setString(4, s.grade);
		
		pst.executeUpdate();
		
		
		return s;
		
		
	}
}

class student
{
		int id;
		String name, school, grade;
		
}

