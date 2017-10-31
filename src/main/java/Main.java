public class Main{
	public static void main(String[] args) {
		Node<String> root = new Node<String>("*");
		Node<String> left = new Node<String>("exp");
		Node<String> leftRight = new Node<String>("x");
		Node<String> right = new Node<String>("pol");
		Node<String> rightRight = new Node<String>("3");
		Node<String> rightLeft = new Node<String>("+");
		Node<String> leftRightLeft = new Node<String>("2x");
		Node<String> leftRightRight = new Node<String>("3");
		
		root.left = left;
		root.left.right = leftRight;
		root.right = right;
		root.right.right = rightRight;
		root.right.left = rightLeft;
		root.left.right.left = leftRightLeft;
		root.left.right.right = leftRightRight;
		
		BTreePrinter.printNode(root);
		System.out.println("Hello World!");
	}
}
