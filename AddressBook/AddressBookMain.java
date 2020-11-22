package addressBook;

import java.util.Scanner;

public class AddressBookMain {
		
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Address Book Program");	
		
		AddressBook addressbook = new AddressBook();
		
		System.out.println("Select any option to perform Operation of Person ");
	    System.out.println(" Enter 1 to add Person"
			           + "\n Enter 2 to Edit Person"
	    		       + "\n Enter 3 to display Person Information");
	    
	    int value = scanner.nextInt();
	    switch (value) {
		case 1 :
			addressbook.addPerson();
			break;
		case 2 :
			addressbook.editPerson();
			break;
		case 3 :
			addressbook.display();
			break;
		case 4 :				
			value = 0;
			break;
		default :
			System.out.println("Incorrect Choice" + "\nEnter a number between 1 and 4");			
	    }
    }	
}

