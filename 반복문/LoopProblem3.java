package �ݺ���;

public class LoopProblem3 {

	public static void main(String[] args) {
		int i=0;
		int n=10;
		int sum=0;
		
		if(n<=0) System.out.println(n+" ��(��) �߸��� ���Դϴ�");
		else {
			while(i<n){
				i++;
				sum+=i;
			}
			
			System.out.println(sum);
		}
	}

}
