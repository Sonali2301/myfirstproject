package comm.example.springdemo;

public   class BaseballCoach implements Coach {
	
	private FortuneService myFortuneService;
	
	public BaseballCoach()
	{
	super();
	System.out.println("BaseballCoach : Object Created");
	}
	
	public BaseballCoach (FortuneService myFortuneService )
	{
		this.myFortuneService= myFortuneService;
		System.out.println("Dependency Injection Performed");
	}
	
	public void setMyFortuneService(FortuneService myFortuneService) {
		System.out.println("Using Setter injection");
		
		this.myFortuneService=myFortuneService;
	}

	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return "backhead 2 times daily";
	}
	
	public String getDailyFortune()
	{
		return myFortuneService.getFortune();
	}

	
}
