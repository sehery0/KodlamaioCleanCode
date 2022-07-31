package workingWithMethods.business.concretes;

import workingWithMethods.business.abstracts.PersonService;
import workingWithMethods.dataAccess.abstracts.CustomerDao;
import workingWithMethods.entities.concretes.Customer;

public class CustomerManager {

	// private List<Customer> customers;

	private CustomerDao customerDao;
	private PersonService personService;

	public CustomerManager(CustomerDao customerDao, PersonService personService) {
		super();
		this.customerDao = customerDao;
		this.personService = personService;
	}

	public void add(Customer customer) {
		checkCustomerExists(customer);
		customerDao.add(customer);

	}

	private void checkCustomerExists(Customer customer) {
		if (customerDao.CustomerExists(customer)) {
			System.out.println("Müşteri mevcut");
		}
	}
}
