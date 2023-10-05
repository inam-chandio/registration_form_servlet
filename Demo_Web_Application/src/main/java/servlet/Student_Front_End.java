package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Student_Front_End
 */
@WebServlet("/Student_Front_End")
public class Student_Front_End extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Student_Front_End() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter pw = response.getWriter();
	pw.write("<h1 stype='color:blue' align='center'>Registration Form</h1> ");
	pw.write("<html>");
	pw.write("<title> Create a form by using servlet </title>");
	pw.write("<body bgcolor='12E15A'>");
	pw.write("<div align='center'> <form action='Student'>"
			+ " <fieldset> <legend>Registration Form:</legend>"
			+ "<b>Name</b>   : <input type='text' name='myname'  </br> </br></br>" 
			+ "<b>Age</b>    : <input type='text' name='age'      </br> </br></br>"
			+ "<b>Email  </b>: <input type='text' name='email'  </br> </br></br>"
			+ "<b>Gender</b> : <input type='radio' name='gender' value='male' > Male\r\n"
			+ "<input type='radio' name='gender' value='female' > Female<br><br>"
			+ "<b>Contact</b> : <input type='text' name='mobile' id='mobile'>"
			+ "<h2 style='color:#1225E1'> Educational Qualification</h2>"
			+ "<b>Degree</b>: <select name='degree' id='degree'>\r\n"
			+ "        <option selected>-- Select Group --</option>\r\n"
			+ "        <option>B.Com</option>\r\n"
			+ "        <option>B.sc</option>\r\n"
			+ "        <option>B.com Computers</option>\r\n"
			+ "        <option>B.A</option>\r\n"
			+ "      </select><br>\r\n"
			+ "      <br>"
			+ "<b>Engineering</b>: <select name='eng' id='eng'>\r\n"
			+ "        <option selected>-- Select Group --</option>\r\n"
			+ "        <option>CSE</option>\r\n"
			+ "        <option>ECE</option>\r\n"
			+ "        <option>CIVIL</option>\r\n"
			+ "        <option>EEE</option>\r\n"
			+ "     </select><br><br>"
			
			
			+ "<b>Hobbies</b>: <input type='checkbox' name='Checkbox' value='Cricket' id='CheckboxGroup1'>Playing Cricket\r\n"
			+ "<input type='checkbox' name='Checkbox' value='Reading' id='CheckboxGroup2'>Reading Books<br><br>\r\n"
			+ "<h2 style='color:#1225E1'>Address</h2>\r\n"
			+ "<textarea name='textarea' cols='35' rows='5' id='textarea'></textarea><br>\r\n"
			+ "<br>"
			
			+"<input type='Submit' value='Submit'>"
			
			+ "</fieldset>\r\n"
			+ "</form></div>");
	
	pw.write("</body>");
	pw.write("</html>");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
