
public class Main {

	public static boolean isDigitCancellingFraction(int num, int dem) {
		String n = Integer.toString(num);
		String d = Integer.toString(dem);
		int index;
		
		if(n.substring(1).equals("0") && d.substring(1).equals("0")) return false; 
		
		if(d.contains(n.substring(0,1))) {
			index = d.indexOf(n.substring(0,1));
			n = n.substring(1);
			d = (index == 0) ? d.substring(1) : d.substring(0, 1);
			return Double.parseDouble(n)/Double.parseDouble(d) == (double)num/dem;
		}else if(d.contains(n.substring(1))) {
			index = d.indexOf(n.substring(1));
			n = n.substring(0, 1);
			d = (index == 0) ? d.substring(1) : d.substring(0, 1);
			return Double.parseDouble(n)/Double.parseDouble(d) == (double)num/dem;
		}
		
		return false;
	}
	
	public static void printResults() {
		int num = 1;
		int dem = 1;
		for(int d = 11; d < 100; d++) {
			for(int n = 10; n < d; n++) {
				if(isDigitCancellingFraction(n, d)) {
					System.out.println(n + "/" + d);
					num*=n;
					dem*=d;
				}
			}
		}
		
		System.out.println("Product: " + num + "/" + dem);
	}
	
	public static void main(String[] args) {
		printResults();
	}

}
