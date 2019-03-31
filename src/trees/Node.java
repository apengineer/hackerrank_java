package trees;

// Binary Search Tree
public class Node {

	public Node left;
	public Node right;
	public int data;
	static int levelOfNode; 
	static boolean isBST = false;

	public Node(int d) {
		data = d;
	}

	//https://www.geeksforgeeks.org/a-program-to-check-if-a-binary-tree-is-bst-or-not/
	public boolean isBST(Node n) {
		return isBSTUtil(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	public boolean isBSTUtil(Node n , int min, int max) {	
		if(n == null) return true;

		else {
			if(n.data < min || n.data > max) return false;

			return isBSTUtil(n.left, min, n.data - 1) &&
					isBSTUtil(n.right, n.data + 1, max);			

		}


	}

	public int height(Node root) {
		if(root==null)
			return -1;
		else {
			int lHeight = height(root.left);
			int rHeight = height(root.right);

			if(lHeight > rHeight) return lHeight + 1;
			else return rHeight + 1;
		}


	}


	public void insert(int value) {
		if(value <= data) { // add to left
			if(left == null) {
				left = new Node(value);
			} else {
				left.insert(value);
			}
		} else { // add to right
			if(right == null) {
				right = new Node(value);
			} else {
				right.insert(value);
			}
		}
	}



	public int find(int value) {				
		if(data == value) {
			return 0;
		}		
		if(value <= data) { // travel left
			levelOfNode ++;
			left.find(value);
		} else { // travel right
			levelOfNode++;
			right.find(value);
		}
		return levelOfNode;		

	}


	public boolean contains(int value) {
		if(data == value) {
			return true;
		} else if(value < data) { // check left side
			if(left == null) {
				return false;
			} else {
				return left.contains(value);
			}
		} else { // check right side
			if(right == null) {
				return false;
			} else {
				return right.contains(value);
			}
		}

	}

	public void printInOrder() { // left, root, right
		if(left != null) {
			left.printInOrder();
		}
		System.out.print(data + "  ");
		if (right != null) {
			right.printInOrder();
		}		
	}

	public void printPreOrder() { // root, left, right
		System.out.print(data + " ");
		if(left != null) {
			left.printPreOrder();
		}
		if (right != null) {
			right.printPreOrder();
		}
	}

	public void printPostOrder() { // left, right, root		
		if(left != null) {
			left.printPostOrder();
		}
		if (right != null) {
			right.printPostOrder();
		}

		System.out.print(data + " ");
	}
}
