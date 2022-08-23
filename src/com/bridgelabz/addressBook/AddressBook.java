package com.bridgelabz.addressBook;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	Scanner sc = new Scanner(System.in);
	static ArrayList<Contacts> contactList = new ArrayList<>();	
	
	public void addContact() {   //method for adding contact from user input
		Contacts contact = new Contacts();
		System.out.println("Enter the First Name : ");
		contact.setFirstName(sc.next());
		System.out.println("Enter the Last Name : ");
		contact.setLastName(sc.next());
		System.out.println("Enter the Address : ");
		contact.setAddress(sc.next());
		System.out.println("Enter the City : ");
		contact.setCity(sc.next());
		System.out.println("Enter the State : ");
		contact.setState(sc.next());
		System.out.println("Enter the Zipcode : ");
		contact.setZip(sc.next());
		System.out.println("Enter the Mobile Number : ");
		contact.setPhoneNum(sc.next());
		System.out.println("Enter the Email Id : ");
		contact.setEmail(sc.next());
		contactList.add(contact);
	}

	public void editContact() {
		System.out.println("Enter the First Name of Contact to Edit : ");
		String firstName = (sc.next());
		boolean isAvailable = false;
		
		for(Contacts contact : contactList) {
			if(contact.getFirstName().equals(firstName)) {
				isAvailable = true;
				System.out.println("Enter the First Name : ");
				contact.setFirstName(sc.next());
				System.out.println("Enter the Last Name : ");
				contact.setLastName(sc.next());
				System.out.println("Enter the Address : ");
				contact.setAddress(sc.next());
				System.out.println("Enter the City : ");
				contact.setCity(sc.next());
				System.out.println("Enter the State : ");
				contact.setState(sc.next());
				System.out.println("Enter the Zipcode : ");
				contact.setZip(sc.next());
				System.out.println("Enter the Mobile Number : ");
				contact.setPhoneNum(sc.next());
				System.out.println("Enter the Email Id : ");
				contact.setEmail(sc.next());
			}
		}
		if(isAvailable == false) {
			System.out.println("Contact Not Available.");
		}
	}

	public void deleteContact() {
		System.out.println("Enter the First Name to Delete the Contact : ");
		String firstName = (sc.next());
		boolean isAvailable = false;
		
		for(Contacts contact : contactList) {
			if(contact.getFirstName().equalsIgnoreCase(firstName)) {
				isAvailable = true;
				contactList.remove(contact);
				System.out.println("Contact is Deleted ");
				break;
			}
		}
		if(isAvailable == false) {
			System.out.println("Contact Not Available.");
			
		}	
	}

	public void displayContact() { //method for displaying all entries in the ArrayList	

		for ( int i = 0; i < contactList.size(); i++ ) {
			Contacts contact = contactList.get(i);
			System.out.println(contact.toString());
			}

		}
	}
