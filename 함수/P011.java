package ÇÔ¼ö;

public class P011 {

	public static void main(String[] args) {
		char x[]={'C','o','m','p','u','t','e','r'};
		char z[]=consonant(x);
		System.out.println(z);
		System.out.println(z.length);
	}

	static char[] consonant(char[] x) {
		int count=0;
		char[] newArray = new char[x.length];
		
		for (int i = 0; i < x.length; i++) {
			if(x[i]!='a' && x[i]!='e' && x[i]!='i'&& x[i]!='o'&& x[i]!='u'){
				newArray[count++] = x[i];
			}
		}
		
		newArray=copy(newArray,count);
		
		return newArray;
	}

	static char[] copy(char[] x, int i) {
		char[] newArray=new char[i];
		for (int j = 0; j < newArray.length; j++) {
			newArray[j]=x[j];
		}
		return newArray;
	}

}
