
public class Main {

	public static boolean containsSameDigits(int a, int b) {
		int[] aDigits = new int[10];
		int[] bDigits = new int[10];
		int wa = a;
		int wb = b;
		
		while(wa > 0) {
			aDigits[wa%10]++;
			wa/=10;
		}
		
		while(wb > 0) {
			bDigits[wb%10]++;
			wb/=10;
		}
		
		for(int i = 0; i < 10; i++) {
			if(aDigits[i] != bDigits[i]) return false;
		}
		
		return true;
	}
	
	
	public static long findFirstInt(int limit) {
		int ct = 1;
		boolean c = false;
		
		for(int i = 0; i < 1000000; i++) {
			c = false;
			for(int j = 2; j <= limit; j++) {
				if(!containsSameDigits(ct, ct*j)) {
					c = true;
					break;
				}
			}
			if(c == false) return ct;
			ct++;
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(findFirstInt(6));

	}

}
