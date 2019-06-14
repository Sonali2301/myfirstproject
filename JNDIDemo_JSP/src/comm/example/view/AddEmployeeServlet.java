package comm.example.view;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import comm.example.model.Employee;


/**
 * Servlet implementation class AddLeagueServlet
 */
@WebServlet("/add_employee.do")
public class AddEmployeeServlet extends HttpServlet {
	private int employeeID;
	private String firstName;
	private String lastName;
	private int salary;
	private List<String> errMsgs=null;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	    
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		errMsgs=new LinkedList<String>();
		String tempEid = request.getParameter("e_id");
		try
		{
			employeeID=Integer.parseInt(tempEid);
		}
		catch(Exception e)
		{
		
			errMsgs.add("employeeID field can't be non numeric or blank.");
		}
	
		firstName=request.getParameter("e_fname");
		if(firstName.length()<=0)
		{
			errMsgs.add("firstName field can not be blank");
		}
		
		lastName=request.getParameter("e_lname");
		
		if(lastName.length()<=0)
		{
			errMsgs.add("lastName field can not be blank \n\n");
		}
		
		String tempSal = request.getParameter("e_sal");
		try
		{
			salary=Integer.parseInt(tempSal);
		}
		catch(Exception e)
		{
		
			errMsgs.add("salary can't be non numeric or blank.");
		}
		
	
		if(!errMsgs.isEmpty())
		{
			request.setAttribute("ERROR",errMsgs );
			
			RequestDispatcher view=request.getRequestDispatcher("/errpage.view");
			view.forward(request,response);
			
		}
		
		else
		{
			//request.setAttribute("SUCCESS", new League(season, year, title));
			
			Employee emp = new Employee(employeeID, firstName, lastName, salary);
			
			
		   request.setAttribute("EmployeeSet", emp);
			RequestDispatcher view=request.getRequestDispatcher("/controller.do");
			view.forward(request, response);
		}
		
	}

}
