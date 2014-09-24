public class animal {
	public static void main(String[] args) {
		// declare an arrey 
		String[] ani;

		// allocates memory for number(3) of animals
		ani = new String[3];

		// initialize first element
		ani[0] = "dog";
		ani[1] = "cat";
		ani[2] = "fish";

		System.out.println("the first element is " + ani[0]);
		System.out.println("the second element is " + ani[1]);
		System.out.println("the third element is " + ani[2]);
	}
}