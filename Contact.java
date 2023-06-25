/*
 * Ronald W. Sudol III
 * SNHU CS320
 * Final Project
 * 06/11/2023
 */

package MobileAppClassesAndTests;

//declare class
public class Contact {

	//declare variables
	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	//define class object
	public Contact(String id,String firstName,String lastName, String phone, String address){
		
		//assert id is not null and is not > 10
		if(id == null || id.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		//assert first name is not null and is not > 10
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		
		//assert last name is not null and is not > 10
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		
		//assert phone number is not null and exactly 10 digits
		if(phone == null || (phone.matches("\\d{10}") == false)) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
				
		//assert address is not null and is not > 30
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		// if all checks are good, create contact object
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
		
	}
	
	//getters
	public String getId() {
		return id;
	}
	public String getFirst() {
		return firstName;
	}
	public String getLast() {
		return lastName;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	
	//setters
	public void setFirst(String firstName) {
		if(firstName == null || firstName.length()>10) {
            throw new IllegalArgumentException("Invalid First Name");
        }
			this.firstName = firstName;
	}
	public void setLast(String lastName) {
		if(lastName == null || lastName.length()>10) {
            throw new IllegalArgumentException("Invalid Last Name");
        }
		this.lastName = lastName;
	}
	public void setPhone(String phone) {
		if(phone == null || (phone.matches("\\d{10}") == false)) {
            throw new IllegalArgumentException("Invalid Phone");
        }
		this.phone = phone;
	}
	public void setAddress(String address) {
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		this.address = address;
	}
	
	
}

/*
 * Rip and Tear!
 */