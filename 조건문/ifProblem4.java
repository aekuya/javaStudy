package 조건문;

public class ifProblem4 {

	public static void main(String[] args) {
		int score = -1;
		boolean ok = false;
		
		if(score>=0&&score<=100)
			ok = true;
		
		if(ok) System.out.println("정상");
		else System.out.println("비정상");
		
	}

}
