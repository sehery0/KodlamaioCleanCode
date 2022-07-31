package workingWithMethods.dataAccess.concretes;

import workingWithMethods.dataAccess.abstracts.CustomerDao;
import workingWithMethods.entities.concretes.Customer;

public class NhCustomerDao implements CustomerDao {

	@Override
	public void add(Customer customer) {
		 System.out.println("Nhibernate kullanarak veritabanına eklendi.");		
	}

	@Override
	public boolean CustomerExists(Customer customer) {
		return false;
	}

}
