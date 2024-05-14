package Abstract;

import Entities.Campaign;

public class BaseCampaignManager implements CampaignService{

	@Override
	public void addToCampaign(Campaign campaign) {
		System.out.println("New campaign added : " + campaign.getCampaignName());
		
	}

	@Override
	public void deleteToCampaign(Campaign campaign) {
		System.out.println("Campaign deleted : " + campaign.getCampaignName());
		
	}

	@Override
	public void updateToCampaign(Campaign campaign) {
		System.out.println("Campaign updated : " + campaign.getCampaignName());
		
	}

}
