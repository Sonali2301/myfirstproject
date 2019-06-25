package comm.example.springdemo;

import org.springframework.stereotype.Component;

@Component("theCoach")
public class TennisCoach implements Coach {
	
	
		

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice backhand today";
	}
	
	

}
