package 예외처리;

public class Main2 {
	public static void main(String[] args) {
		Customer customer = new Customer("gdhong", "홍길동");
		System.out.println(customer);
		try {
			customer.payByPoint(500); // 포인트 잔액이 포인트 사용 금액보다 많으므로 결재 결재 성공
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(customer);
		try {
			customer.payByPoint(2000); 
			//예외발생!
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(customer);
	}
}
