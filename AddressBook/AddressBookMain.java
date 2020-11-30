package addressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
		
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to Address Book Program");		
		AddressBook addressbook = new AddressBook();		
		
		int answer=1;
	    while (answer == 1) {
	        System.out.println("Select any option for Address Book Operation");
	        System.out.println("1. Create New AddressBook");
	        int choice =sc.nextInt();

            switch(choice) {
                case 1 :
                    addressbook.newAddressBook();
                    break;

		int input=1;
		while (input == 1) {					
			System.out.println("Select any option From Menu ");
			System.out.println("1. Add Person"
							+ "\n2. Edit Person"
							+ "\n3. Delete Person"					
							+ "\n4. Display"
							+ "\n8. Quit");
			int value = scanner.nextInt();
			
			switch (value) {
			case 1 :
				addressbook.addPerson();
				break;
			case 2 :
				addressbook.editPerson();
				break;
			case 3 :
				addressbook.deletePerson();
				break;			
			case 4 :
				addressbook.display();
				break;
			case 5 :
				input = 0;
				break;
			default :
				System.out.println("Incorrect Choice" + "\nEnter a number between 1 and 5");			
		    }
		 }
	}		
}

