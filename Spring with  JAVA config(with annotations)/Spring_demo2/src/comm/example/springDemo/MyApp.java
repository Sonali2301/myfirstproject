package comm.example.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);

			Coach myCoach = context.getBean("swimCoach",Coach.class);
		System.out.println(myCoach.getMyDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		context.close();
	}

}
