package ÇÔ¼ö;

public class P010 {

	public static void main(String[] args) {
		char x[]={'C','o','m','p','u','t','e','r'};
		char z[]=copy(x,6);
		System.out.println(z);
		System.out.println(z.length);
	}

	static char[] copy(char[] x, int i) {
		char[] newArray=new char[i];
		for (int j = 0; j < newArray.length; j++) {
			newArray[j]=x[j];
		}
		return newArray;
	}

}
