package nLayeredEcommerce.dataAccess.concretes;

import java.util.List;

import nLayeredEcommerce.dataAccess.abstracts.UserDao;
import nLayeredEcommerce.entities.concretes.User;

public class GoogleAuthorizationUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Google hesab� ile m��teri eklendi. Eklenen m��terini ad� "+ user.getName());
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
