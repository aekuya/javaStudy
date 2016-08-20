package 클래스.문제.W06P03;

public class Robot {
	String id;
	public static int count = 0;

	public Robot() {
		this.id="Robot-"+(++count);
	}
	public static int getNumberOfRobots() {
		return count;
	}

}
