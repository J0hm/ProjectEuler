
public class Main {
	
	public static boolean isPrime(int n) {
	    if(n < 2) return false;
	    if(n == 2 || n == 3) return true;
	    if(n%2 == 0 || n%3 == 0) return false;
	    int rtN = (int)Math.sqrt(n)+1;
	    for(int i = 6; i <= rtN; i += 6) {
	        if(n%(i-1) == 0 || n%(i+1) == 0) return false;
	    }
	    return true;
	}
	
	public static int findPrimeStreak(int a, int b) {
		int streak = 0;
		int n = 0;
		
		while(true) {
			if(isPrime((int)(Math.pow(n, 2) + (a*n) + b))) {
				streak++;
				n++;
			}else {
				break;
			}
		}
		
		return streak;
	}
	
	public static void findBestCoeffs(int aBound, int bBound) {
		int bestA = 0;
		int bestB = 0;
		int highestPrimeStreak = 0;
		int primeStreak;
		
		for(int a = -1*aBound; a <= aBound; a++) {
			for(int b = -1*bBound; b <= bBound; b++) {
				primeStreak = findPrimeStreak(a, b);
				if(primeStreak > highestPrimeStreak) {
					bestA = a;
					bestB = b;
					highestPrimeStreak = primeStreak;
				}
			}
		}
		
		System.out.println("A:" + bestA + " B:" + bestB + " Streak:" + highestPrimeStreak + " Product:" + bestA*bestB);
	}
	
	public static void main(String[] args) {
		findBestCoeffs(1000,1000);
	}

}
