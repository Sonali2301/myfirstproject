package comm.example.springdemo;

public class HappyFortuneService implements FortuneService{
	
	
	public HappyFortuneService() {
		
		System.out.println("HappyFortuneService : Object Created");
	}
	
	public String getFortune()
	{
		
		return "today is your lucky day!!";
		
	}

}
