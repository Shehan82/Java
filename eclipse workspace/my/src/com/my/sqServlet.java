package com.my;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class sqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException
	{
		int k = Integer.parseInt(req.getParameter("k"));
		
		res.getWriter().println(k+k);
	}

}
