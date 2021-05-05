package gameOver;

public interface SaleService {
	void gameSale(Game game, User user);
	void gameSale(Game game, User user, Campaign campaign);
}
