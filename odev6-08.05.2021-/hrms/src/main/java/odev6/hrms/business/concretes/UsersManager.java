package odev6.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import odev6.hrms.business.abstracts.UsersService;
import odev6.hrms.dataAccess.abstracts.UsersDao;
import odev6.hrms.entities.concretes.Users;

public class UsersManager implements UsersService {
    private UsersDao usersDao;
	
    @Override
	public List<Users> getAll() {
		// TODO Auto-generated method stub
		return this.usersDao.findAll();
	}
;
	
    
	@Autowired 
	public UsersManager(UsersDao usersDao) {
		super();
		this.usersDao = usersDao;
	}

	

}
