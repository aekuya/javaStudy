package ÇÔ¼ö;

public class P006 {

	public static void main(String[] args) {
		int x[]={-23,34,45,-12,0};
		int z=min(x);
		System.out.println(z);
	}

	static int min(int[] x) {
		int min=x[0];
		for (int i = 0; i < x.length; i++) {
			if(min>x[i]) min=x[i];
			
		}
		return min;
	}
	

}
