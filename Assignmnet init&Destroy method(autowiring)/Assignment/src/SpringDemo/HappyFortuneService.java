package SpringDemo;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService

{
	
	Random random = new Random();
	List<String> temp = new ArrayList<String>();
	
	int i = 0;
	FileReader fr;
	BufferedReader br;
	
	@PostConstruct
	public void doSomeInitStuff()
	{
			
			System.out.println(">>inside : the init stuff");
			
			try
			{
				fr= new FileReader("fortuneData.txt");
				br= new BufferedReader(fr);
				
				String str;
				
				while((str =br.readLine()) != null) {
					temp.add(str);
				i++;
			}
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
	}
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		
		int j= random.nextInt(temp.size());
		return temp.get(j);
	}
	@PreDestroy
	public void doSomeCleanupStuff()
	{
		try {
			br.close();
			fr.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
			
		
			
			
			
		
	}

	


