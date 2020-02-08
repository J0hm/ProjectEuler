import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
	
	public static int setSolution(int bound) {
		BigInteger wnum;
		
		ArrayList<BigInteger> list = new ArrayList<BigInteger>();
		
		for(int a = 2; a <= bound; a++) {
			for(int b = 2; b <= bound; b++) {
				wnum = BigInteger.valueOf(a).pow(b);
				if(!list.contains(wnum)) {
					list.add(wnum);
				}
			}
		}
		
		return list.size();
	}
	
	public static void main(String[] args) {
		int num = 100;
		
		System.out.println(setSolution(num));
		
	}

}
