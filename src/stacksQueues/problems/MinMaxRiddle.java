package stacksQueues.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class MinMaxRiddle {

	static long[] riddle(long[] array) {

		if (array == null) return null;
		int length = array.length;

		long res[] = new long[length];
		PriorityQueue<Long> pq = new PriorityQueue<Long>();
		int k = 1;
		
		long max = Arrays.stream(array).reduce((x, y) -> x > y ? x : y).getAsLong();
		
		pq.add(max);		
		
		for (int i = 0; i < length - 1; i++) {
			res[i] = Math.min(array[i], array[i + 1]);
			pq.add(Math.min(array[i], array[i + 1]));
		}
	
		for (int i = 0; i < length ; i++) {
			res[i]  = pq.poll();			
		}

		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long[] array = {6, 3, 5, 1, 12};
		long[] res = riddle(array);
		System.out.println();
		for(long l : res) {
			System.out.print(l + " ");
		}
	}

}
