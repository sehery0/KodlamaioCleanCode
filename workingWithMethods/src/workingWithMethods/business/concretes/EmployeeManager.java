 package workingWithMethods.business.concretes;

import java.util.List;

import workingWithMethods.business.abstracts.EmployeeService;
import workingWithMethods.dataAccess.abstracts.EmployeeDao;
import workingWithMethods.entities.concretes.Employee;

public class EmployeeManager implements EmployeeService{

	private EmployeeDao employeeDao;
	
	
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}


	@Override
	public List<Employee> getAll() {
		return null;
	}

}
