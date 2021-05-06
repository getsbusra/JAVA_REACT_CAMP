package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity{
	
	private String name;
	private String surname;
	private String password;
	private String eMail;
	
	public User(String password,String eMail) {
		this.password = password;
		this.eMail = eMail;
		
	}
	public User(String name, String surname, String password, String eMail) {
		super();
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.eMail = eMail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	
	
	

}
