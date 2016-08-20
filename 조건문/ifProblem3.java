package 조건문;

public class ifProblem3 {

	public static void main(String[] args) {
		int age = 19;
		int fee = 1000;
		
		if(age<=6)
			fee *= 0.5;
		else if(age>=65)
			fee *= 0.7;
		else if(age >=7 && age<20)
			fee *= 0.8;
		
		System.out.println(fee+"원");
	}

}
