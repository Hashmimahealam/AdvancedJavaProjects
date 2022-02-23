package com.attr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S2
 */
@WebServlet("/S2")
public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	  public S2() { super(); // TODO Auto-generated constructor stub }
	  }
	 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int nn1=Integer.parseInt(request.getParameter("n1"));
		int nn2=Integer.parseInt(request.getParameter("n2"));
		int pro=nn1*nn2;
		int sum=(int)request.getAttribute("sum");
		PrintWriter out=response.getWriter();
		out.println("<h1>");
		out.println("Sum is "+sum +" This is taken by getAttribute() method and sum is set at s1 servlet");
		out.print("<br>");
		out.println("Product is "+ pro);
		out.println("</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
