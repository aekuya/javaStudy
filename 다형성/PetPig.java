package ´ÙÇü¼º;

public class PetPig extends Animal {
	
	String address;

	public PetPig(String name) {
		super(name);
	}

	public PetPig(String name, String address) {
		super(name);
		this.address = address;
	}

	@Override
	public String speak() {
		return "²Ü²Ü";
	}
}
