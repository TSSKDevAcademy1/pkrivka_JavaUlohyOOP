package streda;

public class NameOfDay {
	private String day;
	private String name;

	public NameOfDay(String day) {
		this.day = day;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
//porovnava den podla int
	public String printDay(int day) {
		name = "";
		switch (day) {
		case 1:
			name = "Pondelisko";
			break;
		case 2:
			name = "Utorisko";
			break;
		case 3:
			name = "Streda";
			break;
		case 4:
			name = "Stvrtok";
			break;
		case 5:
			name = "Piatocek";
			break;
		case 6:
			name = "Soboticka";
			break;
		case 7:
			name = "Nedelicka";
			break;
		default:
			name = "Co za den si to zadal??";
			break;
		}
		return name;
	}
//porovnava den podla string
	public String printDay(String day) {
		name = "";
		switch (day) {
		case "pondelok":
			name = "Pondelisko";
			break;
		case "utorok":
			name = "Utorisko";
			break;
		case "streda":
			name = "Streda";
			break;
		case "stvrtok":
			name = "Stvrtok";
			break;
		case "piatok":
			name = "Piatocek";
			break;
		case "sobota":
			name = "Soboticka";
			break;
		case "Nedela":
			name = "Nedelicka";
			break;
		default:
			name = "Co za den si to zadal??";
			break;
		}
		return name;
	}

}
