import java.math.BigInteger;

public class Main {
	
	public static long powerDigitSum(int n, int power) {
		long sum = 0;
		BigInteger num = BigInteger.valueOf(n).pow(power);
		String numStr = num.toString();
		
		for(int i = 0; i < numStr.length(); i++) {
			sum += Character.getNumericValue(numStr.charAt(i));
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(powerDigitSum(2, 1000));

	}

}
