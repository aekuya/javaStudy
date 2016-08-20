package ÇÔ¼ö;

public class P008 {

	public static void main(String[] args) {
		int v[]={47,69,77,81,93};
		int w[]={65,76,71,79,91};
		int x[]={76,89,76,90,100};
		int y[]={65,87,98,62,82};
		
		int z[]=add(add(v,w),add(x,y));
		for (int i = 0; i < z.length; i++) {
			System.out.printf("%.2f\n",z[i]/4.0);
		}
		
	}
	
	static int[] add(int[] x, int[] y) {
	for (int i = 0; i < x.length; i++) {
		x[i] += y[i];
		
	}
	return x;
}

}
