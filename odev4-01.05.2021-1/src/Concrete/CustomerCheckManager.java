package Concrete;


import Abstract.ICostumerCheckService;
import Entities.Customer;


public class CustomerCheckManager implements ICostumerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}
	
}
