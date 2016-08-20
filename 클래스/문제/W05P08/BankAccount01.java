package 클래스.문제.W05P08;

public class BankAccount01 {

	private String accountId;
	private String ownerName;
	private String password;
	private int balance;
	
	public BankAccount01(String accountId, String ownerName, String password) {
		this.accountId=accountId;
		this.ownerName=ownerName;
		this.password=password;
	}
	public BankAccount01(String id, String name, String password, int balance){
		this(id,name,password);
		this.balance=balance;
	}
	
	@Override
	public String toString() {
		return accountId + "," + ownerName + "," + password
				+ "," + balance;
	}
	
}
