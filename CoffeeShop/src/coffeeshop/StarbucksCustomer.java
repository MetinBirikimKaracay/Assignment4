package coffeeshop;

public class StarbucksCustomer extends Customer {

	private int starCount;
	
	public StarbucksCustomer(int id, String nationalIntity, String name, String surname, String bornYear) {
		super(id, nationalIntity, name, surname, bornYear);
	}

	public int getStarCount() {
		return starCount;
	}

	public void earnStar() {
		System.out.println("Yildiz sayiniz = " + starCount);
		starCount++;

	}
}