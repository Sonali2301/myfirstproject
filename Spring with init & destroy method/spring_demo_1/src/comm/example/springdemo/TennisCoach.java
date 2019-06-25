package comm.example.springdemo;

public class TennisCoach implements Coach{

	
	private String emailAddress;
	private String team;
	
	
	
	
	public TennisCoach() {
		super();
		System.out.println(">>tennisCoach: default constructor called ");
	}
	
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	@Override
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return "do 200 meters practice";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public void doMyInitStuff()
	{
		System.out.println(">>tennisCoach: inside doMyInitStuff()");
	}
	
	
	public void doMyCleanupStuff()
	{
		System.out.println(">>tennisCoach: inside doMyCleanupStuff()");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
