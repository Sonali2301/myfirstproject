package comm.example.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
	
	@Value("admin@gmail.com")
	private String emailAddress;
	
	@Value("Hyd Team")
	private String team;
	

	private FortuneService myfortuneService;
	
	
	public FootballCoach() {
		super();
	}

	
	
	public String getEmailAddress() {
		return emailAddress;
	}



	public String getTeam() {
		return team;
	}

	

	@Autowired
	public void setMyfortuneService(@Qualifier("fileFortuneService") FortuneService myfortuneService) {
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
