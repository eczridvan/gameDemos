package nLayeredEcommerce.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nLayeredEcommerce.business.abstracts.UserService;
import nLayeredEcommerce.core.GoogleService;
import nLayeredEcommerce.dataAccess.abstracts.UserDao;
import nLayeredEcommerce.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private GoogleService googleService;
	
	public UserManager(UserDao userDao, GoogleService googleService) {
		super();
		this.userDao = userDao;
		this.googleService = googleService;
	}
	
	 

	@Override
	public void add(User user) {
		Pattern pattern = Pattern.compile("(^(.+)@(.+)$)", Pattern.CASE_INSENSITIVE);
		
	    Matcher matcher = pattern.matcher(user.getEmail());
	    boolean matchFound = matcher.find();
	    
	    
	    if(matchFound) {
	    	if (user.getName().length() >= 2 && user.getLastName().length() >= 2 && user.getPassword().length() >= 6) {
	    		this.userDao.add(user);
	    		this.googleService.authservice("Google hesab� eklendi.");
				System.out.println("Ki�i eklendi");
				return;
			 } else {
				System.out.println("Ki�i eklenemedi. Ki�i ad� ve soyad� en az 2 karekter olmal� ve �ifre en az 6 karekterden olu�mal�");
			 }
	    } 
	    else {
	    	System.out.println("E-mail format� ge�ersiz. L�tfen ge�erli bir format giriniz.");
	    }
	    
		
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
