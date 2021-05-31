package ECommerceProject.business.abstracts;

import ECommerceProject.entities.concretes.User;

public interface UserService {
	// business iþ katmaný sýnýfýmda þart bloklarý ifler puan hesaplama gibi iþlem gerektiren
	/*
	 * kýsýmlar bulunur user service interfaceseinde abstarct sýnýfýna yazdým çünkü
	 * soyut þuanlýk ve bu interface e yazdýðým kodlarý somut sýnýfta kullanarak
	 * iþlemleri gerçekleþtircem   
	 */
	void register(User user);
	void login(String email, String password);
}
