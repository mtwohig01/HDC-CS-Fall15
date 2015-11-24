

class Justified_Carl {

	static int width = 25;

	public static void main(String[] args) {
		System.out.println("Justified.java\n");

		// setup
		String str = "adhad fg asdf g ad fg ad fg sd fg wertg wertgwr gwr tgwe rtgwr tg rtgwer tgwer tgwrt  wejh tyjrtyj tyu";
		String output = "";
		String temp = "";
		
		// output - top line
		String[] words = str.split(" ");
		for (int i = 0; i < width; i++)
			System.out.print("=");
		
		// output - justified body
		System.out.println();
		for (int i = 0; i < words.length; i++) {

			if (temp.length() + words[i].length() > width) {
				output = output + pad(temp);
				temp = "";
			} 
			else {
				temp += words[i] + " ";
			}
		}

		// output - bottom line
		System.out.print(output);
		for (int i = 0; i < width; i++) {
			System.out.print("=");
		}
	}

	
	/**
	 * Pad the 
	 * @param str
	 * @return
	 */
	public static String pad(String str) {
		boolean finished = false;
		while (!finished) {
			if (str.length() <= width) {
				int elle = str.indexOf(' ');
				String head = str.substring(0, elle);
				String tail = str.substring(elle);
				str = head + " " + tail;
			} else
				finished = true;
		}

		return str + "\n";
	}
}

