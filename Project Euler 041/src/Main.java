
public class Main {
	
	public static boolean isPrime(int n) {
		if(n == 2 || n == 3) return true;
		if(n == 1 || n%2 == 0 || n%3 == 0) return false;
		for(int i = 5; i < Math.sqrt(n) + 1; i+=2) if(n%i == 0) return false; 
		return true; 
	}
	
	public static boolean isPandigitalPrime(int n) {
		int[] digits = new int[(int)Math.log10(n)+1]; // digit index = digit - 1
		int digit;
		
		if(!isPrime(n)) return false; 
		
		while(n > 0) {
			digit = n%10;
			
			if(digit == 0 || digit > digits.length) return false; 
			
			digits[digit-1]++;
			n/=10;
		}
		
		for(int num : digits) {
			if(num != 1) return false; 
		}
		
		return true;
	}
	
	public static int findLargestPandigital(int b) { // b must be odd
		
		for(int i = b; i > 0; i-=2) if(isPandigitalPrime(i)) return i;
		
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(findLargestPandigital(12999999));

	}

}
