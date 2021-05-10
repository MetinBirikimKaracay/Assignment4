package coffeeshop;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean validation(Customer customer) {

		KPSPublicSoapProxy kps = new KPSPublicSoapProxy();
		try {
			return kps.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIntity()),
					customer.getName().toUpperCase(), customer.getSurname().toUpperCase(),
					Integer.parseInt(customer.getBornYear()));
		} catch (Exception e) {
			System.out.println("Mernis'e baglanilamiyor!!!");
			return false;
		}
	}
}