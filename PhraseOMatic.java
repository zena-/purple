public class PhraseOMatic {
	public static void main(String[] args) {
		// 3 set of words to choose from
		String[] wordListOne = {"and", "reviewing", "some", "of", "my", "old", "code", "an"};
		String[] wordListTwo = {"to", "java", "have", "very", "simple", "piece", "of", "script"};
		String[] wordListThree = {"help", "any", "future", "visitors", "it", "is", "only", "relevant"};

		//find out how many words are in each list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		//generate three randowm numbers
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);

		// new build a phrase
		String phrase = wordListOne[rand1] + " " + 
		wordListTwo[rand2] + " " + wordListThree[rand3];

		// print out the phrase
		System.out.println("what we need is a " + phrase);
	}
}