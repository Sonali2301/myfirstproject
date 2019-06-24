package comm.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Traditional way of making object 
		 
		 BaseballCoach theCoach = new BaseballCoach();
		System.out.println(theCoach.BaseballCoach());   */

		
		//step-1
		//get the applicationContext

		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//get the bean
		Coach myCoach = context.getBean("myBaseballCoach",Coach.class);
		
		
		//call the appropiate method
		System.out.println(myCoach.getDailyworkout());
		System.out.println(myCoach.getDailyFortune());
		
		//close the context
		context.close();
		}

}
