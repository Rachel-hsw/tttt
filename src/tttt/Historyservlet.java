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
@WebServlet("/tt/history")
public class Historyservlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private String URL;
	private String line; 
	private List<LocationDetail> data ;
	private long time;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String assess_token=(String) getServletContext().getAttribute("assess_token");
	System.out.println("assess_token:"+assess_token);    
	time=System.currentTimeMillis()/1000L;
	//URL="http://api.gpsoo.net/1/devices/history?access_token="+assess_token+"&imei=668613160140110&begin_time=1498557000&end_time="+time+"&limit=10";
	URL="http://api.gpsoo.net/1/devices/history?access_token="+assess_token+"&imei=668613160140110&begin_time=1501597212&end_time=1501600812&limit=1000";
	System.out.println("URL"+URL);  
	 URL u = new URL(URL);  /*begin_time=1498557000&end_time=1498560000*/
     HttpURLConnection conn = (HttpURLConnection) u.openConnection();  
     conn.connect();
     BufferedReader in=null;
     in=new BufferedReader(new InputStreamReader(conn.getInputStream()));
     StringBuffer result=new StringBuffer();

     while ((line = in.readLine()) != null) {  
         System.out.println(line);  
         result.append(line);
      History history = JSON.parseObject(line, History.class);
   
      System.out.println("获取到的经纬数量："+history.getData().size());  
         if (history.getRet()==0) {
        	 for (int i=0;i<history.getData().size();i++) {
					 double lat=history.getData().get(i).getLat();
					 double lng=history.getData().get(i).getLng();
					 System.out.println("经度"+(i+1)+":"+lng+"-------纬度："+lat);   
        	
		}
       
     }  
	}
}
}