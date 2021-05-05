package gameOver;

public class BaseManager implements UserService {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + "adl� kullan�c� kaydedildi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() +"adl� kullan�c�n�n bilgileri g�ncellendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + "adl� kullan�c�n�n hesab� silindi.");
		
	}

}
