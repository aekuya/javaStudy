package 예외처리;

public class Main3 {

	public static void main(String[] args) {
		int n1 = 0, n2 = 5;
		int sum = 50;
		// 아래 문장은 실행 시점에 ArithmeticException 발생 (분모가 0인 나눗셈은 허용되지 않기 때문)

//		System.out.println(sum / n1);
		// 예외처리를 하지않으면. 프로그램이 종료됨
		System.out.println(sum / n2);
		//만약 위문장이 실행됬다면
		//프로그램이 종료되었으므로 실행되지않는코드
		//***컴파일시 오류를 찾아주지않음!!

		//이런식으로 수정하여야함.
		try {
			System.out.println(sum / n1); 

		} catch (ArithmeticException e) {
			System.out.println("분모가 0인 나눗셈은 허용되지 않습니다.");
		}
		System.out.println(sum / n2);
		// 앞 문장에서 예외 처리를 해 주었으므로, 이 문장은 실행됨.
	}
}
