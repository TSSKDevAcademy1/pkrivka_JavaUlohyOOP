
public class HelloWorld {

	public static void main(String[] args) {
		//vypise meno osoby + vek
		Person p = new Person("Janko Hrasko", 18);
		System.out.println(p.toString());
		
		//vypise trojuholnik podla zadanych premennych
		Triangle t = new Triangle(5, 2, 'q', 7);
		System.out.println(t.toString());
		
		//vypise line podla zadanych premennych
		Line l = new Line(5, 2, 'w', 5, true);
		System.out.print(l.toString());
		
		//vypise stvorec podla zadanych premennych
		Square s = new Square(5, 2, 'b', 10);
		System.out.println(s.toString());

		//vypise obdlznik podla zadanych premennych
		Rectangle r = new Rectangle(2, 2, 'p', 5, 3);
		System.out.println(r.toString());	
	}

}