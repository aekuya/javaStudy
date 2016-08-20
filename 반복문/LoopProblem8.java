package 반복문;

public class LoopProblem8 {

	public static void main(String[] args) {
		int n=9;
		if(n<1) System.out.println(n+ " 은(는)잘못된 갯수입니다.");
		else{
			if(n>=1) System.out.print("0 ");
			if(n>=2) System.out.print("1 ");
			if(n>=3)
				for(int i=0,a=0,b=1,c=0; i<n-2; i++){
					c=a+b;
					System.out.print(c+" ");
					a=b;
					b=c;	
				}
		}
	}

}
