package comm.example.springDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:homeAdd.properties")
public class Home implements Address {
	
	@Value("${home.lane}")
	private String lane;
	@Value("${home.phNo}")
	private String contactNo;

	public String getAddress() {
		// TODO Auto-generated method stub
		return "lane"+lane+" contact no. "+contactNo; 
	}

}
