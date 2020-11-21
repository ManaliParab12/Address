package addressBook;

public class Person {
	
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private long phoneNumber;
	private int zip;		
	
	Person(String firstName, String lastName, String city, String state, long phoneNumber, int zip) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.phoneNumber = phoneNumber;
		this.zip = zip;
		}
	}
