import java.time.LocalDateTime;

import Abstract.BaseGameManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("İsim");
		customer.setLastName("Soyisim");
		customer.setDateOfBirth(LocalDateTime.of(1888, 5, 12,0,0));
		customer.setNationalityId("11111111111");
		
		Game game = new Game();
		game.setId(1);
		game.setGameName("Lol");
		game.setGamePrice(100);
		
		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setCampaignName("Dev Kampanya");
		campaign.setDiscount(20);
		
		BaseGameManager gameManager = new BaseGameManager();
		gameManager.sellToGame(game, customer, campaign);
		

	}

}
