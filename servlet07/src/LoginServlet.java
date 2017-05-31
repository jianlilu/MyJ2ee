import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class LoginServlet extends HttpServlet {
	 
    private static final long serialVersionUID = 1L;
 
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        String name = request.getParameter("name");
        String password = request.getParameter("password");
 
        if ("admin".equals(name) && "123".equals(password)) {
//        	服务端跳转
            request.getRequestDispatcher("success.html").forward(request, response);
        }else {
//        	服务端跳转
//        	服务端跳转可以看到浏览器的地址依然是/login 路径，并不会变成success.html
//        	request.getRequestDispatcher("fail.html").forward(request, response);
        	
//        	客户端跳转
        	 response.sendRedirect("fail.html");
        }
 
    }
 
}
