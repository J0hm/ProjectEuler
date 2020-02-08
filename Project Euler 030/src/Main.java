
public class Main {
	
	public static boolean isFifthPowerSum(int n) {
		int sum = 0; 
		int wn = n;
		
		while(wn > 0) {
			sum+= Math.pow(wn%10, 5);
			wn /= 10;
		}
		
		return (sum == n) ? true : false;
	}
	
	public static int sum5thPowers(int bound) {
		int sum = 0;
		
		for(int i = 2; i < bound; i++) {
			if(isFifthPowerSum(i)) {
				sum+=i;
				System.out.print(i + " ");
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("\n"+sum5thPowers(200000));

	}

}
