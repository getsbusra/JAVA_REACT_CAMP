package Odev3;

/*2.     Oyun satýþý yapýlabilecek satýþ ortamýný simule ediniz.
( Yapýlan satýþlar oyuncu ile iliþkilendirilmelidir. Oyuncunun parametre olarak metotta olmasýný kastediyorum.)

3.     Sisteme yeni kampanya giriþi, kampanyanýn silinmesi ve güncellenmesi imkanlarýný simule ediniz.

4.     Satýþlarda kampanya entegrasyonunu simule ediniz.*/

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new IdentifyLogger(),new NameLogger(), new SurnameLogger(), new YearOfBirthLogger()};
		PlayerManager playerManager = new PlayerManager(loggers);
		GameManager gameManager = new GameManager();
		
		
		
	    Player player = new Player(1111111111,"Busra","Ust",1999);
		
	    playerManager.authorization(loggers, player.getName()+ " " + player.getSurname());
	    System.out.println(); 
	    playerManager.signUp(player.getName() + " " + player.getSurname());
		playerManager.updateInformation(player.getName() + " " + player.getSurname());
		playerManager.deleteAccount(player.getName() + " " + player.getSurname());
		System.out.println();
		gameManager.gameSales(player);
		System.out.println();
		gameManager.gameSalesWithCampaign();
		

	}

}
