package ECommerceProject.business.abstracts;

import ECommerceProject.entities.concretes.User;

public interface UserService {
	// business i� katman� s�n�f�mda �art bloklar� ifler puan hesaplama gibi i�lem gerektiren
	/*
	 * k�s�mlar bulunur user service interfaceseinde abstarct s�n�f�na yazd�m ��nk�
	 * soyut �uanl�k ve bu interface e yazd���m kodlar� somut s�n�fta kullanarak
	 * i�lemleri ger�ekle�tircem   
	 */
	void register(User user);
	void login(String email, String password);
}
