public  class pen {
	private  String color = "blue";
	public int length;
	public float diameter;
	public static long nextID = 0;

	public void setColor (String myColor, int x) {
		color = myColor;
		length = x;
	}

	public String getColor() {
		return color;
	}
}

///////// Sample class and constructors
/*
class Body {
	private long idNum;
	private String name = "empty";
	private Body orbits;
	private static long nextID = 0;

	Body( ) {
	idNum = neaxtID++;
	}
	
	Body (String bodyName, Body orbitsAround) {
	this();
	name = bobyName;
	orbits = orbitsAround;
	}
}
*/