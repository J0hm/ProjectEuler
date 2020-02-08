
public class Main {
	
	public static boolean isEvenlyDivisible(int n, int d) {
		int wn = n;
		
		if((wn/d*d) == n) {
			return true;
		}else{
			return false;
		}
	}
	
	public static int smallestMultiple(int n) {
		int smallestMultiple = n;
		boolean candidate = true;
		boolean found = false;
		
		while(!found) {
			candidate = true;
			for(int i = 1; i <= n; i++) {
				if(!isEvenlyDivisible(smallestMultiple, i)) {
					candidate = false;
					break;
				}
			}
			
			if(candidate == true) {
				found = true;
			}else {
				smallestMultiple += n;
			}
			
			System.out.println(smallestMultiple);
		}
		
		
		return smallestMultiple;
	}
	
	public static void main(String[] args) {
		System.out.println(smallestMultiple(20));

	}

}
