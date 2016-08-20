package 클래스.클래스V;

/*
 * 추상 클래스(abstract class)
 * 만약 ' 클래스 =  설계도 ' 라하면, 추상클래스는 미완성 설계도 같은 느낌.
 * 만들다 말았다는게아니라, 이름만 있는 미완성 메소드(추상메소드)를 포함하고 있다는 의미.
 * 미완성 설계도로는 제품을 못만들듯이, 인스턴스를 생성할 수 없으며 생성하면 오류가 남.
 * 추상클래스가 아닌 그냥 빈괄호 ( {} ) 로 대체할 수 있으나, 추상클래스를 사용하면 사용자의
 * 실수를 방지할수 있음. 일종의 제약? 같은 느낌.
 */
public class Main {
	public static void main(String[] args) {
		Car car = new Car();
		car.setColor(Colorable.RED);
		System.out.println();
		Robot robot = new Robot();
		robot.setColor(Colorable.GREEN);
		System.out.println(robot);
	}
}
