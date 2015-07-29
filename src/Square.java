
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
		//Line l=new Line(0, 0, this.getFill(), this.size, false);
		String square = "";
		//odriadkuje pomocou zadanej pozicie y
		for (int i=0;i<y;i++){
			System.out.print("\n");
		}		
		for (int i = 0; i < size; i++) {
			//vypise medzery + posunie vpravo podla zadanej premennej x
			for (int k=0;k<x;k++){
				square += " ";
			}
			for (int j=0;j<size;j++){
				square += this.getFill();
			}			
			square += "\n";			
		}
		return square;
	}

}
