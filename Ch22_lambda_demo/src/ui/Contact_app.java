package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import business.Contact;
import business.TestContact;

public class Contact_app {
	
	public static void main (String[]args) {
		
		List<Contact> contacts = new ArrayList<>();
		
		System.out.println("hello");
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
		
		List<Contact> contactsWithoutEmail = new ArrayList<>();
		for(Contact c: contacts) {
			if(c.getEmail()==null) {
				contactsWithoutEmail.add(c);
				
			}
		}
		
		System.out.println("Contacts with no email:");
		for (Contact c: contactsWithoutEmail) {
			System.out.println(c);
		}
		
		 List<Contact> contactsWithoutPhone = new ArrayList<>();
		for(Contact c: contacts) {
			if(c.getPhone()==null) {
				contactsWithoutPhone.add(c);
				
			}
		}
		
		System.out.println("Contacts with no phone:");
		for (Contact c: contactsWithoutPhone) {
			System.out.println(c);
		}
		
		System.out.println("Lambdas!!!!");
		System.out.println("Contacts w/ no phone:");
		contactsWithoutPhone = filterContacts(contacts,
								c -> c.getPhone()==null);
		
				
		 
	}
	
	static private List<Contact> filterContacts(List<Contact> contacts,
											TestContact condition){
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c: contacts) {
			if(condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		return filteredContacts;
	}

}
