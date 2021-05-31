package ECommerceProject.dataAccess.abstracts;

import java.util.List;

import ECommerceProject.entities.concretes.User;

public interface UserDao {
	// dataAccess veri eriþim katmanýdýr. 
	// dataAccess e veri eriþim dýþýnda kod yazýlmaz 
	// userDao implements eder hibernatedaoyu

	void add(User user);

	void update(User user);

	void delete(User user);

	User get(int id);

	List<User> getAll();
	
	
	
	
	
}
