package Odev3;

public class GameManager {
	
	Game game1 = new Game(1, "Araba Yarisi", 100);
	Game game2 = new Game(2, "Konsol", 50);
	Game game3 = new Game(3, "Yapboz", 150);
	Campain campain = new Campain();
	
	
	public void gameSales(Player player) {
		System.out.println(player.getName() + " oyuncusuna " + game1.getName() + " oyunu satilmistir.");
		System.out.println(player.getName() + " oyuncusuna " + game2.getName() + " oyunu satilmistir.");
		System.out.println(player.getName() + " oyuncusuna " + game3.getName() + " oyunu satilmistir.");
	}
    
	public void gameSalesWithCampaign() {
		Double priceWithCampaign = game1.getPrice() - (game1.getPrice()*campain.getDiscountRate());
		System.out.println("Araba Yarisi oyununun kampanyali fiyati : " + priceWithCampaign);
		Double priceWithCampaign2 = game2.getPrice() - (game1.getPrice()*campain.getDiscountRate());
		System.out.println("Konsol oyununun kampanyali fiyati : " + priceWithCampaign2);
		Double priceWithCampaign3 = game3.getPrice() - (game1.getPrice()*campain.getDiscountRate());
		System.out.println("Yapboz oyununun kampanyali fiyati : " + priceWithCampaign3);
		
		
	}
}
