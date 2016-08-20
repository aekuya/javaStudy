package 클래스.문제.W05P07;

public class Date07 {

	public int year;
	public int month;
	public int day;
	@Override
	public String toString() {
		return year + String.format("-%02d", month)+ String.format("-%02d", day);
	}
	
	

}
