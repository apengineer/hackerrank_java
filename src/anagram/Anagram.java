/**
 * 
 */
package anagram;


import java.util.Scanner;



/**
 * @author aswat
 *
 */
public class Anagram {

	private static boolean isAnagram(String a, String b) {

		if(a == null || b == null ||  (a.length() != b.length()) || 
				(a.length() > 50) || (a.length() < 1)) {
			return false;
		}
		if(!a.matches("[a-zA-Z]+") || !b.matches("[a-zA-Z]+")) {
			return false;
		}

		String uniqueCharChecker = "";		 
		a = a.toLowerCase();
		b = b.toLowerCase();
		
		for ( int i = 0; i < a.length(); i++) {		    	  
			char toCheck = a.charAt(i);

			if(uniqueCharChecker.indexOf(toCheck) != -1) {
				continue;
			}	    		 
			

			long frequencyOfA =  a.chars().filter(ch -> ch == toCheck).count();
			long frequencyOfB =  b.chars().filter(ch -> ch == toCheck).count();


			if(frequencyOfA != frequencyOfB) {
				return false;
			}	    		 		     

			uniqueCharChecker += toCheck;
		}		  
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

}
