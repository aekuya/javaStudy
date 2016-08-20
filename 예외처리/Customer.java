package 예외처리;

public class Customer {

	String id;
	String name;
	int point = 1000; // 신규 고객 등록 시 기본 포인트 1000점 지급

	public Customer(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + "," + name + "," + point;
	}

	//메소스자체에 안적어도 실행은되지만
	//앞에 적어주는건 이 예외처리를 하라는말이고, 컴파일러에서
	//경고를 띄움.
	public void payByPoint(int point) throws Exception  {
		if (this.point < point) {//포인트가 부족한상황을 예외로 발생시킴
			throw new Exception("포인트 부족");
		}
		this.point -= point;
	}

}
