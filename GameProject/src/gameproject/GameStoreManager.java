package gameproject;

public class GameStoreManager implements GameStoreService {

	@Override
	public void Sale(Player player, GameStore gameStore) {
		System.out.println(gameStore.getName() + " oyununu " + player.getName() + " uyesi " + gameStore.getPrice()
				+ " tl'ye satin aldi");
	}

	public void Sale(Player player, GameStore gameStore, Campaign campaign) {
		double newPrice = (gameStore.getPrice() - ((gameStore.getPrice() * campaign.getDiscount()) / 100));
		System.out.println(
				campaign.getName() + "'dan faydalanarak " + gameStore.getName() + " oyununu " + gameStore.getPrice()
						+ " tl yerine %" + campaign.getDiscount() +" indirim ile "+ newPrice + " tl'ye satin aldiniz.");
	}

}
