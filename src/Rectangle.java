
public class Rectangle extends Shape {

	private int width;
	private int height;
	private int y = this.getY();
	private int x = this.getX();

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(int x, int y, char fill, int width, int height) {
		super(x, y, fill);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String toString() {
		// vytvori objekt line, pomocou ktoreho sa vykresli dany obrazec
		Line l = new Line(this.x, 0, this.getFill(), this.width, false);
		String rectangle = "";
		// odriadkuje pomocou zadanej pozicie y
		for (int i = 0; i < y; i++) {
			rectangle += "\n";
		}
		// vypise medzery + posunie vpravo podla zadanej premennej x
		for (int a = 0; a < height; a++) {
			rectangle += l + "\n";
		}
		return rectangle;
	}

}
