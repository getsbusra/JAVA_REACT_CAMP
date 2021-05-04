package Odev3;


public class PlayerManager {
	
	Logger[] loggers;
    public PlayerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
    public void authorization(Logger[] loggers,String message) {
    	
    	Utils.RunLoggers(loggers, message);
    	
    }
	
	public void signUp(String message) {
		
		System.out.println("Giriþ Baþarýlý...");
		System.out.println("Hoþgeldiniz.." + message);
		
		
	}
	
	public void updateInformation(String message) {
		System.out.println("Bilgileriniz guncellendi .. " + message);
		
	}
	 
	public void deleteAccount(String message) {
		System.out.println("Hesabýnýz Silindi ... " + message);
		
	}

	
    
    
}
