package nLayeredEcommerce;

import nLayeredEcommerce.business.abstracts.UserService;
import nLayeredEcommerce.business.concretes.UserManager;
import nLayeredEcommerce.core.GoogleManagerAdapter;
import nLayeredEcommerce.dataAccess.concretes.GoogleAuthorizationUserDao;
import nLayeredEcommerce.dataAccess.concretes.HibernateUserDao;
import nLayeredEcommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new HibernateUserDao(), new GoogleManagerAdapter());
		
		User user1 = new User(1, "RIDVAN", "BOZKIR", "ridvanbozkir@yandex.com", "181sdsada3");
		User user2 = new User(1, "Ali", "Veli", "ridvanbozkir@yandex.com", "dsadasdsadas");
		userService.add(user1);

	}

}
