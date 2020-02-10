
public class Main {
	
	public static boolean isPrime(int n) {
		if(n == 2 || n == 3) return true;
		if(n == 1 || n%2 == 0 || n%3 == 0) return false;
		for(int i = 5; i <= Math.sqrt(n); i++) if(n%i == 0) return false; 
		return true;
	}
	
	public static boolean isSumPrimeSquare(int n) {
		int index = 1;
		int square = 1;
		
		do{
			square = index*index*2;
			
			if(n-square < 0) return false; 
			
			if(isPrime(n-(square))){
				return true;
			}
			
			index++;
		}while(n - square > 0);
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i = 1; i < 10000; i+=2) {
			if(!isPrime(i)) if(!isSumPrimeSquare(i)) System.out.println(i);
		}
		
		
	

}
