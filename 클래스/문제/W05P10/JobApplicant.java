package Ŭ����.����.W05P10;

public class JobApplicant {
	private int applicationNumber;
	private String name;
	private char gender;
	private String email;
	private int score;
	
	public JobApplicant(int a, String n, char g, String e) {
		this.applicationNumber=a;
		this.name=n;
		this.gender=g;
		this.email=e;
	}

	public void setScore(int i) {
		this.score=i;
	}

	@Override
	public String toString() {
		String YN;
		if(score>=70) YN = new String("�հ�");
		else YN = new String("���հ�");
		
		return "["+YN+"] NO:"+ applicationNumber + ", NAME:" + name + ", GENDER:" + gender
				+ ", EMAIL:" + email;
	}
	

}
