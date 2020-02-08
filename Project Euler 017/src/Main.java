
public class Main {

	public static final String[] tensNames = {
			"",
			"ten",
			"twenty",
			"thirty",
			"forty",
			"fifty",
			"sixty",
			"seventy",
			"eighty",
			"ninety"
	};
	
	public static final String[] numNames = {
			"",
			"one",
			"two",
			"three",
			"four",
			"five",
			"six",
			"seven",
			"eight",
			"nine",
			"ten", 
			"eleven",
			"twelve",
			"thirteen",
			"fourteen",
			"fifteen",
			"sixteen",
			"seventeen",
			"eighteen",
			"nineteen"
	};
	
	public static String numToWord(int n) {
		String numInWords = "";
		int digit;
		
		if(n % 100 < 20) {
			for(int i = 0; i < 20; i ++) {
				if(n % 100 == i) {
					numInWords += numNames[i];
				}
			}
		}else {
			digit = n%10;
			for(int i = 0; i < 10; i++) {
				if(digit == i) {
					numInWords += numNames[i];
				}
			}
			
			digit = (n/10) % 10;
			for(int i = 0; i < 10; i++) {
				if(digit == i) {
					numInWords = tensNames[i] + " " + numInWords;
				}
			}
		}
		
		if(n/100 > 0 && n/100 < 10) {
			digit = (n/100)%10;
			
			for(int i = 0; i < 10; i++) {
				if(digit == i) {
					if(n%100 == 0) {
						numInWords = numNames[i] +" hundred";
					}else {
						numInWords = numNames[i] +" hundred and "+ numInWords;
					}
				}
			}
			
		}
		
		if(n/1000 > 0 && n/1000 < 10) {
			digit = (n/1000)%10;
			
			for(int i = 0; i < 10; i++) {
				if(digit == i) {
					if(n%1000 == 0) {
						numInWords = numNames[i] +" thousand";
					}else {
						numInWords = numNames[i] +" thousand "+ numInWords;
					}
				}
			}
		}
		
		return numInWords;
	}
	
	public static int sumNumWord(int n) {
		int sum = 0;
		String[] numWords;
		
		for(int i = 1; i <= n; i++) {
			numWords = numToWord(i).trim().split(" ");
			System.out.println(numToWord(i).trim());
			
			for(String s : numWords) {
				sum+= s.trim().length();
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumNumWord(1000));
		
	}

}
