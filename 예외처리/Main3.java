package ����ó��;

public class Main3 {

	public static void main(String[] args) {
		int n1 = 0, n2 = 5;
		int sum = 50;
		// �Ʒ� ������ ���� ������ ArithmeticException �߻� (�и� 0�� �������� ������ �ʱ� ����)

//		System.out.println(sum / n1);
		// ����ó���� ����������. ���α׷��� �����
		System.out.println(sum / n2);
		//���� �������� ������ٸ�
		//���α׷��� ����Ǿ����Ƿ� ��������ʴ��ڵ�
		//***�����Ͻ� ������ ã����������!!

		//�̷������� �����Ͽ�����.
		try {
			System.out.println(sum / n1); 

		} catch (ArithmeticException e) {
			System.out.println("�и� 0�� �������� ������ �ʽ��ϴ�.");
		}
		System.out.println(sum / n2);
		// �� ���忡�� ���� ó���� �� �־����Ƿ�, �� ������ �����.
	}
}
