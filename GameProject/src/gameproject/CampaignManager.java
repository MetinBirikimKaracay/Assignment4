package gameproject;

public class CampaignManager implements CampaignService{

	@Override
	public void newCampaign(Campaign campaign) {
		System.out.println(campaign.getName()+" adinda kampanya olusturdunuz. Indirim orani %"+campaign.getDiscount());
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("Kampanyayi guncellediniz.");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getName()+" kampanyasini sildiniz.");
	}
}