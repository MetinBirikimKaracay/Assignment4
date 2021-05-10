package gameproject;

public class Main {

	public static void main(String[] args) {

		Player oyuncu = new Player(1, "12345678910", "Metin Birikim", "Karaçay", "2000");

		PlayerManager playerManager = new PlayerManager(new PlayerCheckManager());

		GameStore gameStore = new GameStore(1, "Metin2", 20);
		GameStore gameStore2 = new GameStore(2, "PUBG", 70);

		GameStoreManager gameStoreManager = new GameStoreManager();

		Campaign campaign = new Campaign(1, 20, "Yaz indirimi");

		CampaignManager campaignManager = new CampaignManager();
		
		campaignManager.updateCampaign(campaign);

		playerManager.Register(oyuncu);

		// gameStoreManager.Sale(oyuncu, gameStore);

		gameStoreManager.Sale(oyuncu, gameStore, campaign);

	}
}