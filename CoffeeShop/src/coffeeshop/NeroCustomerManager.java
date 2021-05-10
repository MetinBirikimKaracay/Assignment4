package coffeeshop;

public class NeroCustomerManager extends CustomerManager {

	@Override
	public void Save(Customer customer) {
		System.out.println("Baþari ile Nero'ya kayit oldunuz!");
	}

	public void CoffeeSell(Customer customer) {

		System.out.println("Nero'dan kahve aldiniz");

	}

}
