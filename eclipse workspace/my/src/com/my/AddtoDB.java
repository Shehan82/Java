package com.my;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.io.IOException;

public class AddtoDB extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String school = req.getParameter("school");
		String grade = req.getParameter("grade");
		student s1 = new student();
		s1.id = id;
		s1.name = name;
		s1.school = school;
		s1.grade = grade;
		
		studentDAO dao = new studentDAO();
		try 
		{
			dao.connect();
			dao.addStudent(s1);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		try 
		{
			student s2 = dao.viewStudent(1);
			res.getWriter().println(s2.id);
			res.getWriter().println(s2.name);
			res.getWriter().println(s2.school);
			res.getWriter().println(s2.grade);
			
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
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
	
	
	
	public void addStudent(student s) throws Exception
	{
		String query = "insert into student values (?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, s.id);
		pst.setString(2, s.name);
		pst.setString(3, s.school);
		pst.setString(4, s.grade);
		
		int ok = pst.executeUpdate();
		
		
	}
	
	public student viewStudent(int id) throws SQLException
	{
		student s = new student();
		String query = "select * from student where id="+id;
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		s.id = rs.getInt(1);
		s.name = rs.getString(2);
		s.school = rs.getString(3);
		s.grade = rs.getString(4);
		return s;
	}
}

class student
{
		int id;
		String name, school, grade;
		
}

