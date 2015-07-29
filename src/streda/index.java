package streda;

public class index {

	public static void main(String[] args) {
		
		NameOfDay meno = new NameOfDay(args[0]); 
		//porovna argument, ci je int/string 
		try {
			int n = Integer.parseInt(args[0]);
			System.out.println(meno.printDay(n));
		} catch (NumberFormatException nfe) {
			System.out.println(meno.printDay(args[0]));
		}

	}

}
