package ÇÔ¼ö;

public class P005 {

	public static void main(String[] args) {
		int x[]={34,50,72,89,56};
		int z=max(x);
		System.out.println(z);
	}

	static int max(int[] x) {
		int max=x[0];
		for (int i=0;	i<x.length;	i++){
			if(max<x[i]) max=x[i];
		}
		return max;
	}

}
