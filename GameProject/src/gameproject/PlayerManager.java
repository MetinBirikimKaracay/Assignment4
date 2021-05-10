package gameproject;

public class PlayerManager implements PlayerService {

	PlayerCheckService checkService;

	public PlayerManager(PlayerCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void Register(Player player) {
		if (checkService.validation(player)) {
			System.out.println("Tebrikler !!! Sisteme basari ile kayit oldunuz. -->> " + player.getName() + " "
					+ player.getSurName());
		} else {
			System.out.println("Lutfen bilgilerinizi kontrol edip tekrar deneyiniz!.");
		}

	}

	@Override
	public void Update(Player player) {

		System.out.println("Bilgilerinizi baþari ile güncellediniz!");
	}

	@Override
	public void Delete(Player player) {

		System.out.println("Hesabinizi sildiniz!! Hoscakalin");
	}

}