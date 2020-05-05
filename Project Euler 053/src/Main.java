
public class Main {
	// standard factorial method
	public static long factorial(long n) {
		if (n == 0 || n == 1) return 1;
		return n*factorial(n-1);
	}
	
	
	// standard gcd method
	public static long findGCD(long a, long b) {
		long gcd = 1;
		
		for(int i = 1; i <= a && i <= b; i++) {
			if(a%i == 0 && b%i == 0) gcd = i;
		}
		
		return gcd;
	}
	
	
	// efficient method to find nCr for large numbers
	// standard formula does not work because it overflows the long limit
	// this one works for all values where the result is less than the long limit, ignores if n! or r! is over it
	public static long combination(long n, long r) {
		long nf = 1; // keeps n factorial
		long rf = 1; // keeps r factorial
		long gcd;
		
		 if (n - r < r) { 
			 r = n - r; 
	     }
		 
		 if(r != 0) {
			while(r>0) {
				 nf *= n;
				 rf *= r;
				 
				 gcd = findGCD(nf, rf);
				 
				 nf/=gcd;
				 rf/=gcd;
				 
				 n--;
				 r--;
			}
		 }else {
			 nf = 1;
		 }
		 
		 return nf;
	}
	
	
	// find count of combinations > b
	public static int findGreaterCombinationCt(int b, int n){
		int res = 0;; // nCr mimics Pascal's triangle, biggest numbers in middle. This allows us to calculate how many numbers > b with just the lower bound
		
		for(int r = 0; r < n/2+1; r++) {
			if(combination(n, r) > b) {
				res = n-2*r+1;
				break;
			}
		}
		
		return res;
	}
	
	public static int solve() {
		int count = 0;
		int b = 1000000; // bound
		
		for(int n = 23; n <= 100; n++) { // first value > 1000000 at n = 23 (given)
			count += findGreaterCombinationCt(b, n);
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		//System.out.println(combination(23, 2));
		System.out.println(solve());

	}

}
