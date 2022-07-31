package workingWithMethods;


import workingWithMethods.business.abstracts.EmployeeService;
import workingWithMethods.business.abstracts.PersonService;
import workingWithMethods.business.concretes.CustomerManager;
import workingWithMethods.business.concretes.EmployeeManager;
import workingWithMethods.core.adapters.KpsServiceAdapter;
import workingWithMethods.dataAccess.concretes.NhCustomerDao;
import workingWithMethods.entities.concretes.Customer;
import workingWithMethods.entities.concretes.Person;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager=new CustomerManager(new NhCustomerDao(), new KpsServiceAdapter());
			
		 
		Customer customer1 = new Customer(1, "Engin", "Demirog", "123456", 1, 1990);
		Customer customer2 = new Customer(2, "Derin", "Demirog", "123454", 1, 2015);
		
		System.out.println("Eklendi");
		
		


	}

}
