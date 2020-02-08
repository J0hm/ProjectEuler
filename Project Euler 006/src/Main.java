
public class Main {
	
	public static int sumSquareDifference(int n) {
		int sumSquare = 0;
		int squareSum = 0;
		
		for(int i = 0; i <= n; i++) {
			sumSquare += Math.pow(i, 2);
		}
		
		for(int i = 0; i <= n; i++) {
			squareSum += i;
		}
		
		squareSum *= squareSum;
		
		
		
		return squareSum - sumSquare;
	}
	
	public static void main(String[] args) {
		System.out.println(sumSquareDifference(100));

	}

}
