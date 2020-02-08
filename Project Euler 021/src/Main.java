
public class Main {

	public static int sumDivisors(int n) { // O(n/2)
		int sum = 0;
		
		for(int i = 1; i <= n/2; i++) {
			if(n%i == 0) sum+= i;
		}
		
		return sum;
	}
	
	
	public static boolean isAmicableNumber(int n) {
		int divisorSum = sumDivisors(n);
		
		if(sumDivisors(divisorSum) == n && divisorSum != n) {
			return true;
		}
		return false;
	}
	
	public static int sumAmicableNumbers(int bound) {
		int sum = 0;
		for(int i = 0; i < bound; i++) {
			if(isAmicableNumber(i)) sum+= i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumAmicableNumbers(10000));

	}

}
