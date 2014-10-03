public class Do {
	public static void main(String[] args) {
	// 	int x = 1;
	// 	while (x<3) {
	// 		System.out.print("Doo");
	// 		System.out.print("Bee");
	// 		x=x+1;
	// 	}
	// 	if (x==3) {
	// 		System.out.print("Do");
	// 	}
	// }
		int beerNum = 29;
		String word = "bottles";

		while (beerNum>0) {
			if (beerNum==1) {
				word = "bottles"; //singula
			}
			// System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("take one down.");
			System.out.println("pass it around");
			beerNum = beerNum - 1;

			if(beerNum>0){
				System.out.println(beerNum + " " + word + " of beer on the wall!!");
			} else {
				System.out.println("No more beer on the wall");
			}
		}
	}
}