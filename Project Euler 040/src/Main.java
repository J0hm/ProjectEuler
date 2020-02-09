
public class Main {
	
	public static int findDigit(int d) {
		String s = "";
		int index = 1;
		int digits = 0;
		
		while(digits < d) {
			s = Integer.toString(index);
			
			digits += s.length();

			index++;
			
			System.out.println(s + ":" + digits);
			
		}
		
		
		return Character.getNumericValue(s.charAt(digits-d-s.length()+1));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		// 1 * 1 * 5 * 3 * 7 * 2
		System.out.println(findDigit(1000000));
	}

}
