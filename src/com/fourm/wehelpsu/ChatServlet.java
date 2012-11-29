package com.fourm.wehelpsu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.appengine.labs.repackaged.org.json.JSONObject;

public class ChatServlet extends HttpServlet {
	int count;
	public void init(){
		count=0;
	}
public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
	
	try{
		HttpSession session = req.getSession(true);
		   
			count++;
		 
		resp.setContentType("text/plain");
		JSONObject json = new JSONObject();
		PrintWriter pr=resp.getWriter();
		
			//Map<String, String> map = new HashMap<String, String>();
	        //map.put();
	        //map.put("B", "hai2");
	        //map.put("C", "hai3");
            try {  
            	int i=0;
            	if(count > 10){
            		i = count-10;
            	}
            	for(;i<=count;i++){
            	json.put("user"+i, "comment"+i);
            	}
            } catch (Exception e) {  
            
            }  
            System.out.println(json.toString());  
            pr.write(json.toString());
            
		  
		
	}
	catch(Exception e){
		System.out.println(e);
	}
}
}
