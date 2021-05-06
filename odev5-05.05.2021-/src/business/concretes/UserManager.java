package business.concretes;

import business.abstracts.UserService;
import core.ExServiceService;
import dataAccess.abstracts.EMailDao;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
    private UserDao userdao;
    private EMailDao eMailDao;
    private ExServiceService exService;
	
    public UserManager(UserDao userdao, EMailDao eMailDao, ExServiceService exService) {
		super();
		this.userdao = userdao;
		this.eMailDao = eMailDao;
		this.exService = exService;
		
	}
    


   @Override
	public void signUp(User user) {
		if(userdao.nameSurnameControl(user) && userdao.passwordControl(user) && eMailDao.gmailControl(user)) {
			verification(user);
			System.out.println("Kayit Basarili..." + user.getName() + " " +  user.getSurname());
			
		}
		else if(!(userdao.nameSurnameControl(user) || userdao.passwordControl(user) || eMailDao.gmailControl(user))) {
		System.out.println("Kayit Basarisiz. Lutfen Bilgileriniz kontrol edip yeniden deneyiniz.. ");
		
		}
		this.exService.ex("Disaridan Servis erisimi Basarili. ");
	}

   
   @Override
   public void signUpWithGoogle(User user) {
	 if(userdao.passwordControl(user) && eMailDao.gmailControl(user)) {
	     System.out.println("Google hesabi dogrulaniyor..");
	     verification(user);
	     System.out.println("Kayit Basarili");
   }
	 else if(!userdao.passwordControl(user) || !eMailDao.gmailControl(user)) {
		 System.out.println("Kayit Basarisiz..");
	 }
}
  

   @Override
   public void verification(User user) {
	 System.out.println("Doðrulama Linkine Yönlendiriliyor.... ");
	
}

}
