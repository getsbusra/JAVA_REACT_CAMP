package dataAccess.concretes;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class ControlUserDao implements UserDao {

	@Override
	public boolean passwordControl(User user) {
		if(user.getPassword().length() < 6) {
			System.out.println("Parola en az 6 karakterden olusmalidir. ");
			return false;
		}
		System.out.println("Parola uygun... ");
		return true;
		
	}


	@Override
	public boolean nameSurnameControl(User user) {
		if(user.getName().length() < 2 || user.getSurname().length() < 2) {
			System.out.println("Ad Soyad en az 2 karakterden olusmalidir. ");
			return false;
		}
		System.out.println("Ad soyad uygun... ");
		return true;
		
	}

}
