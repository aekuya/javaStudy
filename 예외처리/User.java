package 예외처리;

public class User {
	String id;
	String name;
	private String password;
	
	//throws, 예외를 던지는것(발생시키는것), 예외도 클래스로 만들어져있음
	//이 내용을 쓸려면 반드시 이 예외처리를 하시오!
	public User(String id, String name, String password) throws Exception {
		if (password.length() < 6) {
			throw new Exception("객체 생성 오류: 패스워드는 길이 6이상이어야 합니다."); 
		/*
			이 문장은 이 두 문장과 같음.									
			 Exception exception=
			 new Exception("객체 생성 오류: 패스워드는 길이 6이상이어야합니다.");
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
