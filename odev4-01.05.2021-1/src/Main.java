



import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;


public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(1255511,"Engin","Demirog",1999);
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.Save(customer);
		System.out.println();

	}

}
