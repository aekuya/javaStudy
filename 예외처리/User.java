package ����ó��;

public class User {
	String id;
	String name;
	private String password;
	
	//throws, ���ܸ� �����°�(�߻���Ű�°�), ���ܵ� Ŭ������ �����������
	//�� ������ ������ �ݵ�� �� ����ó���� �Ͻÿ�!
	public User(String id, String name, String password) throws Exception {
		if (password.length() < 6) {
			throw new Exception("��ü ���� ����: �н������ ���� 6�̻��̾�� �մϴ�."); 
		/*
			�� ������ �� �� ����� ����.									
			 Exception exception=
			 new Exception("��ü ���� ����: �н������ ���� 6�̻��̾���մϴ�.");
			 throw exception;
		*/
		}
		this.id = id;
		this.name = name;
		this.password = password;
	}

	@Override
	public String toString() {
		return id + "," + name;
	}
}
