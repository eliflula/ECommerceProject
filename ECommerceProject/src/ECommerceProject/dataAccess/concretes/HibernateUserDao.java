package ECommerceProject.dataAccess.concretes;


import java.util.List;

import ECommerceProject.dataAccess.abstracts.UserDao;
import ECommerceProject.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	// ekleme i�lemi  
    @Override
	public void add(User user) {
		System.out.println( user.getFirstname() + "  "+ user.getLastname()+"  adl� kullan�c� eklendi.");

		
	}
     // g�ncelleme i�lemi
	@Override
	public void update(User user) {
		System.out.println(user.getFirstname()+ " "+  user.getLastname()+" adl� kullan�c�n�n bilgileri g�ncellendi .");

		
	}
    //silme i�elemi
	@Override
	public void delete(User user) {
		
		System.out.println(user.getFirstname()+ " "+  user.getLastname()+" adl� kullan�c�n�n bilgileri sistemden silindi .");
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}