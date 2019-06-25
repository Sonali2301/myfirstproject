package comm.example.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
	
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice forward today for 2 hours!!";
	}

}
