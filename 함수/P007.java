package ÇÔ¼ö;

public class P007 {

	public static void main(String[] args) {
		int x[]={76,89,76,90,100};
		int y[]={65,87,98,62,82};
		int z[]=add(x,y);
		for(int v:z){
			System.out.println(v);
		}
	}

	static int[] add(int[] x, int[] y) {
		for (int i = 0; i < x.length; i++) {
			x[i] += y[i];
			
		}
		return x;
	}

}
