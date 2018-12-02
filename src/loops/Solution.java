package loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	private static List<Object> createSeries(List<Object> paramsList) {
		
		List<Object> seriesList = new ArrayList<Object>();
		
		for (Object object : paramsList) {
			int []params = (int[])object;
			int a = params[0];
			int b = params[1];
			int n = params[2];
			
			int[] seriesArray = new int[n];
			seriesArray[0] =  a + b*(int)(Math.pow(b, 0));
			for(int power = 1; power < n; power++) {
				int arrayElement = seriesArray[power - 1]+ (b*(int)(Math.pow(2, power)));
				seriesArray[power] = arrayElement;			
			}			
			seriesList.add(seriesArray);			
		}
		return seriesList;		
	}

	public static void main(String[] args) {
		
		List<Object> listOfParams = new ArrayList<Object>();
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++){
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			
			int[] params = {a, b, n};
			listOfParams.add(params);			
			
		}
		in.close();
		
		List<Object> seriesList = createSeries(listOfParams);
		
		for (Object object : seriesList) {
			int[] seriesArray = (int[])object;			
			for (int i = 0; i < seriesArray.length; i++) {
				System.out.print(seriesArray[i] + " ");				
			}
			System.out.println();			
		}
	}

}
