<!-- forTokens -->
<%-- <c:forTokens专门用于字符串拆分，并且可以指定多个分隔符 --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<c:set var="heros" value="塔姆,艾克;巴德|雷克赛!卡莉丝塔" /> 
 
<c:forTokens items="${heros}" delims=":;|!" var="hero">
    <c:out value="${hero}" /> <br/>
</c:forTokens>

<br>
<c:set var="stus" value="a,b;c)d!e" />
<c:forTokens items="${stus }" delims=",;)!" var="stu">
	<c:out value="${stu }" /> <br>
</c:forTokens>
