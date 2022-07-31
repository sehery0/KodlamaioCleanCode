package referenceTypesDemo;

public class Customer {
	private int id;
	private String firstName;

	public Customer() {
		super();
	}

	public Customer(int id, String firstName) {
		super();
		this.id = id;
		this.firstName = firstName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
