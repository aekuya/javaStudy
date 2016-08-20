package ÇÔ¼ö;

public class P003 {

	public static void main(String[] args) {
		int x=54,y=78;
		int z=min(x,y);
		System.out.println(z);
	}

	static int min(int x, int y) {
		if(x>y) return y;
		else return x;
	}

}
