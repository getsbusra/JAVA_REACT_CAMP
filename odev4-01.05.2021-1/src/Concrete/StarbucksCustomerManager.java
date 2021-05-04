package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICostumerCheckService;
import Entities.Customer;
import java.lang.Exception;


public class StarbucksCustomerManager extends BaseCustomerManager{
	
	ICostumerCheckService personService;     
	BaseCustomerManager base;
	public StarbucksCustomerManager (ICostumerCheckService personService) {
		this.personService = personService;
	}

     
	@Override
    public void Save (Customer customer) {
    	 
    	 if(this.personService.CheckIfRealPerson(customer)) {
    	 base.Save(customer);
    	 }
    	 
    	 else  {
         new Exception("NOT A VALID PERSON");
    	 } 
    	 
	}
    	 
    	 
    	 
    
	
	
     
    
     

}
