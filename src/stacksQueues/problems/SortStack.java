package stacksQueues.problems;

import stacksAndQueues.Node;
import stacksAndQueues.MyStack;


public class SortStack {

	public MyStack sortStack(MyStack s) {
		
		MyStack r = new MyStack();
		while(!s.isEmpty()) {
			Node tmp = s.pop();
			while((!r.isEmpty()) && r.peek().data > tmp.data) {
				s.push(r.pop().data);
			}
			r.push(tmp.data);
		}
		return r;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyStack ss = new MyStack();
		ss.push(10);
		ss.push(2);
		ss.push(9);
		ss.push(5);
		ss.push(3);
		
		SortStack sort = new SortStack();
		MyStack sortedStack = sort.sortStack(ss);
		
		sortedStack.show();

	}

}
