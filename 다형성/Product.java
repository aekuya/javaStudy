package 다형성;

public class Product {
	String id;
	String name;
	int stockAmount;
	static int totalStockAmount;

	public Product(String id, String name, int stockAmount) {
		this.id = id;
		this.name = name;
		this.stockAmount = stockAmount;
		updateTotalStockAmount(stockAmount);
	}

	private static void updateTotalStockAmount(int stockAmount) { // 객체 생성 이전에
																	// 호출 가능
		totalStockAmount += stockAmount;
	}

	@Override
	public String toString() {
		return id + "," + name + "," + stockAmount + ", 총재고량=" + totalStockAmount;
	}

	public static int getTotalStockAmount() { // 객체 생성 이전에 호출 가능
		return totalStockAmount;
	}
}