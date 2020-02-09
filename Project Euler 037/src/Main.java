
public class Main {

	public static boolean isLeftTruncatable(int n) {
		String s = Integer.toString(n);
		int len = s.length();
		
		for(int i = 0; i < len; i++) {
			//System.out.println(Integer.parseInt(s));
			if(!isPrime(Integer.parseInt(s))) return false; 
			s = s.substring(1);
		}
		
		return true; 
	}
	
	public static boolean isRightTruncatable(int n) {
		String s = Integer.toString(n);
		int len = s.length();
		
		for(int i = 0; i < len; i++) {
			//System.out.println(Integer.parseInt(s));
			if(!isPrime(Integer.parseInt(s))) return false; 
			s = s.substring(0, s.length()-1);
		}
		
		
		return true;
	}
	
	
	public static boolean isPrime(int n) {
		if(n == 2 || n == 3) return true;
		if(n == 1 || n%2 == 0 || n%3 == 0) return false; 
		for(int i = 5; i < Math.sqrt(n+1); i+= 2) if(n%i == 0) return false;
		return true;
	}
	
	public static void findDoubleTruncatable(int b) {
		int sum = 0;
		for(int i  = 11; i < b; i+=2) {
			if(isRightTruncatable(i) && isLeftTruncatable(i)) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("Sum: " + sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findDoubleTruncatable(1000000);
		//System.out.println(isLeftTruncatable(739397));
	}

}
