import java.math.BigInteger;

public class Main {
	
	public static void getFibIndex(int digits) {
		BigInteger n = new BigInteger("1");
		BigInteger o = new BigInteger("1");
		BigInteger t;
		int index = 2; // starting with 1 1
		
		do {
			t = n;
			n = o.add(n);
			o = t;
			index++;
		}while(n.toString().length() < digits);
		
		System.out.println("Index: " + index);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long s;
		long e;
		
		s = System.nanoTime();
		getFibIndex(1000);
		e = System.nanoTime();
		System.out.println((e-s)/1000000 + " ms");
	}

}
