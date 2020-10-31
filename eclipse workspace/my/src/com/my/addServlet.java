package com.my;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class addServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException, ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
////		res.getWriter().println(k);
//		//pass k to the sq
//		req.setAttribute("k", k);
//		
//		//call to the sq
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
		res.sendRedirect("sq?k="+k);
		 
	}
	
	
	
	
	
}
