package comm.example.Dao;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import comm.example.service.EmployeeService;
import comm.example.service.EmployeeServiceImpl;

@Configuration
public class EmployeeConfig {
	
	@Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource dst = new DriverManagerDataSource();
		
		dst.setUrl("jdbc:mysql://localhost:3306/sonali");
		dst.setUsername("root");
		dst.setPassword("root");
		return dst;
	}
	
	@Bean
	public JdbcTemplate jdbc()
	{
		JdbcTemplate js = new  JdbcTemplate();
		
		js.setDataSource(dataSource());
		return js;
		
	}
	
	@Bean
	public EmployeeDao empDao()
	{
		EmployeeDaoImpl emp = new EmployeeDaoImpl();
		
		emp.setJdbcTemplate(jdbc());
		
		return emp;
	}
	
	@Bean
	public EmployeeService empService()
	{
		EmployeeServiceImpl emps = new EmployeeServiceImpl();
		
		emps.setEmpDao(empDao());
		
		return emps;
	}
}
