package com.my;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class addServlet extends HttpServlet 
{
	public void doPost(HttpServletRequest req, HttpServletResponse res ) throws IOException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
		res.getWriter().println(k);
	}
}
