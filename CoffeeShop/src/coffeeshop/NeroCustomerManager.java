package coffeeshop;

public class NeroCustomerManager extends CustomerManager {

	@Override
	public void Save(Customer customer) {
		System.out.println("Ba�ari ile Nero'ya kayit oldunuz!");
	}

	public void CoffeeSell(Customer customer) {

		System.out.println("Nero'dan kahve aldiniz");

	}

}
