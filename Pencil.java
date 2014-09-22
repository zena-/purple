class Pencil { // pencil is a object 
	// data menme=bers
	public String color = "red";
	public int length;
	public float diameter;

	public static long nextID = 0;

	public void setColor (String newColor) {
		color = myColor;
	}

	public String getColor() {
		return color;
	}

}

public class CreatePencil {
	public static void main(String[] args) {
		Pencil p1 = new Pencil();
		Pencil p2 = new Pencil();

		p1.length = 5;
		p2.length = 5;

		p1.setColor("blue");
		// p1.price = 0.5f;
	}
}