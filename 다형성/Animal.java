package 다형성;

public class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}

	public String speak() {
		return "무슨 소리를 내야할 지 ...";
	}

	public String toString() {
		return name;
	}
}

