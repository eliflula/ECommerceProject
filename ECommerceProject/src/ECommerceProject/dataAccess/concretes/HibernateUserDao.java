package ECommerceProject.dataAccess.concretes;


import java.util.List;

import ECommerceProject.dataAccess.abstracts.UserDao;
import ECommerceProject.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	// ekleme iþlemi  
    @Override
	public void add(User user) {
		System.out.println( user.getFirstname() + "  "+ user.getLastname()+"  adlý kullanýcý eklendi.");

		
	}
     // güncelleme iþlemi
	@Override
	public void update(User user) {
		System.out.println(user.getFirstname()+ " "+  user.getLastname()+" adlý kullanýcýnýn bilgileri güncellendi .");

		
	}
    //silme iþelemi
	@Override
	public void delete(User user) {
		
		System.out.println(user.getFirstname()+ " "+  user.getLastname()+" adlý kullanýcýnýn bilgileri sistemden silindi .");
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