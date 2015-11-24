public class PhraseOMatic {
	public static void main (String [] args) {
		String[] wordList1 = {"24/7","multi-Tier","30,000 foot",
		"B-to-B","win-win","front-end","web-based","pervasive",
		"smart","six-sigma","critical-path","dynamic"};
		
		String[] wordList2 = {"empowered","sticky","value-added",
		"oriented","centric","distributed","clustered","branded",
		"outside-the-box","positioned","networked","focus","leveraged",
		"aligned","targeted","shared","cooperative","accelerated"};

		String[] wordList3 = {"process","tipping-point","solution",
		"architecture","core competency","strategy","mindshare",
		"portal","space","vision","paradigm","mission"};

		int oneLength=wordList1.length;
		int twoLength=wordList2.length;
		int threeLength=wordList3.length;

		int rand1= (int) (Math.random() * oneLength);
		int rand2= (int) (Math.random() * twoLength);
		int rand3= (int) (Math.random() * threeLength);
	
		String phrase = wordList1[rand1] + " " + wordList2[rand2] + " "  		+ wordList3[rand3];
		
		System.out.println("What we need is a " + phrase);
	}
}
