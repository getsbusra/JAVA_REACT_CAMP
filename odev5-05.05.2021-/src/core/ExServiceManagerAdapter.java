package core;

import ExternalService.ExServiceManager;

public class ExServiceManagerAdapter implements ExServiceService {

	@Override
	public void ex(String message) {
		ExServiceManager exServiceManager = new ExServiceManager();
		exServiceManager.ex(message);
		
		
	}
	

}
