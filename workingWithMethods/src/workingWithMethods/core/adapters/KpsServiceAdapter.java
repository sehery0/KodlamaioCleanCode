package workingWithMethods.core.adapters;


import workingWithMethods.business.abstracts.PersonService;
import workingWithMethods.entities.concretes.Person;

public class KpsServiceAdapter implements PersonService {

	@Override
	public boolean checkPerson(Person person) {
		System.out.println(
				person.getFirstName() + person.getLastName() + person.getIdentityNumber() + person.getYearOfBirth());
		return false;
	}

}
