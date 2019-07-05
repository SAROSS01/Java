
public class Contact {
	
	// instance variables
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	
	// the constructor
	public Contact (String aName, String bName, String iimail, String pphone) {
		firstName = aName;
		lastName = bName;
		email = iimail;
		phone = pphone;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	 static public  String displayContact(String firstName, String lastName, String email, String phone) {
		String x = firstName;
		String y = lastName;
		String u = email;
		String i = phone;
		 String contact = ("-------------------------------------------\n"
				+ "---- Current Contact --------------------------\n"
				+ "-------------------------------------------\n"
				+ "                                           \n"
				+ "Name:					" + x + " " + y + "\n"
						+ "Email Address:				" + u + "\n"
								+ "Phone number:				" + i + "\n"
										+ "-------------------------------------------");
		return contact;
		
	}

	//@Override
	//public String toString() {
		//return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone
				//+ "]";
	}
	
	
	
	
	

