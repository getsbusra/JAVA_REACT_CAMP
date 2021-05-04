package Entities;


public class Customer {
    
	public String firstName;
	public String lastName;
	public int dateOfYear;
	public long nationalityId;
	
	public Customer() {
		
	}
	
	
	public Customer( long nationalityId,String firstName, String lastName, int dateOfYear) {
		
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfYear = dateOfYear;
		this.nationalityId = nationalityId;
	}
	
	
	
	

}
