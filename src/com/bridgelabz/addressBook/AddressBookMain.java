package com.bridgelabz.addressBook;
import java.util.Scanner;

/*UC5
 * @author - Abhishek Kumar
 * since - 26.08.2022
 * */

public class AddressBookMain {
	
	public static void welcome() {
		System.out.println("*****Welcome to Address Book Program*****");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int operationNo;
		
		welcome();
		
		AddressBook addressBook = new AddressBook(); // object of class AddressBook
	
		while (true) {
			System.out.println("***ADDRESSBOOK SIMULATION***");

			System.out.println("\n1. ADD CONTACT \n2. DISPLAY CONTACT \n3. EDIT CONTACT \n4. DELETE CONTACT \n5. TOTAL CONTACTS \n6. EXIT ");

			System.out.println("Enter the Operation Number: ");
			operationNo = sc.nextInt();
			
			switch (operationNo) {
			case 1:
				addressBook.addContact(); 
				break;
			case 2:
				addressBook.displayContact();
				break;
			case 3:
				addressBook.editContact();
				break;
			case 4:
				addressBook.deleteContact();
				break;
			case 5:

				addressBook.numOfContacts();
				break;
			case 6:

				System.exit(0);
				break;
			default:
				System.out.println("Invalid entry");
			}

	
	}
	
}
