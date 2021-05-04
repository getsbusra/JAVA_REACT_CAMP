package Odev3;

public class Campain {
	private String campainName;
	private double discountRate;
	private int limitedPerson;
	
	public Campain() {
		
	}
	public Campain(String campainName, double discountRate, int limitedPerson) {
		super();
		this.campainName = campainName;
		this.discountRate = discountRate;
		this.limitedPerson = limitedPerson;
	}
	
	public String getCampainName() {
		return campainName;
	}
	public void setCampainName(String campainName) {
		this.campainName = campainName;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public int getLimitedPerson() {
		return limitedPerson;
	}
	public void setLimitedPerson(int limitedPerson) {
		this.limitedPerson = limitedPerson;
	}
	
	

}
