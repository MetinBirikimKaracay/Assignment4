package gameproject;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class PlayerCheckManager implements PlayerCheckService {

	@Override
	public boolean validation(Player player) {

		KPSPublicSoapProxy kps = new KPSPublicSoapProxy();
		try {
			return kps.TCKimlikNoDogrula(Long.parseLong(player.getNationalIdentity()), player.getName().toUpperCase(),
					player.getSurName().toUpperCase(), Integer.parseInt(player.getBornYear()));
		} catch (Exception e) {
			System.out.println("Mernis'e baglanamadiniz!!!");
			return false;
		}
	}

}