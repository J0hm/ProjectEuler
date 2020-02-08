
public class main {
	
	public static boolean isPrime(int n) {
		for(int i = 2; i < n/2; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		
		return true;
	}
		
	public static int findNPrime(int n) {
		int primeCt = 0;
		int num = 1;
		
		while(primeCt != n) {
			if(isPrime(num)) {
				primeCt++;
			}
			
			if(primeCt != n) {
				num += 2;
			}
		}
		
		return num;
		
	}
	
	public static void main(String[] args) {
		System.out.println(findNPrime(10001));

	}

}
