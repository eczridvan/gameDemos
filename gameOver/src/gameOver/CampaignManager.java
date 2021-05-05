package gameOver;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+ "kampanyası sisteme dahil edildi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + "kampanya oranı güncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + "kampanyanın geçerliliği sona erdi.");
		
	}

}
