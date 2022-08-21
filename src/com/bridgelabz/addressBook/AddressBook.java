package com.bridgelabz.addressBook;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	Scanner sc = new Scanner(System.in);
	static ArrayList<Contacts> contactList = new ArrayList<>();	
	
public void addContact() {   //method for adding contact from user input
	System.out.println("Enter the number of contacts you want to save: ");
	int noOfContacts = sc.nextInt();
	for( int i = 0; i < noOfContacts; i++ ) {
		Contacts contact = new Contacts();
		System.out.println("Enter the contact details: ");
		System.out.println("Enter the First Name: ");
		contact.setFirstName(sc.next());
		System.out.println("Enter the Last Name: ");
		contact.setLastName(sc.next());
		System.out.println("Enter the Address:  ");
		contact.setAddress(sc.next());
		System.out.println("Enter the City: ");
		contact.setCity(sc.next());
		System.out.println("Enter the State: ");
		contact.setState(sc.next());
		System.out.println("Enter the Zip Code: ");
		contact.setZip(sc.next());
		System.out.println("Enter the Email Id: ");
		contact.setEmail(sc.next());
		System.out.println("Enter the Phone Number: ");
		contact.setPhoneNum(sc.next());	
		contactList.add(contact);  //adding the contact input to the ArrayList
	}
 }
public void displayContact() { //method for displaying all entries in the ArrayList
	System.out.println(contactList);
}

}
