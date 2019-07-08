package comm.example.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import comm.example.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao  {
	
	private JdbcTemplate jdbcTemplate;
	Scanner sc = new Scanner(System.in);

	public EmployeeDaoImpl() 
	{
		super();
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate= jdbcTemplate;
	}

	public void addEmployee(Employee employee) 
	
	{
		// TODO Auto-generated method stub
		
		jdbcTemplate.update("insert into employee values(?,?,?,?)",employee.getEmployeeId(),employee.getFirstName(),employee.getLastName(),employee.getSalary());
		
	}


	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from employee",  new RowMapper<Employee>() {
			
			
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException  {
				
				Employee employee = new Employee();
				
				employee.setEmployeeId(rs.getInt(1));
				employee.setFirstName(rs.getString(2));
				employee.setLastName(rs.getString(3));
				employee.setSalary(rs.getInt(4));
				return employee;
			}
			
			
		});
	}


	@Override
	public Employee findByEmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("select * from employee where EmployeeID=?" , 
				
				new RowMapper<Employee>() {
			
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException
			{
				Employee employee1 = new Employee();
				employee1.setEmployeeId(rs.getInt(1));
				employee1.setFirstName(rs.getString(2));
				employee1.setLastName(rs.getString(3));
				employee1.setSalary(rs.getInt(4));
				
				return employee1;
			}
		},employeeId);
	}


	@Override
	public String updateEmployeeById(int employeeID) {
		// TODO Auto-generated method stub
		

		System.out.print("First Name: ");
		String fName= sc.next();
		
		System.out.print("Last Name:  ");
		String lName= sc.next();
		
		System.out.println("Salary: ");
		int salary=sc.nextInt();
		
	
		Employee employee2 = new Employee(employeeID, fName, lName, salary);
		 jdbcTemplate.update("update employee set FirstName=?, LastName=?, Salary=? where EmployeeID=?",
				 employee2.getFirstName(),employee2.getLastName(),employee2.getSalary(),employee2.getEmployeeId());
				
				return null;
	}


	@Override
	public List<Employee> findByName(String name) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from employee where FirstName=?", 
				
				
				new RowMapper<Employee>() {
			
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException
			{
				Employee employee1 = new Employee();
				
				employee1.setEmployeeId(rs.getInt(1));
				employee1.setFirstName(rs.getString(2));
				employee1.setLastName(rs.getString(3));
				employee1.setSalary(rs.getInt(4));
				
				return employee1;
	}
		},name);


	
		
	}

}
