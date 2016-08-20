package 클래스.클래스V.A;

public class Car implements Colorable{
	int color;
	public void setColor(int color){
		this.color=color;
	}
	@Override
	public String toString() {
		return "Car [color=" + color + "]";
	}
	
	
}
