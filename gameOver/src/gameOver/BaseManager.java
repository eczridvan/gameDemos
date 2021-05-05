package gameOver;

public class BaseManager implements UserService {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + "adlý kullanýcý kaydedildi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() +"adlý kullanýcýnýn bilgileri güncellendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + "adlý kullanýcýnýn hesabý silindi.");
		
	}

}
