package 반복문;

public class LoopProblem7 {

	public static void main(String[] args) {
		int n=-5;
		int m=3;
		int i=1;
		
		if(n<=0) System.out.println(n+" 은(는) 잘못된 범위입니다.");
		else 
			for(int count=0;count<n;count++){
				System.out.print(m*i+" ");
				i++;
			}
	}

}
