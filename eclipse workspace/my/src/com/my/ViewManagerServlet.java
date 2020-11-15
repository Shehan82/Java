package com.my;


import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import  java.io.PrintWriter;

public class ViewManagerServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException, ServletException
    {

        try
        {
            ViewManagerModel manager = new ViewManagerModel();
            ArrayList<ManagerDetailsForView> managerDetail = new ArrayList<>();
            managerDetail = manager.getManagersDetails();
            int name = managerDetail.get(0).getEmpId();
            res.getWriter().println("hellooo");
            res.getWriter().println(name);
////
//            String json = new Gson().toJson(managerDetails);
//            res.setContentType("application/json");
//            res.setCharacterEncoding("UTF-8");
////            res.getWriter().write(json);




        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}
