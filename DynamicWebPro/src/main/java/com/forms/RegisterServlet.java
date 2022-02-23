package com.forms;
//This is a dynamic web project created by servlet technology and html(i.e. complete project from frontend to backend)
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
 public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
	 //Browser give data to server by request (i.e. server will put all the data in request object)and
	 //Server give data to Browser by response
	 //therefore we will fetch all the data from request
	 response.setContentType("text/html");
	 PrintWriter out=response.getWriter();
	 out.println("<h2>Welcome to Register Servlet</h2>");
	 //we have to use containers to store data i.e. name of type String
	 // in request we have to give our form field name
	 String name=request.getParameter("user_name");
	 String password=request.getParameter("user_password");
	 String email=request.getParameter("user_email");
	 String gender=request.getParameter("user_gender");
	 String course=request.getParameter("user_course");
	 String condition=request.getParameter("condition");
	 out.print(condition);// since the value of unchecked box is null therefore we have to put if condition
	 if(condition!=null) {
	 if(condition.equals("Checked")) {
		 out.println("<h2>Name : "+name+"<h2>");
		 out.println("<h2>Password : "+password+"<h2>");
		 out.println("<h2>Email : "+email+"<h2>");
		 out.println("<h2>Gender : "+gender+"<h2>");
		 out.println("<h2>Course : "+course+"<h2>");
		 out.println("<h2>Condition : "+condition+"<h2>");
		 
		 //some other logics like to save data into db
		 RequestDispatcher requestDispatcher=request.getRequestDispatcher("success");//url of successServlet
		 requestDispatcher.forward(request, response);
		 
		 
	 }else
	 { out.println("<h2>You have not accepted the terms and conditions<h2>");}
 }
	 else {
		 out.println("<h2>You have not accepted the terms and conditions<h2>");
		 //I want to include out put of index.html
		//get the object of request despatcher
		 RequestDispatcher requestDispatcher=request.getRequestDispatcher("index.html");//index is url pattern of index.html
		 //include
		 requestDispatcher.include(request, response);
	 }	 
 }
 
}
