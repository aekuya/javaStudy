package 클래스.실습;
//첫번째과제는 정말로 그냥 따라치면서(..) 했었는데
//뭔가 타자연습하는기분이라, 일단 전체를 보면서 이해안되는 부분만 되짚었습니다.

public class Main {

	public static void main(String[] args) {
		Student A = new Student("김지원",99);
		Student B = new Student("가나다");
			//B = new Student();//안됨. 기본생성자는 따로 만든 생성자가 없을때만 사용된다.
		System.out.println(B.toString());
		System.out.println(A.toString());
		
		//A.score=50; //*안된다. (private 변수이기 때문)
		A.setName("가나다");
		System.out.println(A.toString());
		
		System.out.println(A.getScore());
		
		//A[] = new A[3] 이거는, 3개의 배열을 관리할수있는 포인터를 만든것이라 생각.
		//그니까, 아직 '데이터'를 저장할 공간은 안만든거!
		 Student studentArray1[]=new Student[3];
		 studentArray1[0]=new Student("홍길동",87); 
		 studentArray1[1]=new Student("이영희",93);
		 studentArray1[2]=new Student("김철수",91);
		 System.out.println(studentArray1[0]);
		 System.out.println(studentArray1[1]);
		 System.out.println(studentArray1[2]);
		// 아래 코드는 앞의 studentArray1 배열에 세 개의 Student 객체를 보관하는 작업과 같은 작업을 수행
		 Student studentArray2[]={new Student("홍길동",87), new Student("이영희",93), new Student("김철수",91)};
		
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
			System.out.print((i++) + "번 로봇의 정보 :");
			System.out.println(r.toString());
			
		}
	}

}
