package Odev3;

public class Player {

	private long idNo;
	private String name;
	private String surname;
	private int yearOfBirth;
	
	
	public Player(long idNo, String name, String surname, int yearOfBirth) {
		super();
		this.idNo = idNo;
		this.name = name;
		this.surname = surname;
		this.yearOfBirth = yearOfBirth;
	}


	public long getIdNo() {
		return idNo;
	}


	public void setIdNo(int idNo) {
		this.idNo = idNo;
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


	public int getYearOfBirth() {
		return yearOfBirth;
	}


	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	
	
}
