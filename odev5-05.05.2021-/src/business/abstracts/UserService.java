package business.abstracts;

import entities.concretes.User;

public interface UserService {
	
	void signUp(User user);
	void signUpWithGoogle(User user);
	void verification(User user);
	

}
