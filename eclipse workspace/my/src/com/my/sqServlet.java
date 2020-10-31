package com.my;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class sqServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res ) throws IOException
	{
		res.getWriter().println("hello i'am from sqservlet");
	}

}
