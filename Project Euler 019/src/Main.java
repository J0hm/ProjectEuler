
public class Main {

	public static int dayOfWeek(int d, int m, int y) 
	{ 
	    int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 }; 
	    y -= (m < 3) ? 1 : 0; 
	    return ( y + y/4 - y/100 + y/400 + t[m-1] + d) % 7; 
	} 
	
	public static void main(String[] args) {
		int sundays = 0;
		
		for(int y = 1901; y <= 1999; y++) {
			for(int m = 1; m <= 12; m++){
				if(dayOfWeek(1, m, y) == 1) {
					sundays++;
				}
			}
		}
		
		System.out.println(sundays);

	}

}
