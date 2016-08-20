package ´ÙÇü¼º;

public class PetCat extends Animal {

	String address;

	public PetCat(String name) {
		super(name);
	}

	public PetCat(String name, String address) {
		super(name);
		this.address = address;
	}

	@Override
	public String speak() {
		return "¾ß¿Ë";
	}

}
