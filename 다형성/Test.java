package ������;

public class Test {

	public static void main(String[] args) {
//		Person person;
//		person = new Person("ROK-000123", "ȫ�浿");
//		// Person ��ü�� �����Ǹ鼭 person.id, person.name, person.toString() � ���������.
//		person.name = "ȫ�̷�";
		
		/*
		 * new, ���״�� ���ο� ��ü(����)�� ������ذ��̴�. person�� c���� �������ڸ�, �����Ͱ�������?
		 */

//		System.out.println(person.toString());
		// ���� ���� new Person(...) ������ �����ٸ� �� ������ �����̴�.
		// person.toString()�� �������� �ʱ� ����.

		// Number Ŭ���� ���� �Լ� add(), sumToN()�� ����ϱ� ���ؼ���, �ݵ�� ������ new �����ڸ� ����
		// Number ��ü�� ������ �Ѵ�.
		Number number = new Number();
		System.out.println(Number.add(34, 56));
		// ���� �տ��� new Number()�� ���� �ʾҴٸ� add() �Լ��� �������� �ʴ´�.

		/*
		 * Ŭ����������, �����Ͱ� ���������ʰ� ��� ��ü���� �����ϵ��� ������� �������, Ŭ���� �޼���� new�� �����ϱ⵵ ������
		 * ���� ����ؼ� ���� ������ �޼����? �̶� �����ϸ� ���ҰͰ���.
		 */

		System.out.println(Number.add(34, 56));
		// static ��ҿ� �����ϱ� ���ؼ��� Ŭ���� ��(Number)�� �տ� ���δ�.
		System.out.println(Number.sumToN(10));
		// static ��ҿ� �����ϱ� ���ؼ��� Ŭ���� ��(Number)�� �տ� ���δ�.
		
		/*
		�� ���, P001�� Static���� �ΰ� �ڵ����� �Ű��ָ� ���ҰͰ���.
		this.totalStockAmount+=...�� �翬�� Ŭ���� �������ƴ�, �ν��Ͻ������̹Ƿ�
		�ٸ� �ν��Ͻ����� �������Ѵ�!
		
		- ���� �ν��Ͻ��� ���ؼ� Ŭ���������� �ٲܼ�������
		�׷������� �����ϴ°��� �˾Ƽ� ������ ���ٶ�? �� ���� ���������ʴ´�.
		(Ŭ������.Ŭ��������) �� �������.
		 */
		Product p1 = new Product("P001", "ĩ��", 10); // ��ǰID, ��ǰ��, ������
		System.out.println(p1);
		Product p2 = new Product("P002", "��", 55); // ��ǰID, ��ǰ��, ������
		System.out.println(p2);
		Product p3 = new Product("P003", "ȭ����", 23); // ��ǰID, ��ǰ��, ������
		System.out.println(p3);
		Product p4 = new Product("P004", "��Ǫ", 8); // ��ǰID, ��ǰ��, ������
		System.out.println(p4);
		Product p5 = new Product("P005", "�鵵��", 21); // ��ǰID, ��ǰ��, ������
		System.out.println(p5);

	}

}

class Number {
	public static int add(int i, int j) {
		return i + j;
	}

	public static int sumToN(int N) {
		int sum = 0;
		for (int i = 0; i <= N; i++)
			sum += i;
		return sum;
	}
}

