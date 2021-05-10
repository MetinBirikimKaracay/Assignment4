package coffeeshop;

public class StarbucksCustomerManager extends CustomerManager {

	CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if (customerCheckService.validation(customer)) {
			System.out.println("Starbucks'a Kayit Oldunuz -> " + customer.getName() + " " + customer.getSurname());
		} else {
			System.out.println("Kayit olamadiniz. Lutfen bilgilerinizi kontrol ediniz.");
		}
	}

	public void CoffeeSell(Customer customer) {
		System.out.println("Kahve satin aldiniz!");
		if (customer instanceof StarbucksCustomer) {
			((StarbucksCustomer) customer).earnStar();
			System.out.println("Yeni Yildiz Sayiniz = " + ((StarbucksCustomer) customer).getStarCount());
			System.out.println("---------------------------------------");
		}
	}
}