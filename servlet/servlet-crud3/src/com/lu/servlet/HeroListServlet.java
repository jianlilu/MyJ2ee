package com.lu.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lu.bean.HeroDAO;
import com.lu.dao.Hero;

public class HeroListServlet extends HttpServlet {
	 
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
         
        List<Hero> heros = new HeroDAO().list();
 
        StringBuffer sb = new StringBuffer();
        sb.append("<table align='center' border='1' cellspacing='0'>\r\n");
        sb.append("<tr><td width='100'>id</td><td width='150'>name</td><td width='150'>hp</td><td width='150'>damage</td><td width='100'>delete</td></tr>\r\n");
 
        String trFormat = "<tr><td>%d</td><td>%s</td><td>%f</td><td>%d</td><td><a href='deleteHero?id=%d'>delete</a></td></tr>\r\n";
 
        for (Hero hero : heros) {
            String tr = String.format(trFormat, hero.getId(), hero.getName(), hero.getHp(), hero.getDamage(),hero.getId());
            sb.append(tr);
        }
 
        sb.append("</table>");
 
        response.getWriter().write(sb.toString());
 
    }
}
