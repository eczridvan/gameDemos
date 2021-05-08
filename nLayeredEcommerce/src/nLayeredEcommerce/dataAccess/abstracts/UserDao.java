package nLayeredEcommerce.dataAccess.abstracts;

import java.util.List;

import nLayeredEcommerce.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	List<User> getAll();
}
