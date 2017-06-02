package com.lu.test;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class HelloServlet extends HttpServlet {
	 
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
 
        try {
            response.setDateHeader("Expires", 0);

            response.setHeader("Cache-Controll", "no-cache");
            response.setHeader("pragma", "no-cache");
            response.getWriter().println("<h1>Hello Servlet!</h1>");
            response.getWriter().println(new Date().toLocaleString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}




/*
public class HelloServlet extends HttpServlet {
	 
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("text/html; charset=UTF-8");
//          response.setCharacterEncoding("UTF-8");
 
            PrintWriter pw = response.getWriter();
            pw.println("<h1>绗竴娆� 浣跨敤 Servlet</h1>");
 
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
 
}
*/


/*
public class HelloServlet extends HttpServlet{
    
    public void doGet(HttpServletRequest request, HttpServletResponse response){
         
        try {
            PrintWriter pw= response.getWriter();
            pw.println("<h1>this is println()</h1>");
            pw.append("this is append()");
            pw.println("<br>");
            pw.write("this is write()");
             
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     
}
*/

/*
public class HelloServlet extends HttpServlet {
	 
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
 
        try {
            PrintWriter pw = response.getWriter();
            pw.println("<h1>Hello Servlet</h1>");
 
//          娴忚鍣ㄤ笉鑳借瘑鍒紝閭ｄ箞鎵撳紑姝ervlet灏变細寮瑰嚭涓�涓笅杞界殑瀵硅瘽妗嗐��
//          杩欐牱鐨勬墜娈典篃灏卞父甯哥敤浜庡疄鐜颁笅杞藉姛鑳�
            response.setContentType("text/lol");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}
*/