package gameOver;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+ "kampanyas� sisteme dahil edildi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + "kampanya oran� g�ncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + "kampanyan�n ge�erlili�i sona erdi.");
		
	}

}
