package 예외처리;

public class Main {
	public static void main(String[] args) {
		
		//**주의, try에서 예외가 발생한 그 함수 뒷부분은 실행하지않음(뛰어넘음)
		try {//예외가 무조건 발생하므로(User에서) try-catch로 처리해주어야함
			User user = new User("gdhong", "홍길동", "gdhong0525!"); 
			System.out.println(user);
		} catch (Exception e) { //예외가 발생한경우, catch를 여러개 써도됨
			System.out.println(e.getMessage());
		}
		
		try {
			User user = new User("cskim", "김철수", "1234"); 
			System.out.println(user);
		} catch (Exception e) { 
			System.out.println(e.getMessage());
		}
	}
}