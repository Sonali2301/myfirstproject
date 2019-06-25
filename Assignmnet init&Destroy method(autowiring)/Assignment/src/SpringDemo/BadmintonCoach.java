package SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach{
	
	@Autowired
	private FortuneService myfortuneService;


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return myfortuneService.getFortune();
	}

	
	
	

}
