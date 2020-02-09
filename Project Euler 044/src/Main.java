import java.util.ArrayList;

public class Main {
	
	static ArrayList<Integer> pents = genPentagonalList(10000);
	
	public static ArrayList<Integer> genPentagonalList(int n) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 1; i <= n; i++) {
			arr.add(i * (3*i-1)/2);
		}
		
		System.out.println("Pentagonal number list generated!");
		return arr;
	}
	
	public static boolean isPentagonalNumber(int n) {
		return pents.contains(n) ;
	}
	
	public static boolean isPentagonalPair(int a, int b) {
		int sum = a+b;
		int difference = Math.abs(a-b);
		
		return isPentagonalNumber(sum) && isPentagonalNumber(difference);
	}
	
	public static int findMinimalPair(int bound) {
		int minD = Integer.MAX_VALUE;
		int diff;
		
		for(int a = 1; a < bound; a++) {
			for(int b = 1; b < bound; b++) {
				if(isPentagonalPair(pents.get(a), pents.get(b))){
					diff = Math.abs(pents.get(a)-pents.get(b));
					if(diff < minD) minD = diff;
					System.out.println(pents.get(a) + "," + pents.get(b));
				}
			}
		}
		
		return minD;
	}
	
	public static void main(String[] args) {
		System.out.println(findMinimalPair(2500));
	}

}
