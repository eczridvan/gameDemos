package nLayeredEcommerce.dataAccess.concretes;

import java.util.List;

import nLayeredEcommerce.dataAccess.abstracts.UserDao;
import nLayeredEcommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi "+ user.getName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hbernate ile güncellendi. "+ user.getName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile silindi. "+ user.getName());
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
