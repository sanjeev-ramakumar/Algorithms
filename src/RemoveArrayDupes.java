import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class RemoveArrayDupes {
	
	public static Set<String> removeDupes(List<String> origList) {
		Set<String> newList = new LinkedHashSet<String>(origList);
		return newList;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> origList = new ArrayList<String>();
		origList.add("abc");
		origList.add("def");
		origList.add("abc");
		origList.add("ghi");
		origList.add("jkl");
		origList.add("mno");
		origList.add("jkl");
		
		Set<String> newList = removeDupes(origList);
		for (String s : newList) {
			System.out.println(s);
		}			
	}

}
