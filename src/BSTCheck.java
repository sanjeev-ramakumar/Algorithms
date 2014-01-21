
public class BSTCheck {
	
	static boolean isValidBST(Node node, int min, int max) {
		if (node == null) {
			return true;
		}
		
		if (node.m_data > min 
			&& node.m_data < max 
			&& isValidBST(node.m_leftNode, min, node.m_data)
			&& isValidBST(node.m_rightNode, node.m_data, max)) {
			return true;
		}
		
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 *          8
		 *    3            10
		 * 1     6              14
		 *     4   7	     13
		 */
		Node node1 = new Node(1, null, null);
		Node node4 = new Node(4, null, null);
		Node node7 = new Node(7, null, null);
		Node node6 = new Node(6, node4, node7);
		Node node3 = new Node(3, node1, node6);
		Node node13 = new Node(13, null, null);
		Node node14 = new Node(14, node13, null);
		Node node10 = new Node(10, null, node14);
		Node node8 = new Node(8, node3, node10);
		
		System.out.println("Tree is BST? " + isValidBST(node8, 0, 65536));
	}

}
