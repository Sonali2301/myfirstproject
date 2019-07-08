package comm.example.service;

import java.util.List;

import comm.example.Dao.EmployeeDao;
import comm.example.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDao empDao;

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println(employee);
		
		empDao.addEmployee(employee);
	}
	
	

	public void setEmpDao(EmployeeDao empDao) {
		this.empDao = empDao;
	}



	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return empDao.getAllEmployees();
	}

	@Override
	public Employee findByEmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		return empDao.findByEmployeeId(employeeId);
	}

	@Override
	public String updateEmployeeById(int employeeID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findByName(String name) {
		// TODO Auto-generated method stub
		return empDao.findByName(name);
	}
	
	

}
