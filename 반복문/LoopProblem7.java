package �ݺ���;

public class LoopProblem7 {

	public static void main(String[] args) {
		int n=-5;
		int m=3;
		int i=1;
		
		if(n<=0) System.out.println(n+" ��(��) �߸��� �����Դϴ�.");
		else 
			for(int count=0;count<n;count++){
				System.out.print(m*i+" ");
				i++;
			}
	}

}
