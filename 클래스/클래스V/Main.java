package Ŭ����.Ŭ����V;

/*
 * �߻� Ŭ����(abstract class)
 * ���� ' Ŭ���� =  ���赵 ' ���ϸ�, �߻�Ŭ������ �̿ϼ� ���赵 ���� ����.
 * ����� ���Ҵٴ°Ծƴ϶�, �̸��� �ִ� �̿ϼ� �޼ҵ�(�߻�޼ҵ�)�� �����ϰ� �ִٴ� �ǹ�.
 * �̿ϼ� ���赵�δ� ��ǰ�� ���������, �ν��Ͻ��� ������ �� ������ �����ϸ� ������ ��.
 * �߻�Ŭ������ �ƴ� �׳� ���ȣ ( {} ) �� ��ü�� �� ������, �߻�Ŭ������ ����ϸ� �������
 * �Ǽ��� �����Ҽ� ����. ������ ����? ���� ����.
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
