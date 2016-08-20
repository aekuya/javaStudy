package 클래스.문제.W05P09;

public class Employee extends Person {

	String jobTitle;
	int annuallncome;
	boolean foreignerYN;

	public Employee(String id, String name, String jobTitle, int annuallncome, boolean foreignerYN) {
		super(id, name);
		this.jobTitle = jobTitle;
		this.annuallncome = annuallncome;
		this.foreignerYN = foreignerYN;

	}

	@Override
	public String toString() {
		return super.toString()+","+jobTitle + "," + annuallncome + "," + foreignerYN;
	}

}
