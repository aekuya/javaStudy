package �ݺ���;

public class LoopProblem5 {

	public static void main(String[] args) {
		int min =-3;
		int max =3;
		int i=min;
		
		if(min>max) System.out.println(
						"("+min+") ~ ("+max+") �� �߸��� �����Դϴ�.");
		else
			while(i<=max){
				System.out.print(2*i+1+" ");
				i++;
			}
	}

}
