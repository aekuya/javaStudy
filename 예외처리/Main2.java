package ����ó��;

public class Main2 {
	public static void main(String[] args) {
		Customer customer = new Customer("gdhong", "ȫ�浿");
		System.out.println(customer);
		try {
			customer.payByPoint(500); // ����Ʈ �ܾ��� ����Ʈ ��� �ݾ׺��� �����Ƿ� ���� ���� ����
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(customer);
		try {
			customer.payByPoint(2000); 
			//���ܹ߻�!
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(customer);
	}
}
