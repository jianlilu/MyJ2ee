<!-- 
EL表达式可以从pageContext,request,session,application四个作用域中取到值，如果4个作用域都有name属性怎么办？ 

EL会按照从小到大的优先级顺序获取 
pageContext>request>session>application
 -->
 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<c:set var="name" value="${'gareen-pageContext'}" scope="page" />
<c:set var="name" value="${'gareen-request'}" scope="request" />
<c:set var="name" value="${'gareen-session'}" scope="session" />
<c:set var="name" value="${'gareen-application'}" scope="application" />
  
4个作用域都有name,优先获取出来的是 ： ${name} 
 