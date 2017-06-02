import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class HelloServlet extends HttpServlet {
	 
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
 
        try {
            response.setDateHeader("Expires", 0);
//            设置不使用缓存
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
            pw.println("<h1>第一次 使用 Servlet</h1>");
 
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
 
//          浏览器不能识别，那么打开此servlet就会弹出一个下载的对话框。
//          这样的手段也就常常用于实现下载功能
            response.setContentType("text/lol");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}
*/