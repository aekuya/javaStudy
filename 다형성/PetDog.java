package ´ÙÇü¼º;

public class PetDog extends Animal {

	String address;

	public PetDog(String name) {
		super(name);
	}

	public PetDog(String name, String address) {
		super(name);
		this.address = address;
	}

	@Override
	public String speak() {
		return "¸Û¸Û";
	}

}
