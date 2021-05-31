package ECommerceProject;

import ECommerceProject.business.concretes.UserManager;
import ECommerceProject.core.GoogleRegisterAdapter;
import ECommerceProject.dataAccess.concretes.HibernateUserDao;
import ECommerceProject.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserManager userManager = new UserManager(new HibernateUserDao(), new GoogleRegisterAdapter());

	
        // BAŞARILI GİRİŞ 
		User user1 = new User(1, "elif ", "tuğba", "eliftugbaolcar@gmail.com", "123456", true);
		userManager.register(user1);
		userManager.login(user1.getEmail(), user1.getPassword());
		//userManager.login("eliftugbaolcar@gmail.com", "123456");
		System.out.println("***************************");
		
		//BAŞARISIZ ŞİFRE GİRİŞİ
		User user2 = new User(2, "ömer", "çağlar", "cglrfaruk@gmail.com", "12", false);
		userManager.register(user2);
		userManager.login(user1.getEmail(), user2.getPassword());
		//userManager.login("cglrfaruk@gmail.com", "12");
		System.out.println("***************************");
		
		//BAŞARISIZ İSİM VE SOYİSİM
		User user3 = new User(3, "s", "b", "stellabrandon", "1234567",false);
		userManager.register(user3);
		userManager.login(user1.getEmail(), user3.getPassword());
		//userManager.login("stellabrandon", "1234567"); LOGİNDE ÇAĞIRMAK VEYA BU ŞEKİLDE YAZMAK AYNI CEVAP ZATEN
		System.out.println("***************************");
		
		
		
		
	
		

	}

}
