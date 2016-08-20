package 클래스.문제.W05P11;

public class MyString {
	char[] data;
	
	public MyString(char[] c) {
		this.data=c;
	}
	
	public int length(){
		return data.length;
	}

	@Override
	public String toString() {
		return ""+data[0]+data[1]+data[2]+data[3]+data[4];
	}

	
	
	
	

}
