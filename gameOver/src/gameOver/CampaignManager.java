package gameOver;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+ "kampanyasý sisteme dahil edildi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + "kampanya oraný güncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + "kampanyanýn geçerliliði sona erdi.");
		
	}

}
