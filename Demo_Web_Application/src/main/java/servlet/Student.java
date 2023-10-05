package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Student")
public class Student extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Student() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String name=request.getParameter("myname");
		String age=request.getParameter("age");
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String mobile=request.getParameter("mobile");
		String degree=request.getParameter("degree");
		String check=request.getParameter("Checkbox");
		String address=request.getParameter("textarea");
		

		String engineering=request.getParameter("eng");
		System.out.println("Name    : " +name);
		System.out.println("Age     : " +age);
		System.out.println("Email   : " +email);
		System.out.println("Gender  : " +gender);
		System.out.println("Mobile  : " +mobile);
		System.out.println("Degree  : " +degree);
		System.out.println("Hobbies : " +check);
		System.out.println("Address : " +address);
		
	pw.write("<<h2><b> Data Succesfully Submitted </b></h2>");
	pw.write("<p> Name  :  " +name+" </p>");
	pw.write("<p> Age   :  " +age+" </p>");
	pw.write("<p> Email :  " +email+" </p>");
	pw.write("<p>Gender :  " +gender+" </p>");
	pw.write("<p>Contact :  " +mobile+" </p>");
	pw.write("<p>Degree :  " +degree+" </p>");
	pw.write("<p>Deciplie :  " +engineering+" </p>");
	pw.write("<p>Hobbies :  " +check+" </p>");
	pw.write("<p>Address :  " +address+" </p>");
			
	pw.write("<table border='1' cellspacing='0'style='background-color: 12C8E1'"
			+ " align='center' width:'100%'>"
			
	+ "<tr>"
			+ "<th> Name </th>"
			+ "<th> Age </th>"
			+ "<th> Email </th>"
			+ "<th> Gender </th>"
			+ "<th> Contact </th>"
			+ "<th> Degree </th>"
			+ "<th> Disipline </th>"
			+ "<th> Hobbies </th>"
			+ "<th> Address </th>"
	+ "</tr>"
			
	+ "<tr>"
			+ "<td> "+name+" </td>"
			+ "<td> "+age+" </td>"
			+ "<td> "+email+" </td>"
			+ "<td> "+gender+" </td>"
			+ "<td> "+mobile+" </td>"
			+ "<td> "+degree+" </td>"
			+ "<td> "+engineering+" </td>"
			+ "<td> "+check+" </td>"
			+ "<td> "+address+" </td>"
	+ "</tr>"
		+ "</table>");
	

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
