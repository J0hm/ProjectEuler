
public class Main {
	public static int collatzLength(int num) {
		long n = num;
		int length = 1;
		
		while(n != 1) {
			if(n%2==0) {
				n/=2;
			}else {
				n = 3*n+1;
			}
			
			length++;
		}
		
		return length;
	}
	
	public static int longestChain(int bound) {
		int longest = 0;
		int length;
		int startNum = 0;
		
		for(int i = 1; i < bound; i++) {
			length = collatzLength(i);
			if(length > longest) {
				longest = length;
				startNum = i;
				System.out.println(startNum + ": " + longest);
			}
		}
		
		return startNum;
	}
	
	public static void main(String[] args) {
		System.out.println(longestChain(1000000));

	}

}
