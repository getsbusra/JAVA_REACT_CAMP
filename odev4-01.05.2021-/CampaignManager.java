package Odev3;

public class CampaignManager {
	 
	Campain campain1 = new Campain("Yaz kampanyasi", 0.5, 3);
	Campain campain2 = new Campain("Mayis kampanyasi", 0.7, 2);
	Campain campain3 = new Campain("Kis kampanyasi",0.95,1);
	
	
	public CampaignManager(Campain campain1, Campain campain2, Campain campain3) {
		this.campain1 = campain1;
		this.campain2 = campain2;
		this.campain3 = campain3;
	}

	public void campainEntry(Campain campain) {
		System.out.println(campain.getCampainName() + " isimli kampanya basariyla girildi.");
	}
	
	public void updateCampain(Campain campain) {
		System.out.println(campain.getCampainName() + " isimli kampanya basariyla guncellendi.");
		
	}
	
	public void deleteCampaign(Campain campain) {
		System.out.println(campain.getCampainName() + " isimli kampanya basariyla silindi.");
		
	}

}
