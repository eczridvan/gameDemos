package gameOver;

public class SaleManager implements SaleService {

	@Override
	public void gameSale(Game game, User user) {
		System.out.println(user.getFirstName() + user.getLastName() + "oyuncusu " + game.getName() +"adlý oyunu satýn aldý.");
		
	}

	@Override
	public void gameSale(Game game, User user, Campaign campaign) {
		System.out.println(user.getFirstName() + user.getLastName() + "oyuncusu "+ game.getName() + "adlý oyunu %"+campaign.getDiscount() + "indirimle ile satýn aldý.");
		
	}

}
