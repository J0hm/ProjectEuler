
public class Main {
	
	
	public static boolean isAbundantNumber(int n) {
		int factorSum = 0;
		
		for(int i = 1; i <= n/2; i++) {
			if(n%i==0) factorSum += i;
		}
		
		return factorSum > n ? true : false;
	}
	
	
	public static boolean isSumOfAbundant(int n) {
		for(int i = 12; i <= n/2; i++) { //start at first abundant num, only need to check to n/2 because checking inverses
			if(isAbundantNumber(i) && isAbundantNumber(n-i)) return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int n = 28123;
		int sum = 0;
		
		for(int i = 0; i <= n; i++) {
			if(!isSumOfAbundant(i)) sum+= i;
			
			if(i%100 == 0) System.out.println(i);
		}
		
		System.out.println(sum);

	}

}
