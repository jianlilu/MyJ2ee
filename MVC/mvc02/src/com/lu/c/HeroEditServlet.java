package com.lu.c;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lu.m.Hero;
import com.lu.m.HeroDAO;

public class HeroEditServlet extends HttpServlet {
	 
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
 
        
        int id = Integer.parseInt(request.getParameter("id"));
        
        Hero hero = new HeroDAO().get(id);
 
        StringBuffer format = new StringBuffer();
        response.setContentType("text/html; charset=UTF-8");
 
        format.append("<!DOCTYPE html>");
 
        format.append("<form action='updateHero' method='post' align='center' style='margin-top:80px'>");
        format.append("name &nbsp;&nbsp;&nbsp; £º<input type='text' name='name' value='%s' > <br>");
        format.append("hp &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; £º<input type='text' name='hp'  value='%f' > <br>");
        format.append("damage £º<input type='text' name='damage'  value='%d' > <br>");
        format.append("<input type='hidden' name='id' value='%d'> <br>");
        format.append("<input type='submit' value='¸ü ÐÂ'>");
        format.append("</form>");
 
        String html = String.format(format.toString(), hero.getName(), hero.getHp(), hero.getDamage(), hero.getId());
 
        response.getWriter().write(html);
       
 
    }
}