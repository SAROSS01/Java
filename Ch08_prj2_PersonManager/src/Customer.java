
public class Customer extends Person {
	private String CustomerNumber;

	
	
	
	public Customer(String first, String last, String number) {
		super(first, last);
		this.CustomerNumber = number;
	}

	public String getCustomerNumber() {
		return CustomerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		CustomerNumber = customerNumber;
	}
	
	@Override
	public String toString() {
		String x = super.toString() + 
				 "Customer Number: " + getCustomerNumber();
		return "You entered a new Customer:\n" + x;
	}
	
	
	
	

}
