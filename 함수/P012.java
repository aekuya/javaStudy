package ÇÔ¼ö;

public class P012 {

	public static void main(String[] args) {
		char x[]={'C','o','m','p','u','t','e','r'};
		char y1[]={'e','r'};
		char y2[]={'o','r'};
		char y3[]={'C','o','m','p','u','t','e','r'};
		char y4[]={'O','C','o','m','p','u','t','e','r'};
		boolean v;
		v=endsWith(x,y1);
		System.out.println(v);
		
		v=endsWith(x,y2);
		System.out.println(v);
	
		v=endsWith(x,y3);
		System.out.println(v);
	
		v=endsWith(x,y4);
		System.out.println(v);
	
	}

	static boolean endsWith(char[] x, char[] y) {
		boolean v=true;
		if(x.length<y.length) v=false;
		else
		{
			for (int i = 1; i <= y.length; i++) {
				if(x[x.length-i]!=y[y.length-i]){
					v=false;
					break;
				}
			}
		}
		return v;
	}

}