package 클래스.클래스V.B;

public class Soldier implements Moveable, Colorable {
	int x, y;
	int color;

	@Override
	public void setColor(int color) {
		this.color = color;
	}

	@Override
	public void moveTo(int x, int y) {
		this.x += x;
		this.y += y;
	}

	@Override
	public void moveBy(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Soldier [x=" + x + ", y=" + y + ", color=" + color + "]";
	}

}
