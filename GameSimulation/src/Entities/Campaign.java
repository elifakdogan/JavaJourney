package Entities;

public class Campaign {
	private int id;
	private String campaignName;
	private double discount;
	
	public Campaign() {
		
	}
	
	public Campaign(int id, String campaignName, double discount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	

	public double getDiscount(Game game) {
		double gamePrice = game.getGamePrice();
		return gamePrice - (gamePrice * discount / 100);
	}
	
	public void setDiscount(double Discount) {
		this.discount = Discount;
	}

	 
}
