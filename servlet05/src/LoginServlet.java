import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class LoginServlet extends HttpServlet {
    
    public LoginServlet(){
        System.out.println("----------LoginServlet()构造方法 被调用");
    }
 
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	System.out.println("---------service()方法 被调用");
    	
    	 String name = request.getParameter("name");
         String password = request.getParameter("password");
   
         String html = null;
   
         if ("admin".equals(name) && "123".equals(password))
             html = "<div style='color:green'>success</div>";
         else
             html = "<div style='color:red'>fail</div>";
   
         PrintWriter pw = response.getWriter();
         pw.println(html);
    }

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("---------init()方法 被调用");
	}
	
	public void init(ServletConfig config) {
        System.out.println("----------init(ServletConfig)");
    }

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("----------destroy()");
	}
    
    
 
}
