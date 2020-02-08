import java.util.ArrayList;

public class Main {
	
	public static boolean isPandigital(String s) {
		int[] uses = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				
		for(char c : s.toCharArray()) {
			uses[Character.getNumericValue(c)]++;
		}
		
		if(uses[0]!=0) return false;
		
		for(int n = 1; n < 10; n++) {
			if(uses[n]!=1) {
				return false; 
			}
		}
		
		return true;
	}
	
	public static boolean isPandigitalProduct(int a, int b) {
		String s = a + "" + b + "" + a*b;
		return isPandigital(s);
	}
	
	public static int sumPandigitalProducts(int ab, int bb) {
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int a = 0; a < ab; a++) {
			for(int b = 0; b < bb; b++) {
				if(isPandigitalProduct(a, b) && !list.contains(a*b)) list.add(a*b);
			}
		}
		
		for(int n : list) {
			System.out.println(n);
			sum+=n;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("Sum: " + sumPandigitalProducts(2000, 2000));

	}

}
