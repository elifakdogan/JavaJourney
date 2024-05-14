package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class BaseGameManager implements GameService{

	@Override
	public void sellToGame(Game game, Customer customer, Campaign campaign) {
		System.out.println("The player named " + customer.getFirstName() + " bought the " + game.getGameName() + " game for " + campaign.getDiscount(game) + " TL using the " + campaign.getCampaignName() + " discount coupon.");
		
		}

}
