package Ŭ����.�ǽ�;

public class Robot {
	private String id;
	private double weight;
	private double height;
	
	//C���� �ڵ��Ҷ�, �ǳ� ��������� ���� �̸� �ٸ��� ���´ٰ�
	//¥�����µ�, Java���� this�� �־ ����
	public Robot(String id, double weight, double height){
		this.id = id;
		this.weight= weight;
		this.height= height;
//		System.out.println(this.toString());
		//this�� �޼ҵ嵵 ��밡��.
	}
	//Alt + shift + s(source)

	@Override
	public String toString() {
		return "Robot [id=" + id + ", weight=" + weight + ", height=" + height + "]";
	}
	
	
}
