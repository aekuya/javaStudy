package Ŭ����.�ǽ�;
//ù��°������ ������ �׳� ����ġ�鼭(..) �߾��µ�
//���� Ÿ�ڿ����ϴ±���̶�, �ϴ� ��ü�� ���鼭 ���ؾȵǴ� �κи� ��¤�����ϴ�.

public class Main {

	public static void main(String[] args) {
		Student A = new Student("������",99);
		Student B = new Student("������");
			//B = new Student();//�ȵ�. �⺻�����ڴ� ���� ���� �����ڰ� �������� ���ȴ�.
		System.out.println(B.toString());
		System.out.println(A.toString());
		
		//A.score=50; //*�ȵȴ�. (private �����̱� ����)
		A.setName("������");
		System.out.println(A.toString());
		
		System.out.println(A.getScore());
		
		//A[] = new A[3] �̰Ŵ�, 3���� �迭�� �����Ҽ��ִ� �����͸� ������̶� ����.
		//�״ϱ�, ���� '������'�� ������ ������ �ȸ����!
		 Student studentArray1[]=new Student[3];
		 studentArray1[0]=new Student("ȫ�浿",87); 
		 studentArray1[1]=new Student("�̿���",93);
		 studentArray1[2]=new Student("��ö��",91);
		 System.out.println(studentArray1[0]);
		 System.out.println(studentArray1[1]);
		 System.out.println(studentArray1[2]);
		// �Ʒ� �ڵ�� ���� studentArray1 �迭�� �� ���� Student ��ü�� �����ϴ� �۾��� ���� �۾��� ����
		 Student studentArray2[]={new Student("ȫ�浿",87), new Student("�̿���",93), new Student("��ö��",91)};
		
		 for (Student s : studentArray2) { // for - each
			 System.out.println(s);
		 }
		 
		 Robot ra = new Robot("Robot-001",23.5,120);
		 Robot rb = new Robot("Robot-002",51,73);
		 Robot rc = new Robot("Robot-003",25.7,50);
		 
		 Robot robotArray[] = new Robot[3];
		 robotArray[0]=ra;
		 robotArray[1]=rb;
		 robotArray[2]=rc;
		 
		 for(Robot r : robotArray){
			 System.out.println(r.toString());
		 }
		 
		 printRobot(robotArray);
	} 
	
	static void printRobot(Robot[] robot){
		int i=1;
		for(Robot r : robot){
			System.out.print((i++) + "�� �κ��� ���� :");
			System.out.println(r.toString());
			
		}
	}

}
