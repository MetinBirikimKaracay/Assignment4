package gameproject;

public class Campaign implements Entity {
	private int id;
	private int discount;
	private String name;

	public Campaign(int id, int discount, String name) {
		super();
		this.id = id;
		this.discount = discount;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
