package com.lu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lu.bean.HeroDAO;

public class HeroDeleteServlet extends HttpServlet {
	 
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        int id = Integer.parseInt(request.getParameter("id"));
         
        new HeroDAO().delete(id);
 
        response.sendRedirect(request.getContextPath() + "/listHero");
         
    }
}
