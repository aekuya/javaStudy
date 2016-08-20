package ÇÔ¼ö;

public class P004 {
	public static void main(String[] args) {
		int x[]={34,50,72,89,56};
		int z=sum(x);
		System.out.println(z);
	}

	static int sum(int[] x) {
		int sum=0;
		
		for(int a : x){
			sum+=a;
		}
		
		return sum;
	}
}
