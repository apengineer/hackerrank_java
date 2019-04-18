package hackerrank.stacksAndQueues;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinMaxRiddle {

	static long[] riddle(long[] array) {

		if (array == null) return null;
		int length = array.length;

		long tmp[] = new long[length - 1];		
		long res[] = new long[length];
		
		long max = Arrays.stream(array).reduce((x, y) -> x > y ? x : y).getAsLong();
		
		Queue<Long> q = new LinkedList<Long>();
		q.add(max);
		for (int i = 0; i < length - 1; i++) {
			tmp[i] = Math.min(array[i], array[i + 1]);
			q.add(tmp[i]);		
		}			
				
		res[0] = q.poll();
		
		int i = 0; int end = array.length - 1;
		int index = 1; long curMax = 0; long curMin = 0;
		
		/*while(!q.isEmpty()) {
			System.out.print(q.poll() + " ");
		}*/
	
		while(i < end) {
			long first = q.poll();
			if ( i <= end - 1) {
				long second = q.peek();
				
				curMin = Math.min(first, second);
				
				q.add(curMin);			
				
				
				curMax = Math.max(first, curMax);
				
				i++;
				
				if (i ==  end) {
					res[index] = curMax;
					index++;
					
					i = 0;
					end = end - 1 ;
				}		
			}
			
			
		}
		
	/*	while(!q.isEmpty()) {
			System.out.print(q.poll() + " ");
		}*/
		
		
	
		
		
		
		
		

		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long[] array = {1, 2, 3, 5, 1, 13, 3};
		long[] res = riddle(array);
		System.out.println();
		for(long l : res) {
			System.out.print(l + " ");
		}
	}

}
