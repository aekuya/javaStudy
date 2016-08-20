package 다형성;

public class Test {

	public static void main(String[] args) {
//		Person person;
//		person = new Person("ROK-000123", "홍길동");
//		// Person 객체가 생성되면서 person.id, person.name, person.toString() 등도 만들어진다.
//		person.name = "홍미래";
		
		/*
		 * new, 말그대로 새로운 객체(공간)을 만들어준것이다. person은 c언어로 비유하자면, 포인터같은느낌?
		 */

//		System.out.println(person.toString());
		// 만약 앞의 new Person(...) 문장이 없었다면 이 문장은 오류이다.
		// person.toString()이 존재하지 않기 때문.

		// Number 클래스 내의 함수 add(), sumToN()을 사용하기 위해서는, 반드시 사전에 new 연산자를 통해
		// Number 객체를 만들어야 한다.
		Number number = new Number();
		System.out.println(Number.add(34, 56));
		// 만약 앞에서 new Number()를 하지 않았다면 add() 함수는 존재하지 않는다.

		/*
		 * 클래스변수는, 데이터가 지워지지않고 모든 객체들이 공유하도록 만들어준 변수라면, 클래스 메서드는 new로 생성하기도 귀찮고
		 * 자주 사용해서 따로 빼놓은 메서드들? 이라 이해하면 편할것같다.
		 */

		System.out.println(Number.add(34, 56));
		// static 요소에 접근하기 위해서는 클래스 명(Number)을 앞에 붙인다.
		System.out.println(Number.sumToN(10));
		// static 요소에 접근하기 위해서는 클래스 명(Number)을 앞에 붙인다.
		
		/*
		이 경우, P001을 Static으로 두고 자동으로 매겨주면 편할것같다.
		this.totalStockAmount+=...는 당연히 클래스 변수가아닌, 인스턴스변수이므로
		다른 인스턴스끼리 공유안한다!
		
		- 물론 인스턴스를 통해서 클래스변수를 바꿀수있으나
		그런식으로 변경하는것은 알아서 갯수를 세줄때? 나 쓰고 권유하지않는다.
		(클래스명.클래스변수) 로 사용하자.
		 */
		Product p1 = new Product("P001", "칫솔", 10); // 상품ID, 상품명, 재고수량
		System.out.println(p1);
		Product p2 = new Product("P002", "비누", 55); // 상품ID, 상품명, 재고수량
		System.out.println(p2);
		Product p3 = new Product("P003", "화장지", 23); // 상품ID, 상품명, 재고수량
		System.out.println(p3);
		Product p4 = new Product("P004", "샴푸", 8); // 상품ID, 상품명, 재고수량
		System.out.println(p4);
		Product p5 = new Product("P005", "면도기", 21); // 상품ID, 상품명, 재고수량
		System.out.println(p5);

	}

}

class Number {
	public static int add(int i, int j) {
		return i + j;
	}

	public static int sumToN(int N) {
		int sum = 0;
		for (int i = 0; i <= N; i++)
			sum += i;
		return sum;
	}
}

