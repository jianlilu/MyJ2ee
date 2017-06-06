package com.lu.c;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lu.m.Hero;
import com.lu.m.HeroDAO;

public class DeleteHeroServlet extends HttpServlet {
	 
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    

    	int id = (int)request.getAttribute("id");
    	System.out.println(id);
    	new HeroDAO().delete(id);
//        request.setAttribute("hero", hero);
        request.getRequestDispatcher("listHero.jsp").forward(request, response);
 
    }
}