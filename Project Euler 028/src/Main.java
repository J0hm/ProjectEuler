
public class Main {
	
	public static int sumDiagonals(int r) { // r = radius, ex. a 5x5 r = 2, 1001x1001 r = 500
		int sum = 1; // middle number
		int lastNum = 1;
		
		for(int i = 1; i <= r; i++) {
			sum += 20*i + 4*lastNum;
			lastNum += 8*i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumDiagonals(500));

	}

}

/*
44 45 46 47 48 49 50
43 21 22 23 24 25 26
42 20  7  8  9 10 27
41 19  6  1  2 11 28
40 18  5  4  3 12 29
39 17 16 15 14 13 30
38 37 36 35 34 33 31
*/

// 10 * toAdd + 4(last) for each layer, toAdd = 2i