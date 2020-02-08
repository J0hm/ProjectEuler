public class Main {
	
	public static String rotate(String s) {
		return s.substring(1) + s.substring(0,1);
	}
	
	public static boolean isCircularPrime(int n) {
		String s = Integer.toString(n);
		
		for(int i = 0; i < s.length(); i++) {
			if(!isPrime(Integer.parseInt(s))) return false; 
			s = rotate(s);
		}
		
		return true;
	}
	
	public static boolean isPrime(int n) {
		if(n == 2 || n == 3) return true;
		if(n == 1 || n%2 == 0 || n%3 == 0) return false;
		
		for(int i = 5; i < Math.sqrt(n); i+=2) {
			if(n%i==0) return false;
		}
		return true;
	}
	
	public static int countCircular(int bound) {
		int count = 1; // 2
		
		for(int i = 3; i <= bound; i+= 2) {
			if(isCircularPrime(i)) count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(countCircular(1000000));

	}

}
