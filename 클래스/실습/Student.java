package Ŭ����.�ǽ�;

public class Student {
	private String name;
	private int score;
	//��Ŭ���� ��ü����, ������� �ʴ� ������ ��� ó���� �Ѵ�.
	//+ �׸��� �����ڿ� �����ڵ� �������!!
	
	//���� �����ڸ� '�ƿ�' ������ �ʾҴٸ�,
	//�⺻������ (ex  int = 0 , boolean = false) �� �۵��ȴ�.
	public Student(String name){
		this.name=name;
		//score�� 0���� �ʱ�ȭ��..��?
		
		//this�� ������ Ŭ������ �ǹ��Ѵ� �����ϸ� ���ϴ�.
		//this.name == Student.name
	}
	public Student(String name, int score){
		this(name);//�Ҷ����� ���ξ�������, this�� �������!
		this.score=score;
		
	}
	
	//�����ڿ� ������.
	//�ۿ��� ������ ���������ϰ� ��������, �̷��� �Լ��� ���������� �������.
	//�̷����ϸ� ���߿� �߰�����̳� ������ ����, ���ȿ��� ����.
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	//��� Ŭ������ �ְ������� (Object) Ŭ�����̴�.
	//toString�� ���⿡ �����ϴ°�.
	
	@Override//������̼�, �ѱ۷� �ּ����� �����Ϸ��� �ּ���? �̶� �����ϸ�ɵ�.
	//������ �ȶߵ��� ����ó���ϰų�, ���� �����ϴ°� �ִٴµ� ���� ���ʿ�� ����.
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	
	//��Ŭ���� ����Ű
	/*
	 * �޴� -> Alt + ��
	 * ��κ��� ������ ��� -> Alt+Shift + ��
	 * �������̽� �ٲٱ� -> Ctrl + f5~8
	 * �׿� �ٹٲ� ����� Alt, Ctrl �� �˸��Ѱ��� ������.
	 */
	
}
