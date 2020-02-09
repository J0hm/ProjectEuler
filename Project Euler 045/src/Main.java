import java.math.BigInteger;

public class Main {
	
	public static boolean isPentagonal(long n) {
		double i = (1+Math.sqrt(24*n+1))/6;
		
		return i - Math.floor(i) == 0;
	}
	
	public static boolean isHexagonal(long n) {
		// n = i(2i-1)
		// 
		double i = (1+Math.sqrt(1+(8*n)))/4;
		return i - Math.floor(i) == 0; 
	}
	
	public static long findTriplet(long index) {
		long triangle = (index * (index+1))/2;
		
		while(!(isHexagonal(triangle) && isPentagonal(triangle))) {
			index++;
			triangle = (index * (index+1))/2;
		}
		
		return triangle;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findTriplet(300));
	}

}
