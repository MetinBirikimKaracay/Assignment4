package coffeeshop;

public class Customer implements Entity {
	
	private int id;
	private String nationalIntity;
	private String name;
	private String surname;
	private String bornYear;

	public Customer(int id, String nationalIntity, String name, String surname, String bornYear) {
		this.id = id;
		this.nationalIntity = nationalIntity;
		this.name = name;
		this.surname = surname;
		this.bornYear = bornYear;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNationalIntity() {
		return nationalIntity;
	}

	public String getBornYear() {
		return bornYear;
	}

	public void setBornYear(String bornYear) {
		this.bornYear = bornYear;
	}


}
