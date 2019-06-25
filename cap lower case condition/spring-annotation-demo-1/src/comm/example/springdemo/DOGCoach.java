package comm.example.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DOGCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "go for walk!!!";
	}

}
