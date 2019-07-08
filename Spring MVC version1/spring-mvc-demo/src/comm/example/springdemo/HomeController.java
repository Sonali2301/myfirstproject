package comm.example.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	

	
	
	
	
	
}
