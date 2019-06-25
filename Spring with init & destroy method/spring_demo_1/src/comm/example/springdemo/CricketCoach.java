package comm.example.springdemo;

public class CricketCoach implements Coach{
	
	private String emailAddress;
	private String team;
	
	private FortuneService fortuneService;
	
	
	
	

	public CricketCoach() {
		super();
	}
	
	

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

 

	public void setTeam(String team) {
		this.team = team;
	}



	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	
	


	public String getEmailAddress() {
		return emailAddress;
	}



	public String getTeam() {
		return team;
	}




	@Override
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return "do fast bowling practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	
	
	
	

}
