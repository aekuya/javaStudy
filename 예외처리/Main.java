package ����ó��;

public class Main {
	public static void main(String[] args) {
		
		//**����, try���� ���ܰ� �߻��� �� �Լ� �޺κ��� ������������(�پ����)
		try {//���ܰ� ������ �߻��ϹǷ�(User����) try-catch�� ó�����־����
			User user = new User("gdhong", "ȫ�浿", "gdhong0525!"); 
			System.out.println(user);
		} catch (Exception e) { //���ܰ� �߻��Ѱ��, catch�� ������ �ᵵ��
			System.out.println(e.getMessage());
		}
		
		try {
			User user = new User("cskim", "��ö��", "1234"); 
			System.out.println(user);
		} catch (Exception e) { 
			System.out.println(e.getMessage());
		}
	}
}