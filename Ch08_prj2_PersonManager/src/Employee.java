
public class Employee extends Person {
	private String ssn;

	public Employee(String first, String last, String ssn) {
		super(first, last);
		this.ssn = ssn;
	}

	public String getCustomerNumber() {
		return ssn;
	}

	public void setCustomerNumber(String ssn) {
		this.ssn = ssn;
	}
	
	@Override
	public String toString() {
		String x = super.toString() + "SSN: " + ssn;
		return "You entered a new Employee \n" + x;
	}
	
	

}
