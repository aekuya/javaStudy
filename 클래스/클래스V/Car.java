package 클래스.클래스V;

public class Car extends Colorable{
	int color;
	void setColor(int color){
		this.color=color;
	}
	@Override
	public String toString() {
		return "Car [color=" + color + "]";
	}
	
}
