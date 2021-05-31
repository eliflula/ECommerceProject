package ECommerceProject.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ECommerceProject.business.abstracts.UserService;
import ECommerceProject.core.GoogleService;
import ECommerceProject.dataAccess.abstracts.UserDao;
import ECommerceProject.entities.concretes.User;

public class UserManager implements UserService{
	/*
	 * bu class da iş katmanlarını yapıyorum ki programda nelerin istediği neler
	 * olduğu somutça beli olsun
	 */
	
	private List<String> emailList = new ArrayList<String>();
	private List<String> passwordList = new ArrayList<String>();


	private UserDao userDao;
	private GoogleService googleService;
	
	
	
	//private ettiğim userdao ve googleservice i public yaptım
	public UserManager(UserDao userDao, GoogleService googleService) {
		super();
		this.userDao = userDao;
		this.googleService = googleService;
	}

	//regex sistemini kullandım ki mailde eposta formatında olsun 
	// bu metodu boolean yaptım çünkü aşagıda kontrol ettiğimde true veya false değeri dönsün
	public static boolean isEmailValid(String email) {

		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(email);

		return matcher.matches();
	}

	public static boolean isEmailValidOnClick(String email) {
		return true;

	}
	

	@Override
	public void register(User user) {
		//ŞİFRE KONTROLÜ
		
	if (user.getPassword().length() < 6 || user.getPassword() == null) {
		System.out.println("Parolaniz en az 6 karakter olmalı");
		return;
	}
		
		// MAİL KONTROLÜ
	if (emailList.contains(user.getEmail())) {
		System.out.println("Girdiginiz mail adresiyle daha önce kayıt olundu");
		return;
		}	
	
	// AD SOYAD KONTROLÜ
	if (user.getFirstname().length() < 3 || user.getFirstname().length() < 3) {
		System.out.println("Ad ve soyad en az 2 karakter olmalıdır");
		return;

		} 
			// verilen bilgiler doğru girildi mail adresinize onay kodu gidecek
	else {
		System.out.println("Bilgileriniz doğru lütfen mail adresiniz ve onay kodunu onaylayınız  " + user.getEmail()+" kontrol ediniz");
	}

		// mail onaylandı ve kayot kusursuz bir şeklide tamamlandı
	if (isEmailValidOnClick(user.getEmail())) {
		System.out.println("kayıt işleminiz başarılı :)");
		
		emailList.add(user.getEmail());
		passwordList.add(user.getPassword());
		this.userDao.add(user);
		this.googleService.registerToSystem(null);
		} 
	else {
		System.out.println("Mail adresinizi kontrol ediniz bir şeyler ters gitti :(");
	}
	}

     // daha sonra girmek için mail ve şifre onay kısmı "login"
	@Override
	public void login(String email, String password) {
		if (emailList.contains(email) && passwordList.contains(password)) {
			System.out.println("Sisteme başarılı bir şekilde girdiniz");
			
		} else {
			System.out.println("Mail adresinizi veya parolanızı lütfen kontrol ediniz");
		
	}
	}
}
	
