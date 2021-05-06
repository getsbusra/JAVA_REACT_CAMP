package dataAccess.abstracts;

import entities.concretes.User;

/*Parola en az 6 karakterden oluþmalýdýr.
E-posta alaný e-posta formatýnda olmalýdýr. (Regex ile yapýnýz. Araþtýrma konusu)
E-Posta daha önce kullanýlmamýþ olmalýdýr.
Ad ve soyad en az iki karakterden oluþmalýdýr.*/
public interface UserDao {
	boolean passwordControl(User user);
	boolean nameSurnameControl(User user);
	

}
