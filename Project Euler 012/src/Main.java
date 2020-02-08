
public class Main {

	public static int countFactors(int n){
		int factors = 0; // start at 1 for itself
		
		for(int i = 1; i < Math.sqrt(n); i++) {
			if(n%i==0) {
				if(n/i==i) {
					factors++;
				}else {
					factors+=2;
				}
			}
		}
		
		return factors;
	}
	
	public static int findNDivisorTriangle(int n) {
		int triNum = 1;
		int ct = 2;
		int factors;
		int greatestFactors = 0;
		
		while(true) {
			factors = countFactors(triNum);
			if(factors>greatestFactors) {
				greatestFactors = factors;
				System.out.println(greatestFactors);
			}
			
			if(factors>=n) {
				break;
			}else {
				triNum+=ct;
				ct++;
			}
			
		}
		
		return triNum;
	}
	
	public static void main(String[] args) {
		//System.out.println(countFactors(28));
		System.out.println(findNDivisorTriangle(500));
	}

}
