
public class Line extends Shape {

	private int length;
	private boolean vertical;
	private String line = "";
	private int y=this.getY();	
	private int x=this.getX();	

	public Line(int length, boolean vertical) {
		this.length = length;
		this.vertical = vertical;
	}

	public Line(int x, int y, char fill, int length, boolean vertical) {
		super(x, y, fill);
		this.length = length;
		this.vertical = vertical;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public boolean isVertical() {
		return vertical;
	}

	public void setVertical(boolean vertical) {
		this.vertical = vertical;
	}

	public String toString() {
		//odriadkuje pomocou zadanej pozicie y
		for (int i=0;i<y;i++){
			System.out.print("\n");
		}
		if (vertical) {	
			//vypise medzery + posunie vpravo podla zadanej premennej x
			for (int i = 0; i < length; i++) {
				for (int j=0;j<x;j++){
					line += " ";
				}
				line += (this.getFill() + "\n");
			}
		} else {
			for (int j=0;j<x;j++){
				line += " ";
			}
			for (int i = 0; i < length; i++) {				
				line += this.getFill();
			}
		}
		return line;
	}
}
