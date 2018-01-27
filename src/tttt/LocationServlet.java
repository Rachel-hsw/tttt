package tttt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
@WebServlet("/tt/monitor")
public class LocationServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private String URL;
	private String line; 
	private List<LocationDetail> data ;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("++++++++++++");   
	String assess_token=(String) getServletContext().getAttribute("assess_token");
	System.out.println("++++++++++++"+assess_token);   
	URL="http://api.gpsoo.net/1/account/monitor?access_token="+assess_token+"&map_type=BAIDU&target=双鸿";
	 System.out.println("实时位置："+URL);   
	//http://api.gpsoo.net/1/auth/access_token?account=  &time=1499246358&signature=c1149c3c59d8408f6803a283c4b144c9	
	/*resp.sendRedirect(URL);*/
	 URL u = new URL(URL);  
     HttpURLConnection conn = (HttpURLConnection) u.openConnection();  
     conn.connect();
     BufferedReader in=null;
     in=new BufferedReader(new InputStreamReader(conn.getInputStream()));
     StringBuffer result=new StringBuffer();

     while ((line = in.readLine()) != null) {  
         System.out.println(line);  
         result.append(line);
       Location location = JSON.parseObject(line, Location.class);
         if (location.getRet()==0) {
        	 for (int i=0;i<location.getData().size();i++) {
					 double lat=location.getData().get(i).getLat();
					 double lng=location.getData().get(i).getLng();
					 System.out.println("经度："+lng+"-------纬度："+lat);   
        	
		}
       
     }  
	}
     resp.sendRedirect(req.getContextPath()+"/tt/history");
}
}