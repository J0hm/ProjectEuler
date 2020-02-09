import java.util.ArrayList;

public class Main {
	
	static ArrayList<String> out = new ArrayList<String>();
	
	public static void permutation(String s) {
		permutation("", s);
	}
	
	public static void permutation(String p, String s) {
		if(s.isEmpty()) {
			out.add(p+s);
		}else {
			for(int i = 0; i < s.length(); i++) {
				permutation(p + s.charAt(i), s.substring(0, i) + s.substring(i+1));
			}
		}
	}
	
	public static boolean isPandigital(String s) { // only 0-9 pandigital
		int[] digits = new int[10]; // 0-9
		
		for(char c : s.toCharArray()) {
			digits[Character.getNumericValue(c)]++;
		}
		
		for(int n : digits) if(n!=1) return false;
		
		return true;
	}
	
	public static boolean isSubDivisible(String s) {
		int val;
		int divisors[] = {2, 3, 5, 7, 11, 13, 17};
		
		for(int i = 1; i <= 7; i++) {
			val = Integer.parseInt(s.substring(i, i+3));
			if(val%divisors[i-1] != 0) return false; 
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		permutation("0123456789");
		long sum = 0;
		
		
		for(String s : out) {
			if(isSubDivisible(s)) {
				System.out.println(s);
				sum+= Long.parseLong(s);
			}
		}
		
		System.out.println("Sum: " + sum);
		
	}

}
