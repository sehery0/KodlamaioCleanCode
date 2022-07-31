package workingWithMethods.dataAccess.abstracts;
 
import java.util.List;

import workingWithMethods.entities.concretes.Employee;

public interface EmployeeDao {
	List<Employee> getAll(); 

}
