package tttt;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet implements javax.servlet.Servlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		
	}

	public ServletConfig getServletConfig() {
		return null;
	}
//服务
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("你好，师姐");
	}

	public String getServletInfo() {
		return null;
	}

	public void destroy() {
		
	}


	
}
