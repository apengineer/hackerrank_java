package repeatedString;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup */
public class Solution {

	  // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	int stringLength = s.length();
      	long nrOfRepeat = 0;
    	if(s.contains("a")) {
    		long nrOfAs = s.chars().filter(ch -> ch == 'a').count();    		
    		int remainder = (int) (n % stringLength);
    		if( remainder == 0) {
    			nrOfRepeat = n / stringLength ;
    			return nrOfRepeat * nrOfAs;    			
    		} else {
    			nrOfRepeat = n / stringLength ;
    			long nrAsFromCompleteString = nrOfRepeat * nrOfAs;
    			// nr of As in the remaining String, whose length will be less than string length
    			String subString = s.substring(0, remainder);
    			long nrOfAsInSubStr = subString.chars().filter(ch -> ch == 'a').count();
    			return (nrAsFromCompleteString + nrOfAsInSubStr);    			
    		}
    		
    	} else {
    		return 0;
    	}
    }
    
	public static void main(String[] args) {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        long n = sc.nextLong();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(result);

        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        sc.close();

	}

}
