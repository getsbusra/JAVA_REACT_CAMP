package dataAccess.abstracts;

import entities.concretes.User;

/*Parola en az 6 karakterden olu�mal�d�r.
E-posta alan� e-posta format�nda olmal�d�r. (Regex ile yap�n�z. Ara�t�rma konusu)
E-Posta daha �nce kullan�lmam�� olmal�d�r.
Ad ve soyad en az iki karakterden olu�mal�d�r.*/
public interface UserDao {
	boolean passwordControl(User user);
	boolean nameSurnameControl(User user);
	

}
