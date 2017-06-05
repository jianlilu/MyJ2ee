<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" import="com.lu.bean.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<%
    Hero hero =new Hero();
    hero.setName("盖伦");
    hero.setHp(616);
     
    request.setAttribute("hero", hero);
%>
  
英雄名字 ： ${hero.name} <br>
英雄血量 ： ${hero.hp} <br>

<%
	Hero h = new Hero();
	h.setDamage(356);
	h.setId(999);
	h.setName("alphalu");
	
	request.setAttribute("lu", h);

%>

${lu.name} <br>
${lu.id } <br>
${lu.damage }


