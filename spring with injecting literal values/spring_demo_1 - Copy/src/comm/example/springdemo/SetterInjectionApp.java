package comm.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("setter-applicationContext.xml");
		
		
		//get the bean
		CricketCoach myCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		System.out.println("Email Address===>"+ myCoach.getEmailAddress());
		System.out.println("Team===>"+myCoach.getTeam());
		System.out.println(myCoach.getDailyworkout());
		System.out.println(myCoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
