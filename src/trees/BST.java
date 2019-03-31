package trees;



public class BST {

	
	public static void main(String args[]) {
		Node root = new Node(7);		
		root.insert(1);
		root.insert(0);
		root.insert(3);
		root.insert(2);
		root.insert(5);
		root.insert(4);
		root.insert(6);
		root.insert(9);
		root.insert(8);
		root.insert(10);
		
		System.out.println("In Order");
		root.printInOrder();
		System.out.println();		
		System.out.println("Pre Order");
		
		root.printPreOrder();
		
		System.out.println();
		System.out.println("Post Order");
		root.printPostOrder();
		
		System.out.println();
		System.out.println("Level of node");
		System.out.println(root.find(6));
		
		System.out.println("height of tree");
	
		System.out.println(root.height(root));
		
		System.out.println(root.isBST(root));
		
	}
	
	

}
