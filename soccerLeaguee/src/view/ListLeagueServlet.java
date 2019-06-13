package view;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.League;

/**
 * Servlet implementation class ListLeagueServlet
 */
@WebServlet("/list_leagues.view")
public class ListLeagueServlet extends HttpServlet {
private List<League> leagueList=null;
       
   
   
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
processRequest(request, response);
}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
processRequest(request, response);
}

protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




leagueList= (List<League>) getServletContext().getAttribute("leaguelist");

/*leagueList.add(new League("worldcup", 2019, "Spring"));
leagueList.add(new League("summer volley", 2018, "Summer"));
leagueList.add(new League("basketball winter", 2020, "Winter"));*/

String pageTitle = "Duke's Soccer League: List Leagues"; 

response.setContentType("text/html");
PrintWriter out= response.getWriter();



out.println("<html>");
out.println("<head>");
out.println("<title>"+pageTitle+"</title>");
out.println("</head>");
out.println("<body>");


out.println("<table border=’1’ cellpadding=’5’ cellspacing='0' width=’400’>");
out.println("<tr bgcolor='91E6A7' align='center' valign='center'height='20'>");
out.println("<td><h3 >" + pageTitle + "</h3></td>");
out.println("</tr></table>");
out.println("<table border='1' cellpadding='7' cellspacing='0'width='600'><th bgcolor='#E5E7E9'>Title</th><th bgcolor='#E5E7E9'>Year</th><th bgcolor='#E5E7E9'>Season</th>");

for(League l:leagueList)
{
out.println("<tr bgcolor='#F5CBA7' align='center' valign='center' height='15'><td>"+l.getTitle()+"</td><td>"+l.getYear()+"</td><td>"+l.getSeason()+"</td></tr>");


}

out.println("</table>");
out.println("</body>");
out.println("</html>");

}
}
