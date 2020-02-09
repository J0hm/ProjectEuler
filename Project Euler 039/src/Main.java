
public class Main {
	
	public static double findC(int a, int b) {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}
	
	public static int findSolutionCount(int p) {
		double c;
		int ct = 0;
		for(int a = 1; a < p; a++) {
			for(int b = 1; b < p; b++) {
				c = findC(a, b);
				if(a+b+c == p && (int)c == c) {
					ct++;
				}
			}
		}
		return ct/2;
	}
	
	public static int findOptimalP(int b) {
		int max = 0;
		int p = 0;
		int ct;
		
		for(int i = 1; i <= b; i++) {
			ct = findSolutionCount(i);
			if(ct > max) {
				max = ct;
				p = i;
			}
		}
		
		return p;
	}
	
	public static void main(String[] args) {
		System.out.println(findOptimalP(1000));
	}

}
