package tttt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.net.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
@WebServlet("/tt/token")
public class TokenServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private String URL;
	private long time;
	private String line;  
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out=resp.getWriter();
		time=System.currentTimeMillis()/1000L;
		String s="双鸿";
		URL="http://api.gpsoo.net/1/auth/access_token?account="+s+"&time="+time
				+"&signature="+MD5Utils.md5(MD5Utils.md5("199587")+time);
		System.out.println(URL);
		//http://api.gpsoo.net/1/auth/access_token?account=  &time=1499246358&signature=c1149c3c59d8408f6803a283c4b144c9	
		/*resp.sendRedirect(URL);*/
		   List<Object> list = new ArrayList<Object>();
		   list.add("hhh");
		   list.add("wwwww");
		   System.out.println("hsw:"+list.toString());
		
		 URL u = new URL(URL);  
         HttpURLConnection conn = (HttpURLConnection) u.openConnection();  
         conn.connect();
         BufferedReader in=null;
         in=new BufferedReader(new InputStreamReader(conn.getInputStream()));
         StringBuffer result=new StringBuffer();
         String assess_token = null;
         while ((line = in.readLine()) != null) {  
             System.out.println(line);  
             result.append(line);
             Token token = JSON.parseObject(line, Token.class);
             if (token.getRet()==0) {
            	 assess_token=token.getAccess_token();
				  System.out.println(token.getAccess_token());  
			}
           
         }  
         getServletContext().setAttribute("assess_token", assess_token);
         
         System.out.println(result);   
         resp.sendRedirect(req.getContextPath()+"/tt/monitor");
	}

}
