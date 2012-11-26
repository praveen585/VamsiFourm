package com.fourm.wehelpsu;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class WehelpsuFourmServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		resp.setContentType("text/plain");
		PrintWriter pr=resp.getWriter();
		pr.println("Hello, world");
		pr.println("Hai from vamsi");
		
	}
}
