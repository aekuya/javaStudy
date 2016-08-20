package 조건문;

public class ifProblem2 {

	public static void main(String[] args) {
		int age = 6;
		int fee = 1000;
		
		if(age<=6)
			fee *= 0.5;
		else if(age>=65)
			fee *= 0.7;
		
		System.out.println(fee+"원");
		
	}

}
