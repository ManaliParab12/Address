package addressBook;

public class AddressBookMain {
	
	public static void main(String [] args) {
		System.out.println("Welcome to Address Book Program");	
		
		AddressBook addressbook = new AddressBook();
		addressbook.addPerson();
		addressbook.display();
	}	
}

