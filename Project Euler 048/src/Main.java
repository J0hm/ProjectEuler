import java.math.BigInteger;

public class Main {
	
	public static long findLast10(int n) {
		long sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += (BigInteger.valueOf(i)).modPow(BigInteger.valueOf(i), BigInteger.valueOf(10000000000L)).longValue();
		}
		
		return sum%10000000000L;
	}
	
	public static void main(String[] args) {
		long now;
		long after; 
		now = System.nanoTime();
		System.out.println(findLast10(1000));
		after = System.nanoTime();
		
		System.out.println((after-now)/1000000 + "ms");
	}
		
}
