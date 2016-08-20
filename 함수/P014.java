package ÇÔ¼ö;

public class P014 {

	public static void main(String[] args) {
		char x[]={'C','o','m','p','u','t','e','r'};
		char y1[]={'C','o'};
		char y2[]={'p','u','t'};
		char y3[]={'p','o','t'};
		char y4[]={'e','r'};
		char y5[]={'o','r'};
		char y6[]={'C','o','m','p','u','t','e','r'};
		char y7[]={'C','o','m','p','u','t','e','r','s'};
		int position;
		position = indexOf(x,y1);
		System.out.println(position);
		position = indexOf(x,y2);
		System.out.println(position);
		position = indexOf(x,y3);
		System.out.println(position);
		position = indexOf(x,y4);
		System.out.println(position);
		position = indexOf(x,y5);
		System.out.println(position);
		position = indexOf(x,y6);
		System.out.println(position);
		position = indexOf(x,y7);
		System.out.println(position);
	}

	static int indexOf(char[] x, char[] y) {
		int result = -1;
		if(x.length >= y.length){
			
			for (int i = 0; i < x.length; i++) {
				if(x[i]==y[0]){
					result=i;
					
					for (int j = 0; j < y.length; j++) {
						if( (x.length-1) < (i+j) || x[i+j]!=y[j]){
							result =-1;
							break;	
						}
					}
					
					break;
				}
			}
		}	
		return result;
	}
	

}


