package ÇÔ¼ö;

public class P001 {

	public static void main(String[] args) {
		int x=-98;
		int z= abs(x);
		System.out.println(z);
	}
	
	static int abs(int x){
		if(x<0) x *= -1;
		return x;
	}

}
