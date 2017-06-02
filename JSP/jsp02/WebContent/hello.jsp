
<%@page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%="hello jsp"%>  <!--不需要;结束 -->
<br><br>
<% out.println("hello jsp");%>	 <!--需要;结束 -->

<br><br>

<%
	List<String> words = new ArrayList<String>();
	words.add("Today");
	words.add("is");
	words.add("a");
	words.add("rainy");
	words.add("day");
%>

<table width="200px" align="center" border="1" cellspacing="0">
	
	<%	for(String word : words) { %>
			<tr>
				<td><%=word %></td>			
			</tr>
	<%  }
	%>

</table>
