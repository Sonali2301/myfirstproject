package comm.example.Dao;

import java.util.Scanner;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import comm.example.model.Employee;
import comm.example.Dao.*;

public class MyEmployeeApp {
	
	static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		int choice = 0;
		EmployeeDao dao = context.getBean("eDao",EmployeeDao.class);
		
		do {
			System.out.println("1. Add employees");
			System.out.println("2. Find Employee By Id");
			System.out.println("3. Update Employee By Id");
			System.out.println("4. Display all Employees");
			System.out.println("5. Find Employee By Name");
			System.out.println("0. Exit ");
			System.out.println("Input Your Choice: ");
		
			choice = sc.nextInt();
			
			switch (choice)
			{
			case 1:
			
			
			System.out.print("Id: ");
			int id= sc.nextInt();
			
			System.out.print("First Name: ");
			String fName= sc.next();
			
			System.out.print("Last Name:  ");
			String lName= sc.next();
			
			System.out.println("Salary: ");
			int salary=sc.nextInt();
			
		dao.addEmployee(new Employee(id, fName, lName, salary));
		
		System.out.println("Employee Added Successfully!");
		
		break;
		
		case 2:
			
			System.out.println("Enter Id to search: ");
			int id1 = sc.nextInt();
			
			Employee employee1 = dao.findByEmployeeId(id1);
			
			if(employee1 !=null)
				System.out.println(employee1.toString());
			break;
			
		case 3:
			System.out.println("Enter Id to Update: ");
			int id2= sc.nextInt();
			
			Employee employee2 = dao.findByEmployeeId(id2);
			
			if(employee2 != null)
			{
				dao.updateEmployeeById(id2);
				
			}
			else {
				System.out.println("ID NOT_FOUND.");
			}
			
			break;
			
			
		case 4:
		
			List<Employee> list = dao.getAllEmployees();
			
			for(Employee e: list)
			{
				
			System.out.println(e);
			}
			break;
			
		
	
			
	case 5:
			
			System.out.println("Enter name to search: ");
			String name = sc.next();
			
			List<Employee> employee3 = dao.findByName(name);
			
			if(employee3 !=null) {
				
				for(Employee e: employee3)
				{
					System.out.println(e.toString());
				}
			}
				
				
				
			break;
			
			
		case 0:
			
		System.exit(0);
		System.out.println("byee!!");
		break;
		
		default:
			break;
		
			}
		}
			while(choice !=0);
				
		

	}
	
}

