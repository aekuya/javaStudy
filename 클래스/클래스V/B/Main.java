package 클래스.클래스V.B;

public class Main {

	public static void main(String[] args) {
		Soldier soldier = new Soldier();
		soldier.setColor(255);
		soldier.moveTo(100, 200);
		soldier.moveBy(10, 50);
		System.out.println(soldier);
	}

}
