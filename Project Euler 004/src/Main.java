
public class Main {
	
	public static Boolean isPalindrome(String s) {
		
		for(int i = 0; i < s.length()/2; i++) {
			if(s.charAt(i) != s.charAt(s.length()-i-1)) {
				return false;
			}
		}
		
		return true;
	}
	
	public static int largestPalindrome(int bound) {
		int n;
		int largestPalindrome = 0;
		String sn;
		
		for(int i = bound; i > 99; i--) {
			for(int j = bound; j > 99; j--) {
				n = i*j;
				sn = Integer.toString(n);
				
				if(isPalindrome(sn) && n > largestPalindrome) {
					largestPalindrome = n;
				}
			}
		}
		
		return largestPalindrome;
	}
	
	public static void main(String[] args) {
		System.out.println(largestPalindrome(999));

	}

}
