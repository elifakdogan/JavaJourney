package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface GameService {
	void sellToGame (Game game, Customer customer, Campaign campaign);
}
