
public abstract class Shape {
	private int x;
	private int y;
	private char fill;

	public Shape() {
		this.x = 0;
		this.y = 0;
		this.fill = 'e';
	}

	public Shape(int x, int y, char fill) {
		super();
		this.x = x;
		this.y = y;
		this.fill = fill;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public char getFill() {
		return fill;
	}

	public void setFill(char fill) {
		this.fill = fill;
	}

}
