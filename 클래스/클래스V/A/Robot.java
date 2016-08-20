package 클래스.클래스V.A;

public class Robot implements Colorable{
	int color;
	public void setColor(int color){
		this.color=color;
	}
	@Override
	public String toString() {
		return "Robot [color=" + color + "]";
	}
	
	
}

