package comm.example.springDemo;

import org.springframework.stereotype.Component;

@Component

public class SwimCoach implements Coach{
	
	public FortuneService fortuneService;

	public SwimCoach(FortuneService fortuneService) {
		// TODO Auto-generated constructor stub
		this.fortuneService=fortuneService;
	}

	@Override
	public String getMyDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice for 1 hour";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	

}
