public class Dino {
	private String name;
	private int age;

	Dino () {
		name = "no name yet"; 
		age = 21;
	}

	Dino(String dname) {
		this();
		name = dname;
	}

	public String getName(){
		return name;
	}
}