import java.util.ArrayList;

public class Main {
	
	public static ArrayList<Integer> primes = new ArrayList<Integer>();
	public static ArrayList<Integer> factors = new ArrayList<Integer>();
	
	public static boolean isPrime(int n) {
		if(n == 2 || n == 3) return true;
		if(n == 1 || n%2 == 0 || n%3 == 0) return false;
		for(int i = 5; i <= Math.sqrt(n); i+= 2) if(n%i == 0) return false;
		return true;
	}
	
	public static void genPrimeList(int b) {
		primes.add(2);
		for(int i = 3; i <= b; i+=2) if(isPrime(i)) primes.add(i);
	}
	
	public static void findPrimeFactors(int n) {
		for(int p : primes) {
			if(n%p == 0) {
				//System.out.println(p + ", " + n);
				if(!factors.contains(p)) factors.add(p);
				findPrimeFactors(n/p);
				break;
			}
		}
	}
	
	public static int countPrimeFactors(int n) {
		factors.clear();
		findPrimeFactors(n);
		return factors.size();
	}
	
	public static int findFirstFour() {
		int index = 10;
		
		while(true) {
			if(countPrimeFactors(index) == 4 && countPrimeFactors(index+1) == 4 && countPrimeFactors(index+2) == 4 && countPrimeFactors(index+3) == 4) {
				break;
			}
			index++;
		}
		return index;
	}
	
	public static void main(String[] args) {
		genPrimeList(1000000);
		
		
		System.out.println(findFirstFour());
		

	}

}
