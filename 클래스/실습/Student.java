package 클래스.실습;

public class Student {
	private String name;
	private int score;
	//이클립스 자체에서, 사용하지 않는 변수는 경고 처리를 한다.
	//+ 그리고 설정자와 접근자도 만들어줌!!
	
	//만약 생성자를 '아예' 만들지 않았다면,
	//기본생성자 (ex  int = 0 , boolean = false) 가 작동된다.
	public Student(String name){
		this.name=name;
		//score은 0으로 초기화됨..왜?
		
		//this는 현재의 클래스를 의미한다 생각하면 편하다.
		//this.name == Student.name
	}
	public Student(String name, int score){
		this(name);//할때마다 새로쓰지말고, this를 사용하자!
		this.score=score;
		
	}
	
	//생성자와 접근자.
	//밖에서 변수에 직접접근하게 하지말고, 이렇게 함수로 간접적으로 사용하자.
	//이렇게하면 나중에 추가기능이나 수정도 쉽고, 보안에도 좋다.
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
	
	//모든 클래스에 최고조상은 (Object) 클래스이다.
	//toString은 여기에 존재하는것.
	
	@Override//어노테이션, 한글로 주석으로 컴파일러용 주석문? 이라 생각하면될듯.
	//오류를 안뜨도록 예외처리하거나, 따로 설정하는게 있다는데 지금 알필요는 없다.
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	
	//이클립스 단축키
	/*
	 * 메뉴 -> Alt + ㅁ
	 * 대부분의 유용한 기능 -> Alt+Shift + ㅁ
	 * 인터페이스 바꾸기 -> Ctrl + f5~8
	 * 그외 줄바꿈 기능은 Alt, Ctrl 에 알만한곳에 다있음.
	 */
	
}
