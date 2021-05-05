package gameOver;

public class SaleManager implements SaleService {

	@Override
	public void gameSale(Game game, User user) {
		System.out.println(user.getFirstName() + user.getLastName() + "oyuncusu " + game.getName() +"adl� oyunu sat�n ald�.");
		
	}

	@Override
	public void gameSale(Game game, User user, Campaign campaign) {
		System.out.println(user.getFirstName() + user.getLastName() + "oyuncusu "+ game.getName() + "adl� oyunu %"+campaign.getDiscount() + "indirimle ile sat�n ald�.");
		
	}

}
