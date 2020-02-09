
public class Main {
	public static boolean isPandigital(String s) {
		int[] uses = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				
		for(char c : s.toCharArray()) {
			uses[Character.getNumericValue(c)]++;
		}
		
		if(uses[0]!=0) return false;
		
		for(int n = 1; n < 10; n++) {
			if(uses[n]!=1) {
				return false; 
			}
		}
		
		return true;
	}
	
	public static int getPandigitalMultiple(int n) {
		String s = "";
		int index = 1;
		
		while(s.length() < 9) {
			s += Integer.toString(n*index);
			index++;
		}
		
		if(s.length() > 9) return 0;
		
		if(!isPandigital(s)) return 0; 
		
		return Integer.parseInt(s);
	}
	
	public static int getBiggestPandigitalMultiple(int b) {
		int biggest = 0;
		int val;
		
		for(int i = 1; i < b; i++) {
			val = getPandigitalMultiple(i);
			if(val > biggest) biggest = val;
		}
		
		return biggest; 
	}
	
	public static void main(String[] args) {
		System.out.println(getBiggestPandigitalMultiple(10000));

	}

}
