package Adapter;

import tr.gov.nvi.tckimlik.WS.*;

import java.rmi.RemoteException;

import Abstract.ICostumerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements ICostumerCheckService{
     //MernisServiceAdapter 
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
	try {
		return client.TCKimlikNoDogrula(customer.nationalityId,customer.firstName.toUpperCase(), customer.lastName.toUpperCase(),customer.dateOfYear);
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
		
		
		
	}
	
	

}
