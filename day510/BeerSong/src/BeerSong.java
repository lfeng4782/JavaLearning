
public class BeerSong {
	public static void main (String[] args) {
		//beer song
		int beerNum=4;
		String word="bottles";
		while (beerNum>0) {
			if (beerNum==1) {
				word="bottle";
			}
			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			beerNum = beerNum - 1;
			
			/*if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall");
				} else {
				System.out.println("No more bottles of beer on the wall");
				} */
			if (beerNum==0) {
				System.out.println("No more bottles of beer on the wall");
			}
		}
		
		//word matrix
		String[] wordListOne = {"24/7","multiTier","30,000 foot","B-to-B","win-win","frontend", "web-based","pervasive", "smart", "sixsigma","critical-path", "dynamic"};
		String[] wordListTwo = {"empowered", "sticky",
		"value-added", "oriented", "centric", "distributed",
		"clustered", "branded","outside-the-box", "positioned",
		"networked", "focused", "leveraged", "aligned",
		"targeted", "shared", "cooperative", "accelerated"};
		String[] wordListThree = {"process", "tippingpoint", "solution", "architecture", "core competency",
		"strategy", "mindshare", "portal", "space", "vision",
		"paradigm", "mission"};
		
		// find out how many words are in each list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		// generate three random numbers
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		// now build a phrase
		String phrase = wordListOne[rand1] + " " +
		wordListTwo[rand2] + " " + wordListThree[rand3];
		
		// print out the phrase
		System.out.println(oneLength);
		System.out.println(twoLength);
		System.out.println(threeLength);
		System.out.println(rand1);
		System.out.println(rand2);
		System.out.println(rand3);
		System.out.println("What we need is a " + phrase);
		
	}
}

