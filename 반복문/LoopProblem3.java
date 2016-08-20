package 반복문;

public class LoopProblem3 {

	public static void main(String[] args) {
		int i=0;
		int n=10;
		int sum=0;
		
		if(n<=0) System.out.println(n+" 은(는) 잘못된 값입니다");
		else {
			while(i<n){
				i++;
				sum+=i;
			}
			
			System.out.println(sum);
		}
	}

}
