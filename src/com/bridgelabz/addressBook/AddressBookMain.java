package com.bridgelabz.addressBook;
import java.util.Scanner;
public class AddressBookMain {
	public static void welcome() {
		System.out.println("*****Welcome to Address Book Program*****");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int operationNo;
		
		welcome();
		
		AddressBook addressBook = new AddressBook(); // object of class AddressBook
	/*
	 * using do - while loop for printing all the options 
	 * */
		
		do {
			System.out.println("***ADDRESSBOOK SIMULATION***");
			System.out.println("\n1. ADD CONTACT \n2. DISPLAY CONTACT \n3. EDIT CONTACT \n4. EXIT ");

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
			default:
				System.out.println("Invalid entry");
				break;
			}
      
		} 
		    while (operationNo != 4);
        sc.close();
	}
	
}
