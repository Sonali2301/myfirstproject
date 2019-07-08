package comm.example.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showMessage()
	{
		return "main-page";
	}
	
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
	}
	
	/*@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}*/

	
	@RequestMapping("/processForm")
	public String processFormVersion2(HttpServletRequest request, Model theModel) 
	{
		String tempName = request.getParameter("name").toUpperCase().trim();
		theModel.addAttribute("message", tempName);
		
		return "helloworld";
	}
	
}
