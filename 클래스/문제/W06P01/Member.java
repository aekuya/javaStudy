package Ŭ����.����.W06P01;

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
			throw new Exception("�ܰ� �����մϴ�.");
		} else {
			this.balance -= product.getPrice();

			this.lastBuy = "[" + product.getName() + "," + product.getPrice() + "]";
		}
	}

	@Override
	public String toString() {
		return "ȸ��ID:" + id + "\n�ܰ�:" + balance + "\n�ŷ�Ƚ��:" + numberOfTran + "\n�ֱٱ��Ż�ǰ:" + lastBuy;
	}

}
