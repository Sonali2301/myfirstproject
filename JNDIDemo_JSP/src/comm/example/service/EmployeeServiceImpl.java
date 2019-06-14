package comm.example.service;

import comm.example.dao.EmployeeDao;
import comm.example.dao.EmployeeDaoImpl;
import comm.example.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDao empDao;
	
	
	public EmployeeServiceImpl() {
		super();
		
		empDao=new EmployeeDaoImpl();
	}


	@Override
	public int createEmployee(Employee employee) {
		// TODO Auto-generated method stub
			return empDao.createEmployee(employee);
			
	}
	
	
}
