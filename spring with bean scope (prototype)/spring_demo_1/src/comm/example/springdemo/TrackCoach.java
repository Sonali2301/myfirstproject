package comm.example.springdemo;

public class TrackCoach implements Coach{
	
	private FortuneService myFortuneService;
	
	public TrackCoach()

	{
		super();	
		}
	
	public TrackCoach( FortuneService myFortuneService)
	{
		this.myFortuneService=myFortuneService;
	}
	
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return "Run 5000 metres daily!!" ;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return myFortuneService.getFortune();
	}

}
