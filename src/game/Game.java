package game;

import java.util.Scanner;

public class Game {
	
	public static boolean canWin(int leap, int[] game) {
		// Return true if you can win the game; otherwise, return false.
		for (int i = 1; i < game.length; i++) {
			int j = game[i];
			
			if(j == 0) {
				continue;
			}
			
			
			if(game[i + leap] == 0) {
				
			}
		}

		return true;
		
        
    }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();

	}

}
