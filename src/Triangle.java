
public class Triangle extends Shape {

	private int size;
	private String triangle = "";
	private int y = this.getY();
	private int x = this.getX();

	public Triangle(int size) {
		this.size = size;
	}

	public Triangle(int x, int y, char fill, int size) {
		super(x, y, fill);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	//vypise medzery + posunie vpravo podla zadanej premennej x
	private String spaces(int riadok) {
		String spaces = "";
		for (int i = 0; i < size - riadok - 1 + x; i++) {
			spaces += " ";
		}
		return spaces;
	}
	
	//vypise symbol
	private String symbols(int riadok) {
		String symbols = "";
		for (int i = 0; i < (riadok * 2) + 1; i++) {
			symbols += this.getFill();
		}
		return symbols;
	}

	@Override
	public String toString() {
		//odriadkuje pomocou zadanej pozicie y
		for (int i = 0; i < y; i++) {
			System.out.print("\n");
		}
		//vypise dane symboly
		for (int riadok = 0; riadok < size; riadok++) {
			triangle += spaces(riadok) + symbols(riadok) + "\n";
		}
		return triangle;
	}

}
