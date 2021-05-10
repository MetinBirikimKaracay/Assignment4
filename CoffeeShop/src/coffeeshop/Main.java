package coffeeshop;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer(1, "12345678910", "Metin Birikim", "Karaçay", "2000");
		Customer customer1 = new Customer(3, "17547922185", "Ahmet", "çay", "1900");

		StarbucksCustomer customer2 = new StarbucksCustomer(1, "14785236912", "Metin Birikim", "Karaçay", "2000");

		NeroCustomerManager neroCustomer = new NeroCustomerManager();
		StarbucksCustomerManager starbucksCustomer = new StarbucksCustomerManager(new CustomerCheckManager());

		//neroCustomer.Save(customer);
		//neroCustomer.CoffeeSell(customer2);
		
		starbucksCustomer.Save(customer);
		starbucksCustomer.CoffeeSell(customer2);

	}

}
