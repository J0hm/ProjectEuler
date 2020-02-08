import java.util.ArrayList;

public class Main {

	public static int waysToMake(int[] S, int n, int p) {
		int including, excluding;
		
		if(p == 0) { 
			return 1;
		}
		
		if(p < 0 || n < 0) {
			return 0;
		}
		
		including = waysToMake(S, n, p - S[n]);
		excluding = waysToMake(S, n-1, p);
		
		return including + excluding;
	}
	
	public static boolean isPrime(int n) {
		
		if(n == 2 || n == 3) return true;
		
		if(n%2 == 0 || n%3 == 0 || n == 1) {
			
			return false;
		}
		
		for(int i = 5; i <= Math.sqrt(n); i++) {
			if(n%i==0) return false;
		}
		
		return true;
	}
	
	public static int[] genPrimeList(int bound) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] arr;
		
		list.add(2);
		
		for(int i = 1; i < bound; i+=2) {
			if(isPrime(i)) list.add(i);
		}
		
		
		
		arr = new int[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		int[] S = genPrimeList(100000);
		int index = 1;
		int ways;
		
		//System.out.println(waysToMake(S, S.length-1, 10));
		System.out.println(S[S.length-1]);
		
		while(index < 100) {
			ways = waysToMake(S, S.length-1, index);
			System.out.println(index + ", " + ways);
			if(ways >= 5000) {
				System.out.println("Num: " + index + " Ways: " + ways);
				break;
			}
			index++;
		}
		
		
	}

}
