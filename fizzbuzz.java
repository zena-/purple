class fizzbuzz {
	public static void main(String[] args) {
		
		for (int i=0; i<31; i++) {
			if (i%3==0) {
				System.out.println("fizz");
			} else if (i%5==0) {
				System.out.println("buzz");
			}
			System.out.println("n is " +i);
		}

	}
} 