 	<!-- 
 pageContext表示当前页面作用域
	通过pageContext.setAttribute(key,value)的数据，只能在当前页面访问，在其他页面就不能访问了。
  	-->
	<%--  
 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%
    pageContext.setAttribute("name","gareen");
%>
 
<%=pageContext.getAttribute("name")%>

	--%>

<%-- 

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<%
    request.setAttribute("name","gareen");
%>
  
<%=request.getAttribute("name")%>
 
 --%> 
<%-- 
 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    request.setAttribute("name","gareen");
%>
 
<jsp:forward page="getContext.jsp"/>
 
--%>

<%-- 

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    request.setAttribute("name","gareen");
    response.sendRedirect("getContext.jsp");
%> 
 
  --%>
 
<%--  
 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    session.setAttribute("name","gareen");
    response.sendRedirect("getContext.jsp");
%> 
 
  --%>
  
  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    application.setAttribute("name","gareen");
    System.out.println(application == request.getServletContext());
    System.out.println(application);
    System.out.println(request.getServletContext());
    response.sendRedirect("getContext.jsp");
%>  
 