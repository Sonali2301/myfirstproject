package comm.example.service;

import java.util.List;

import comm.example.model.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();

	public Employee findByEmployeeId(int employeeId);
	
	public String updateEmployeeById(int employeeID);
	
	public List<Employee> findByName(String name);
	
}