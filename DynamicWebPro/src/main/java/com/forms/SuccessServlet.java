package com.forms;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuccessServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Press Alt + Shift + S + V to quickly implement/override methods in Eclipse
		//super.doPost(req, resp);
		resp.setContentType("text/html");
		PrintWriter printWriter=resp.getWriter();
		printWriter.println("This is success Servlet");
		printWriter.println("<h2>Registration was successful<h2>"+ new Date().toString());
	}
	

}
