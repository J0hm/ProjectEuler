import java.math.BigInteger;

public class Main {
	
	public static String bigFactorial(int n) {
		BigInteger num = new BigInteger("1");
		
		for(int i = 2; i <= n; i++) {
			num = num.multiply(BigInteger.valueOf(i));
		}
		
		return num.toString();
	}
	
	public static int factorialDigitSum(int n) {
		int sum = 0;
		String facString = bigFactorial(n);
		
		for(int i = 0; i < facString.length(); i++) {
			sum+= Character.getNumericValue(facString.charAt(i));
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(factorialDigitSum(100));
	}

}
