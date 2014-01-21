
public class LCA {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Node node1 = new Node(10, null, null);
		Node node2 = new Node(14, null, null);
		Node node3 = new Node(12, node1, node2);
		Node node4 = new Node(4, null, null);
		Node node5 = new Node(8, node4, node3);
		Node node6 = new Node(22, null, null);
		Node root = new Node(20, node5, node6);
		
		Node lca1 = lca(root, 10, 14);
		System.out.println("LCA of 10 and 14 is: " + lca1.m_data);
		Node lca2 = lca(root, 8, 14);
		System.out.println("LCA of 8 and 14 is: " + lca2.m_data);
		
	}
	
	public static Node lca(Node root, int n1, int n2) {
		if (root == null) {
			return null;
		}
		
		// lca is to the left of root
		if (root.m_data > n1 && root.m_data > n2) {
			return lca(root.m_leftNode, n1, n2);
		}
		
		// lca is to the right of root
		if (root.m_data < n1 && root.m_data < n2) {
			return lca(root.m_rightNode, n1, n2);
		}		
		
		return root;
	}

}

class Node {
	public int m_data;
	public Node m_leftNode;
	public Node m_rightNode;
	
	public Node(int data, Node leftNode, Node rightNode) {
		m_data = data;
		m_leftNode = leftNode;
		m_rightNode = rightNode;
	}
}

