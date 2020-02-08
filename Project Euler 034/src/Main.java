class Main {

	public static int factorial(int n){
		if(n == 1 || n == 0) return 1; 
		return n*factorial(n-1);
	}

	public static boolean isFactorialDigitSum(int n){
		int sum = 0;
		int wn = n;

		while(wn > 0){
			sum += factorial(wn%10);
			wn /= 10;
		}

		return sum == n; 
	}

	public static int sumDigitFactiorials(int b){
		int sum = 0; 

		for(int i = 10; i < b; i++){
			if(isFactorialDigitSum(i)) sum += i;
		}

		return sum; 
	}

  public static void main(String[] args) {
    System.out.println(sumDigitFactiorials(100000));
  }
}