package Ŭ����.����.W06P03;


public class W06P03 {

	public static void main(String[] args) {
		Robot robot[]=new Robot[5];
		for(int i=0; i<robot.length; i++){
			robot[i]=new Robot();
		}
		System.out.println("�κ��� �� ����:"+Robot.getNumberOfRobots());
		for(int i=0; i<robot.length; i++){
			System.out.println(robot[i].id);
		}
	}
	

}
