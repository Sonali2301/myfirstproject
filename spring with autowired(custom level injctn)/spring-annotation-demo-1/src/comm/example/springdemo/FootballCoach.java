package comm.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
	
	private FortuneService myfortuneService;
	
	
	

	public FootballCoach() {
		super();
	}


	//Constructor injection
	/*@Autowired
	public FootballCoach(FortuneService myfortuneService) {
		super();
		this.myfortuneService = myfortuneService;
	}
	
	//Setter injection 
	@Autowired
	public void setMyfortuneService(FortuneService myfortuneService) {
		this.myfortuneService = myfortuneService;
	}*/
	
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice forward today for 2 hours!!";
	}
	
	//Custom method injection
	@Autowired
	public void myFortuneSet(FortuneService myfortuneService) {
		this.myfortuneService = myfortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return myfortuneService.getFortune();
	}

}
