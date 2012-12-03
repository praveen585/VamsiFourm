package com.fourm.wehelpsu.Registration;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class Registration extends HttpServlet{
public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
	PrintWriter pw=res.getWriter();
	String name=req.getParameter("name");
	String pass=req.getParameter("password");
	String cpass=req.getParameter("cpassword");
	String email=req.getParameter("email");
	String mobile=req.getParameter("mobile");
	try{
		
	}catch(Exception e){
		
	}
}
}