package comm.example.springDemo;

import org.springframework.stereotype.Component;

@Component

public class SwimCoach implements Coach{
	
	

	@Override
	public String getMyDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice for 1 hour";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Best of luck";
	}
	
	

}
