
public class LinkedListFlatten {
	
	static void flattenRecursive(LNodeWithChild head) {
		while (head != null) {
			// handle the case where there is a child
			if (head.m_child != null) {
				flattenRecursive(head.m_child);
				LNodeWithChild temp = head.m_child;
				while (temp.m_next != null) {
					temp = temp.m_next;
				}
				temp.m_next = head.m_next;
				head.m_next = head.m_child;
				head.m_child = null;
			}
			head = head.m_next;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 	1->3->7
		 * 	2  4->6
		 *     5	
		 *     
		 *  Output
		 *  1->2->3->4->5->6->7   
		 */
		LNodeWithChild node2 = new LNodeWithChild(2, null, null);
		LNodeWithChild node5 = new LNodeWithChild(5, null, null);
		LNodeWithChild node6 = new LNodeWithChild(6, null, null);
		LNodeWithChild node4 = new LNodeWithChild(4, node6, node5);
		LNodeWithChild node7 = new LNodeWithChild(7, null, null);
		LNodeWithChild node3 = new LNodeWithChild(3, node7, node4);
		LNodeWithChild node1 = new LNodeWithChild(1, node3, node2);
		
		flattenRecursive(node1);
		
		while (node1 != null) {
			System.out.print(node1.m_data + "->");
			node1 = node1.m_next;
		}
		
	}

}

class LNodeWithChild {
	
	public int m_data;
	public LNodeWithChild m_next;
	public LNodeWithChild m_child;
	
	public LNodeWithChild(int data, LNodeWithChild next, LNodeWithChild child) {
		m_data = data;
		m_next = next;
		m_child = child;
	}
	
}
