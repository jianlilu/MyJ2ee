
<%@page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
你好 JSP
 
<br><br>
<hr>
 
<%=new Date().toLocaleString()%> <br>

<%=new Date().getHours()+"点" %><%=new Date().getMinutes()+"分" %> <br>


<%-- 

<%@page contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" import="java.util.*"%>
	是JSP的<%@page指令

 
contentType="text/html; charset=UTF-8" 
	相当于response.setContentType("text/html; charset=UTF-8"); 通知浏览器以UTF-8进行中文解码
 
 
pageEncoding="UTF-8" 
	如果jsp文件中出现了中文，这些中文使用UTF-8进行编码
 
 
import="java.util.* 
	导入其他类，如果导入多个类，彼此用,逗号隔开，像这样 import="java.util.*,java.sql.*"

 --%>


