package stacksQueues.problems;

import java.util.Stack;

public class BalancedBrackets {


	public static int compliment(int bracket) {
		if (bracket == 41) return 40;
		if (bracket == 93) return 91; 
		if(bracket == 125) return 123;
		return 0;
	}

	public static String isBalanced(String s) {
		if (s == null) return "NO";

		char[] cArray = s.toCharArray();
		if(cArray.length % 2 != 0) return "NO";

		Stack<Integer> stack = new Stack<Integer>();
		stack.push((int) cArray[0]);
		for(int index = 1; index < cArray.length; index++) {
			int bracket = cArray[index];
			if(!stack.isEmpty()) {
				int prevBracket = stack.peek();		
				// if current bracket and prev bracket are compliments, then pop the bracket
				if(prevBracket == compliment(bracket)) {
					stack.pop();
				}else{
					stack.push(bracket);
				}	
			}
		}

		if(stack.isEmpty()) {
			return "YES";
		}else {
			return "NO";
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isBalanced("{(([])[])[]}"));

	}

}
