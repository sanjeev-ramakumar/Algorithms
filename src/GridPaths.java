
public class GridPaths {
	
	public static void printPath(int n, int m, String path) {
		if (n==0 && m==0) {
			System.out.println(path);
		}
		
		if (n>0) {
			printPath(n-1, m, path + "right");
		}
		
		if (m>0) {
			printPath(n, m-1, path + "left");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printPath(5, 3, " ");
	}

}
