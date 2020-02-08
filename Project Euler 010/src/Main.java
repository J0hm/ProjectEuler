
public class Main {

	
	public static boolean isPrime(long n) {
	    if(n < 2) return false;
	    if(n == 2 || n == 3) return true;
	    if(n%2 == 0 || n%3 == 0) return false;
	    long sqrtN = (long)Math.sqrt(n)+1;
	    for(long i = 6L; i <= sqrtN; i += 6) {
	        if(n%(i-1) == 0 || n%(i+1) == 0) return false;
	    }
	    return true;
	}
	
	public static long sumPrimes(int n) { // sum all primes under n
		long sum = 0;
		
		for(int j = 1; j < n; j+=2) {
			if(isPrime(j)) {
				sum+=j;
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumPrimes(2000000));

	}

}
