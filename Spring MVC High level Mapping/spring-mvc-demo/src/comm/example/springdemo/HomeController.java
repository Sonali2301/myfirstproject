package comm.example.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("home")
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

	
	/*@RequestMapping("/processForm")
	public String processFormVersion2(HttpServletRequest request, Model theModel) 
	{
		String tempName = request.getParameter("name").toUpperCase().trim();
		theModel.addAttribute("message", tempName);
		
		return "helloworld";
	}*/
	
	@RequestMapping("/processForm")
	public String processFormVersion3(@RequestParam("name") String theName,Model theModel)
	{
		String temp = "Yess " + theName.toUpperCase()+ " this is spring MVC";
		theModel.addAttribute("message",temp);
		
		return "helloworld";
	}
	
	
}
