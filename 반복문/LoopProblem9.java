package �ݺ���;

public class LoopProblem9 {

	public static void main(String[] args) {
		int n=5;
		int fact=1;
		if(n<0) System.out.println(n+"��(��) �߸��� ���Դϴ�.");
		else{
			for(int i=1; i<=n; i++){
				fact*=i;
			}
			System.out.println(fact);
		}
	}

}


