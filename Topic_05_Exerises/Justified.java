/* 
 *	Exercise 8
 *	Formats a String to be justified with width of 30 characters
 *	Michael Twohig
 */



class Justified {

		public static void main(String[] args) {
		System.out.println( "Justified.java\n" );
		// setup
		int extra [];
		extra = new int[100];
		String sentance = "adhad fg asdf g ad fg ad fg sd fg wertg wertgwr gwr tgwe rtgwr tg rtgwer tgwer tgwrt  wejh tyjrtyj tyu";
		int count=0;
		String [] words = sentance.split(" ");
		int numoflines=0;
		int numofwords=0;
		int [] numofwordsinaline;
		numofwordsinaline = new int[15];
		for ( int i = 0; i < words.length; i++ ) {
			count = count + words[i].length() + 1;
			
			if ( count>=25 ) {
				extra[numoflines]=count-24;
				numofwordsinaline[numoflines]=i;
				numoflines++;
				count=0;
			}
		
		}
		System.out.print( words[0]);
		for (int i=1; i<=numofwordsinaline[0] ;i++) {
			if (extra[0]==0)
				System.out.print( "" + words[i]);
			else if (extra[0]==1)
				System.out.print( " " + words[i]);
			else if (extra[0]==2)
				System.out.print( " " + words[i]);
				
				
		}
		System.out.println(" ");
		int flag=1;
		System.out.print( words[numofwordsinaline[0]+2]);
		for (int i=numofwordsinaline[0]+3; i<=numofwordsinaline[1] ;i++) {
			
			if ((extra[1]==2) && (flag == 1)) {
				System.out.print(" ");
				flag=0;
				}
			else if ((extra[1]==3) && (flag==1)) {
				System.out.print(" ");
				flag=0;
				}
			else if ((extra[1]==4) && (flag==1)) {
				System.out.print("  ");
				flag=0;
				}

			
			System.out.print(" " + words[i]);
		}
		System.out.println(" ");
		flag=1;
		System.out.print( words[numofwordsinaline[1]+2]);
		for (int i=numofwordsinaline[1]+3; i<=numofwordsinaline[2] ;i++) {
			
			if ((extra[2]==2) && (flag == 1)) {
				System.out.print("  ");
				flag=0;
				}
			else if ((extra[2]==3) && (flag==1)) {
				System.out.print("   ");
				flag=0;
				}
			else if ((extra[2]==4) && (flag==1)) {
				System.out.print("    ");
				flag=0;
				}

			System.out.print(" " + words[i]);
		}
		System.out.println("\n");
		

	}
}

