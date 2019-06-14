package comm.example.view;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.model.Employee;



/**
 * Servlet implementation class SucessServlet
 */
@WebServlet("/successpage.view")
public class SuccessServlet extends HttpServlet {
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequestt(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	processRequestt(request, response);
	}
	
	protected void processRequestt(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		Employee l=(Employee)request.getAttribute("Success");
		out.println("EmployeeID: "+l.getEmployeeID()+"  Firstname: "+l.getFirstName()+"  LastName: "+l.getLastName()+"  Salary:"+l.getSalary());
		
		out.println("<a href='add_employee.html'>Back</a>");	
		out.println("<a href='index.html'>Cancel</a>");	
	}

}
