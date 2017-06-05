<!-- forEach --> 
<%-- 
在本例中，分别使用for循环和<c:forEach标签来演示遍历一个List的区别
<c:forEach items="${heros}" var="hero" varStatus="st"  >

items="${heros}" 表示遍历的集合
var="hero" 表示把每一个集合中的元素放在hero上
varStatus="st" 表示遍历的状态
 --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<%
    List<String> heros = new ArrayList<String>();
    heros.add("塔姆");
    heros.add("艾克");
    heros.add("巴德");
    heros.add("雷克赛");
    heros.add("卡莉丝塔");
    request.setAttribute("heros",heros);
%>
<%
	List<String> stu = new ArrayList<String>();
	stu.add("haha");
	stu.add("hehe");
	stu.add("lala");
	stu.add("foo");
	request.setAttribute("stu", stu);

%>

<table width="250px" align="center" border="1" cellspacing="0">
  <tr>
    <th>head01</th>
    <th>head02</th>
  </tr>
 <%
 	int j = 0;
 	for(String s : stu) {
 		j++;
 	
 %> 
  
  <tr>
    <td><%=j%></td>
    <td><%=s%></td>
  </tr>
  
  <%}%>
  
</table>
<br>

<!--  使用jsp中的for循环来遍历List  -->

<table width="200px" align="center" border="1" cellspacing="0">
<tr>
    <td>编号</td>
    <td>英雄</td>
</tr>
   
<%
int i =0;
for (String hero : heros) {
i++;
%>
  
<tr>
    <td><%=i%></td>
    <td><%=hero%></td>
</tr>
  
<%}%>
   
</table>
 

 
<br>
<!-- 使用JSTL中的c:forEach 循环来遍历List -->
<table width="200px" align="center" border="1" cellspacing="0">
<tr>
    <td>编号</td>
    <td>英雄</td>
</tr>
   
<c:forEach items="${heros}" var="hero" varStatus="st"  >
    <tr>
        <td><c:out value="${st.count}" /></td>
        <td><c:out value="${hero}" /></td>
    </tr>
</c:forEach>
</table>

<br>

<table width="250px" align="center" border="1" cellspacing="0">
  <tr>
    <th>Heading01</th>
    <th>Heading02</th>
  </tr>
  
  <c:forEach items="${stu}" var="s" varStatus="sta">
  <tr>
    <td><c:out value="${sta.count }"></c:out></td>
    <td><c:out value="${s }"></c:out ></td>
  </tr>
  </c:forEach>
</table>


