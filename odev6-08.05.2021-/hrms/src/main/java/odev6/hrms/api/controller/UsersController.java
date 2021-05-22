package odev6.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import odev6.hrms.business.abstracts.UsersService;
import odev6.hrms.entities.concretes.Users;

@RestController
@RequestMapping("/api/hrms")
public class UsersController {
	
private UsersService usersService;
	
	@Autowired
	public UsersController(UsersService userService) {
		super();
		this.usersService = userService;
	}
    
	
	@GetMapping("/getall") 
	public List<Users> getAll() {
		return this.usersService.getAll();
	}

}
