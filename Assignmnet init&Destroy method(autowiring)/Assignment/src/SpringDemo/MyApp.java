package SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach myCoach = context.getBean("badmintonCoach", Coach.class);
		System.out.println(myCoach.getDailyFortune());

	}

}
