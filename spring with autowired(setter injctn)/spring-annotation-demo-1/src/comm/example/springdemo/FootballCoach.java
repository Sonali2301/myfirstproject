package comm.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
	
	private FortuneService myfortuneService;
	
	
	

	public FootballCoach() {
		super();
	}

	/*@Autowired
	public FootballCoach(FortuneService myfortuneService) {
		super();
		this.myfortuneService = myfortuneService;
	}*/
	
	

	@Autowired
	public void setMyfortuneService(FortuneService myfortuneService) {
		this.myfortuneService = myfortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice forward today for 2 hours!!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return myfortuneService.getFortune();
	}

}
