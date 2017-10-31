public class Main{
	public static void main(String[] args) {
		Node<String> root = new Node<String>("*");
		Node<String> left = new Node<String>("*");
		Node<String> leftRight = new Node<String>("e");
		Node<String> right = new Node<String>("p");
		Node<String> rightRight = new Node<String>("3");
		Node<String> rightLeft = new Node<String>("+");
		Node<String> rightLeftLeft = new Node<String>("2x");
		Node<String> rightLeftRight = new Node<String>("3");
		Node<String> leftLeft = new Node<String>("3");
		Node<String> leftRightRight = new Node<String>("x");
		
		root.left = left;
		root.left.right = leftRight;
		root.right = right;
		root.right.right = rightRight;
		root.right.left = rightLeft;
		root.right.left.left = rightLeftLeft;
		root.right.left.right = rightLeftRight;
		root.left.left = leftLeft;
		root.left.right.right = leftRightRight;
		
		BTreePrinter.printNode(root);
		System.out.println("Hello World!");
	}
}
