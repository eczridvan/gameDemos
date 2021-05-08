package nLayeredEcommerce.core;

import nLayeredEcommerce.googleAuth.GoogleAuthManager;

public class GoogleManagerAdapter implements GoogleService{

	@Override
	public void authservice(String message) {
		GoogleAuthManager manager = new GoogleAuthManager();
		manager.auth(message);
		
	}

}
