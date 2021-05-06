package dataAccess.abstracts;

import entities.concretes.User;

public interface EMailDao {
	boolean gmailControl(User user);

}
