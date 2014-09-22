public class Driver extends purple.java/temperture {
	public static void main(String[] args) {
		
		float val = 12.0f;

		temperture one = new temperture();
		temperture two = new temperture(val);
		temperture three = new temperture('C');
		temperture four = new temperture(10, 'F');	

		one.setValue(12);
	}
}