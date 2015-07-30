
public class Square extends Shape {

	private int size;
	private int y=this.getY();	
	private int x=this.getX();

	public Square(int size) {
		this.size = size;
	}

	public Square(int x, int y, char fill, int size) {
		super(x, y, fill);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	public String toString() {
		Line l=new Line(this.x, 0, this.getFill(), this.size, false);
		String square = "";
		for (int i=0;i<y;i++){
			square+="\n";
		}
		for (int a = 0; a < this.size; a++) {
			square += l+"\n";
		}		
		return square;
	}

}
