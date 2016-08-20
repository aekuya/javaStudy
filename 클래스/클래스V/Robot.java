package 클래스.클래스V;

public class Robot extends Colorable{
	int color;
	void setColor(int color){
		this.color=color;
	}
	@Override
	public String toString() {
		return "Robot [color=" + color + "]";
	}
	
}
