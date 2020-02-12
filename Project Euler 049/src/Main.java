import java.util.ArrayList;

public class Main {
	
	public static ArrayList<Integer> primes = new ArrayList<Integer>();
	
	public static boolean isPrime(int n) {
		if(n == 2 || n == 3) return true;
		if(n == 1 || n%2 == 0 || n%3 == 0) return false;
		for(int i = 5; i <= Math.sqrt(n); i+= 2) if(n%i == 0) return false;
		return true;
	}
	
	
	public static void genPrimeList(int b) {
		for(int i = 1489; i <= b; i+=2) if(isPrime(i)) primes.add(i);
	}
	
	
	public static boolean isPermutation(int a, int b) {
		int[] digitsA = new int[10];
		int[] digitsB = new int[10];
		
		while(a > 0) {
			digitsA[a%10]++;
			a/=10;
		}
		
		while(b > 0) {
			digitsB[b%10]++;
			b/=10;
		}
		
		for(int i = 0; i < digitsA.length; i++) {
			if(digitsA[i] != digitsB[i]) return false; 
		}
		
		return true;
		
	}
	
	
	public static String findTriplet() {
		int n;
		
		for(int i = 0; i < primes.size(); i++) {
			for(int j = i+1; j < primes.size(); j++) {
				n = primes.get(j) + (primes.get(j) - primes.get(i));
				if(isPrime(n)) {
					if(isPermutation(primes.get(i), primes.get(j)) && isPermutation(primes.get(i), n)) {
						return Integer.toString(primes.get(i)) + Integer.toString(primes.get(j)) + Integer.toString(n);
					}
				}
			}
		}
		
		return ""; 
	}
		
	
	public static void main(String[] args) {
		genPrimeList(9999);
		
		System.out.println(findTriplet());
		
		
	}

}
