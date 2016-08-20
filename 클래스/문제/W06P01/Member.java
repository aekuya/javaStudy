package 클래스.문제.W06P01;

public class Member {
	String id;
	int balance;
	int numberOfTran;
	String lastBuy;

	public Member(String id) {
		this.id = id;
		this.balance = 0;
		this.numberOfTran = 0;
	}

	public void chargeMoney(int money) {
		this.balance += money;
	}

	public void buy(Product product) throws Exception {
		numberOfTran++;
		if (balance < product.getPrice()) {
			throw new Exception("잔고가 부족합니다.");
		} else {
			this.balance -= product.getPrice();

			this.lastBuy = "[" + product.getName() + "," + product.getPrice() + "]";
		}
	}

	@Override
	public String toString() {
		return "회원ID:" + id + "\n잔고:" + balance + "\n거래횟수:" + numberOfTran + "\n최근구매상품:" + lastBuy;
	}

}
