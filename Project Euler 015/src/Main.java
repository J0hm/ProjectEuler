import java.math.BigInteger;

public class Main {
	
	public static BigInteger nFactorial(int n) {
		BigInteger product =  new BigInteger("1");
		
		for(long i = 1; i <= n; i++) {
			product = product.multiply(BigInteger.valueOf(i));
		}
		
		return product; 
	}
	
	public static long latticePathCount(int n) {
		BigInteger num = nFactorial(2*n);
		BigInteger denom = nFactorial(n);
		denom = denom.pow(2);
		
		return num.divide(denom).longValue();
	}
	
	public static void main(String[] args) {
		System.out.println(latticePathCount(20));

	}

}
