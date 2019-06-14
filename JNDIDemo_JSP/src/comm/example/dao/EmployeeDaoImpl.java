package comm.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import comm.example.factory11.MyConnectionFactory;
import comm.example.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	private Connection connection;
	private MyConnectionFactory myConnectionFactory;
	@Override
	
	
	
	public int createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			System.out.println("hi");
			PreparedStatement pStatement=connection.prepareStatement("insert into employee values(?,?,?,?)");
			
			pStatement.setInt(1, employee.getEmployeeID());
			pStatement.setString(2, employee.getFirstName());
			
			pStatement.setString(3, employee.getLastName());
			pStatement.setInt(4, employee.getSalary());
		 i=pStatement.executeUpdate();
			System.out.println(i);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  return i;
	}
	public EmployeeDaoImpl() {
		super();
		
		myConnectionFactory=MyConnectionFactory.getMyConnectionFactory();
		
		connection=myConnectionFactory.connection;
		
		
	}

}
