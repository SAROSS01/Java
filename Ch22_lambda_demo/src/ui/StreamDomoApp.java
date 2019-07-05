package ui;

import java.util.ArrayList;
import java.util.List;

import business.Contact;

public class StreamDomoApp {

	public static void main(String[] args) {
List<Contact> contacts = new ArrayList<>();
		
		System.out.println("hello");
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
		
		// filter using Predicate interface
		contacts.stream().filter(c -> c.getPhone() == null)
						.forEach(c -> System.out.println(c.getName()));
		
		// filter and collect 
		List<Contact> contactsNoPhone = contacts.stream()
					  .filter(c -> c.getPhone() == null)
					  .collect(Collectors.toList());
		System.out.println("There are");
		
		System.out.println("Bye");

	}

}
