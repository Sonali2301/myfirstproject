package comm.example.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
	
	@Autowired
	private FortuneService myfortuneService;
	
	
	

	public FootballCoach() {
		super();
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
	
	@PostConstruct
	public void doSomeInitStuff()
	{
		System.out.println(">>inside doSomeInitStuff");
	}
	
	@PreDestroy
	public void doSomeCleanupStuff()
	{
		System.out.println(">>inside: doSomeCleanupstuff");
	}

}
