package ÇÔ¼ö;

public class P013 {

	public static void main(String[] args) {
		char x[]={'C','o','m','p','u','t','e','r'};
		char y1[]={'C','o'};
		char y2[]={'C','e'};
		char y3[]={'C','o','m','p','u','t','e','r'};
		char y4[]={'C','o','m','p','u','t','e','r','s'};
		boolean v;
		v=startsWith(x,y1);
		System.out.println(v);
		
		v=startsWith(x,y2);
		System.out.println(v);
	
		v=startsWith(x,y3);
		System.out.println(v);
	
		v=startsWith(x,y4);
		System.out.println(v);
	
	}

	static boolean startsWith(char[] x, char[] y) {
		boolean v=true;
		int length = x.length;

			if(x.length >= y.length) {
				length=y.length;
				
				for (int i = 0; i < length; i++) {
					if(x[i]!=y[i]){
						v=false;
						break;
					}
				}
			}	
			else v=false;
			
				
		
		return v;
	}

}
