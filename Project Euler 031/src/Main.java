
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
	
	public static void main(String[] args) {
		int[] S = {2, 3, 5, 7, 11, 13};
		System.out.println(waysToMake(S, S.length-1, 10));
	}

}
