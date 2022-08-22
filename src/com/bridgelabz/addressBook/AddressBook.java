package com.bridgelabz.addressBook;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author: Abhishek
 * */

public class AddressBook {
	Scanner sc = new Scanner(System.in);
	static ArrayList<Contacts> contactList = new ArrayList<>();	
	
public void addContact() {   //method for adding contact from user input
	System.out.println("Enter the number of contacts you want to save: ");
	int noOfContacts = sc.nextInt();
	for( int i = 0; i < noOfContacts; i++ ) {
		Contacts contact = new Contacts(); // local object of class Contacts 
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

public void editContact() {
	System.out.println("Enter the first name of contact you want to edit: ");
	String name = sc.next();
	
	for ( int i = 0; i < contactList.size(); i++ ) {
		if (contactList.get(i).getFirstName().equals(name)) {
			System.out.println("select options");
			System.out.println("\n1.First Name\n2.Last Name\n3.Address\n4.City\n5.State\n6.Zip\n7.Phone Number\n8.EmailId");
		}
		int option = sc.nextInt();
		
		switch(option){
		case 1:
			System.out.println("Rename FirstName ");
			contactList.get(i).setFirstName(sc.next());
			break;
		case 2:
			System.out.print("Enter a Last name: ");
			contactList.get(i).setLastName(sc.next());
			break;
		case 3:
			System.out.print("Enter a Address: ");
			contactList.get(i).setAddress(sc.next());
			break;
		case 4:
			System.out.print("Enter a city: ");
			contactList.get(i).setCity(sc.next());
			break;
		case 5:
			System.out.print("Enter a state: ");
			contactList.get(i).setState(sc.next());
			break;
		case 6:
			System.out.print("Enter a zip code: ");
			contactList.get(i).setZip(sc.next());
			break;
		case 7:
			System.out.print("Enter a phone number: ");
			contactList.get(i).setPhoneNum(sc.next());
			break;
		case 8:
			System.out.println("Enter new Email id: ");
			contactList.get(i).setEmail(sc.next());
			break;
		default:
			System.out.println("enter valid contact");
		}
		
		System.out.println("Contact Updated");
	    }
}


public void displayContact() { //method for displaying all entries in the ArrayList	

	for ( int i = 0; i < contactList.size(); i++ ) {
		Contacts contact = contactList.get(i);
		System.out.println(contact.toString());
	}

 }
}
