package 클래스.실습;

public class Robot {
	private String id;
	private double weight;
	private double height;
	
	//C언어로 코딩할때, 맨날 같은기능인 변수 이름 다르게 짓는다고
	//짜증났는데, Java에는 this가 있어서 다행
	public Robot(String id, double weight, double height){
		this.id = id;
		this.weight= weight;
		this.height= height;
//		System.out.println(this.toString());
		//this로 메소드도 사용가능.
	}
	//Alt + shift + s(source)

	@Override
	public String toString() {
		return "Robot [id=" + id + ", weight=" + weight + ", height=" + height + "]";
	}
	
	
}
