
public class Main {

	public static int pythagoreanTripletProduct(int sum) {
		
		for(int c = 0; c < sum; c++) {
			for(int b = 0; b < c; b++) {
				for(int a = 0; a < b; a++) {
					if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) && a+b+c == sum) {
						System.out.println(a + "*" + b + "*" + c);
						return a*b*c;
					}
				}
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(pythagoreanTripletProduct(1000));

	}

}
