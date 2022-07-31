package workingWithMethods.dataAccess.abstracts;

import workingWithMethods.entities.concretes.Customer;

public interface CustomerDao {
	void add(Customer customer);
	boolean CustomerExists(Customer customer);

}
