package comm.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HookupMyApp {

	public static void main(String[] args) {
		
		//load the configuration file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("setter-applicationContext.xml");
		
		//get the bean instance
		TennisCoach theCoach = context.getBean("myCoach",TennisCoach.class);
		
		
		//call any methods
		System.out.println(theCoach.getEmailAddress());
		
		
		//close the context
		context.close();
	}

}
