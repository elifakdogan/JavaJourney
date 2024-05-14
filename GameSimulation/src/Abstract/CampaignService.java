package Abstract;

import Entities.Campaign;

public interface CampaignService {
	void addToCampaign(Campaign campaign);
	void deleteToCampaign(Campaign campaign);
	void updateToCampaign(Campaign campaign);
}
