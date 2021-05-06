package dataAccess.concretes;

import java.util.regex.Pattern;

import dataAccess.abstracts.EMailDao;
import entities.concretes.User;

public class ControlEMailDao implements EMailDao {
	
	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	 
	
	public static boolean isEmailValid(User user) {
	Pattern pattern = Pattern.compile(EMAIL_PATTERN,Pattern.CASE_INSENSITIVE);
	return pattern.matcher(user.geteMail()).find();

}

	
	@Override
	public boolean gmailControl(User user) {
		if(isEmailValid(user)) {
			System.out.println("Email kullanilabilir. ");
			return true;
			
		}
		System.out.println("Bu emaili kullanamazsiniz. Lutfen baska bir email seciniz.");
		return false;
	}
		


	
	
}
