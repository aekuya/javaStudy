package 반복문;

public class LoopProblem9 {

	public static void main(String[] args) {
		int n=5;
		int fact=1;
		if(n<0) System.out.println(n+"은(는) 잘못된 값입니다.");
		else{
			for(int i=1; i<=n; i++){
				fact*=i;
			}
			System.out.println(fact);
		}
	}

}


