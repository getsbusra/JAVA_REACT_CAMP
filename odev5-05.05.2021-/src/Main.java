import business.abstracts.UserService;
import business.concretes.UserManager;
import core.ExServiceManagerAdapter;
import dataAccess.concretes.ControlEMailDao;
import dataAccess.concretes.ControlUserDao;
import entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new ControlUserDao(),
				new ControlEMailDao(),
				new ExServiceManagerAdapter());
		
			
		System.out.println("---BASARÝLÝ GÝRÝS---");	
		User userTrue = new User("Busra","Ustunel","1234567","busra@gmail.com"); 
		userService.signUp(userTrue);
        
		System.out.println("---BASARÝSÝZ GÝRÝS---");
		User userFalse = new User("A","Bunas","1425","bs.hotmail?kp");
		userService.signUp(userFalse);
		
		System.out.println("---GOOGLE ILE GIRIS---");
		User userGoogle = new User("125425","busra@gmail.com");
		userService.signUpWithGoogle(userGoogle);
		
		System.out.println("---GOOGLE ILE GIREMEYIS---");
		User userGoogleFalse = new User("1452","bhsshd.eýeý9*?");
		userService.signUpWithGoogle(userGoogleFalse);
       
	}
}

