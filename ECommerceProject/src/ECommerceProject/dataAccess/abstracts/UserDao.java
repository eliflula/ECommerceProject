package ECommerceProject.dataAccess.abstracts;

import java.util.List;

import ECommerceProject.entities.concretes.User;

public interface UserDao {
	// dataAccess veri eri�im katman�d�r. 
	// dataAccess e veri eri�im d���nda kod yaz�lmaz 
	// userDao implements eder hibernatedaoyu

	void add(User user);

	void update(User user);

	void delete(User user);

	User get(int id);

	List<User> getAll();
	
	
	
	
	
}
