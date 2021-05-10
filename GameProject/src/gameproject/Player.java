package gameproject;

public class Player implements Entity {

	private int id;
	private String nationalIdentity;
	private String name;
	private String surName;
	private String bornYear;

	public Player(int id, String nationalIdentity, String name, String surName, String bornYear) {
		this.id = id;
		this.nationalIdentity = nationalIdentity;
		this.name = name;
		this.surName = surName;
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

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getBornYear() {
		return bornYear;
	}

	public void setBornYear(String bornYear) {
		this.bornYear = bornYear;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}
}