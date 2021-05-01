

public class UserManager{
    
    
    public void login(User user) {

        System.out.println(user.getUserName() + " Giris Basarili...");
        System.out.println("*****HOSGELDINIZ****");

    }
    
    public void logOut(User user) {
        System.out.println(user.getUserName() + " Cikis Basarili...");
    }

    public void editProfile(User user) {

        System.out.println(user.getUserName() + " Profiliniz Guncellendi.");

    }

    public void addAddress() {
        String newAdress = "Çankaya/Ankara";
        System.out.println(newAdress + " Adresi Eklendi");


    }

    public void contact() {
        String newContact = "0555555555";
        System.out.println("Iletisim numaraniz " + newContact + " olarak guncellendi.");
        
    }
    
}
