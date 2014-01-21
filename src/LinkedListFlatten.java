
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
