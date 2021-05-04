package Odev3;

/*2.     Oyun sat��� yap�labilecek sat�� ortam�n� simule ediniz.
( Yap�lan sat��lar oyuncu ile ili�kilendirilmelidir. Oyuncunun parametre olarak metotta olmas�n� kastediyorum.)

3.     Sisteme yeni kampanya giri�i, kampanyan�n silinmesi ve g�ncellenmesi imkanlar�n� simule ediniz.

4.     Sat��larda kampanya entegrasyonunu simule ediniz.*/

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
