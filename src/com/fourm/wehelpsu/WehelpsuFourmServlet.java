package com.fourm.wehelpsu;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.*;

import org.apache.jasper.tagplugins.jstl.core.Catch;
import org.mortbay.util.ajax.JSON;

import com.google.appengine.labs.repackaged.org.json.JSONObject;

@SuppressWarnings("serial")
public class WehelpsuFourmServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		try{
			resp.setContentType("text/event-stream");
			resp.setCharacterEncoding("UTF-8");
			PrintWriter pr=resp.getWriter();
			pr.print("retry: 3000\n"); //set the timeout to 10 mins in milliseconds
			pr.flush();  
			//PrintWriter pr=resp.getWriter();
			//while (true) { 
			//try {  
              //  Thread.sleep(5000);  
            //} catch (InterruptedException e) {  
            //} 
			//}
		}
		
		catch(Exception e){
			System.err.println(e);
		}
	}
}
