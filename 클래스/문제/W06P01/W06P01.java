package 클래스.문제.W06P01;

public class W06P01 {

	public static void main(String[] args) {
		Member member = new Member("KSM-1234");
		member.chargeMoney(30000);
		//ctrl + shift + z / try-catch 자동생성
		//이클립스를 찬양합니다..!
		try {
			member.buy(new Product("A4 (1 box)", 20000));
		} catch (Exception e) {}
		try {
			member.buy(new Product("Keyboard", 10000));
		} catch (Exception e) {}
		try {
			member.buy(new Product("HDMI cable", 5000));
		} catch (Exception e) {}
		try {
			member.buy(new Product("Eraser", 1000));
		} catch (Exception e) {}
		
		System.out.println(member);
	}
}
