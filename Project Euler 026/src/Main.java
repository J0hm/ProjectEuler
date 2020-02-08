public class Main {
	
	public static int findCycleLength(int d){
		int n = 1; // numerator, always one in this case 
		int x = n*9;
		int y = x;
		int length = 1;
		String decString = Double.toString(1.0/d).substring(2);
		
		if(decString.length() < 16) {
			return 0;
		}else if(decString.substring(2,3).equals(decString.substring(3,4))) {
			return 1;
		}
		
		while(!(y%d==0)) {
			y = y*10+x;
			length++;
		}
		
		return length;
	}
	
	public static int getPeriod(int n) {
	    int rem = 1; 
	    for (int i = 1; i <= n + 1; i++) {
	    	rem = (10 * rem) % n; 
	    }
	      
	    int d = rem; 
	  
	    int count = 0; 
	    do { 
	    	rem = (10 * rem) % n; 
	        count++; 
	    } while(rem != d); 
	      
	    return count; 
	} 
	public static int findLargestD(int dLim){
		int longest = 0;
		int length;
		int dVal = 0;

		for(int d = 1; d < dLim; d++){
			length = getPeriod(d);
			if(length > longest) {
				longest = length;
				dVal = d;
			}
		}

		return dVal;
	}
	
	public static void main(String[] args) {
		System.out.println(findLargestD(1000));
	}

}
