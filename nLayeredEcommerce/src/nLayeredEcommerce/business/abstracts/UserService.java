package nLayeredEcommerce.business.abstracts;

import java.util.List;

import nLayeredEcommerce.entities.concretes.User;

public interface UserService {
	void add(User user);
	void update(User user);
	List<User> getAll();
}
