import java.util.ArrayList;
import java.util.List;


public class BinaryTreePrint {
	
	public static void levelOrder(Node root) {
		List<Node> nodes = new ArrayList<Node>();
		nodes.add(root);
		
		level(nodes);
	}
	
	public static void level(List<Node> nodes) {
		List<Node> next = new ArrayList<Node>();
		for (Node node: nodes) {
			if (node != null) {
				System.out.print(node.m_data);
				next.add(node.m_leftNode);
				next.add(node.m_rightNode);				
			}
		}
		System.out.println();
		if (next.size() > 0) {
			level(next);			
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node node4 = new Node(4, null, null);
		Node node2 = new Node(2, node4, null);
		Node node5 = new Node(5, null, null);
		Node node6 = new Node(6, null, null);
		Node node3 = new Node(3, node5, node6);
		Node node1 = new Node(1, node2, node3);
		
		levelOrder(node1);
	}

}