import java.io.IOException;


public class Palindromes {
	
	public static boolean isPalindrome(String s) throws IOException {
		if (s == null) {
			throw new IOException("String is null");
		}
		
		if (s.length() < 1) {
			return false;
		}
		
		int i = 0;
		int j = s.length() - 1;
		
		while (i < j) {
			while (s.charAt(i) == ' ') {
				i++;
			}
			
			while (s.charAt(j) == ' ') {
				j--;
			}
			
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.println("malayalam is " + isPalindrome("malayalam"));
			System.out.println("ddfg is " + isPalindrome("ddfg"));
			System.out.println("beatstaeb is " + isPalindrome("beatstaeb"));
			System.out.println("sanjeev is " + isPalindrome("sanjeev"));
			System.out.println("samas is " + isPalindrome("samas"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
