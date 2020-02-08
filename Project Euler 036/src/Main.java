class Main {
	public static boolean isPalindrome(String s){
		for(int i = 0; i < s.length()/2; i++){
			if(s.charAt(i) != s.charAt(s.length()-i-1)) return false; 
		}
		return true;
	}

	public static boolean isDoubleBasePalindrome(int n){
		return (isPalindrome(Integer.toString(n)) && isPalindrome(Integer.toBinaryString(n)));
	}

	public static int sumDoublePalindromes(int b){
		int sum = 0;

		for(int i = 0; i <= b; i++){
			if(isDoubleBasePalindrome(i)) sum+=i;
		}

		return sum;
	}

  public static void main(String[] args) {
    System.out.println(sumDoublePalindromes(1000000));
  }
}