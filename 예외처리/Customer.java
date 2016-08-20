package ����ó��;

public class Customer {

	String id;
	String name;
	int point = 1000; // �ű� �� ��� �� �⺻ ����Ʈ 1000�� ����

	public Customer(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + "," + name + "," + point;
	}

	//�޼ҽ���ü�� ����� ������������
	//�տ� �����ִ°� �� ����ó���� �϶�¸��̰�, �����Ϸ�����
	//��� ���.
	public void payByPoint(int point) throws Exception  {
		if (this.point < point) {//����Ʈ�� �����ѻ�Ȳ�� ���ܷ� �߻���Ŵ
			throw new Exception("����Ʈ ����");
		}
		this.point -= point;
	}

}
