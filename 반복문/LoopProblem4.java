package �ݺ���;

public class LoopProblem4 {

	public static void main(String[] args) {
		int m=4;
		int n=9;
		int sum=0;
		
		if(n<m) System.out.println(
				"("+m+") ~ ("+n+") ��(��) �߸��� �����Դϴ�.");
		else{
			for(int i=m; i<=n; i++){
				sum+=i;
			}
			
			System.out.println(sum);
		}
	}

}
