import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static ArrayList<String> out = new ArrayList<String>();
	
	public static void permutation(String s) {
		permutation("", s);
	}
	
	public static void permutation(String p, String s) {
		if(s.isEmpty()) {
			out.add(p+s);
		}else {
			for(int i = 0; i < s.length(); i++) {
				permutation(p + s.charAt(i), s.substring(0, i) + s.substring(i+1));
			}
		}
	}
	
	public static void main(String[] args) {
		long s;
		long e;
		
		s = System.nanoTime();
		permutation("0123456789");
		e = System.nanoTime();
		System.out.println((e-s)/1000000 + " ms");
		
		
		Collections.sort(out);
		
		System.out.println(out.get(999999));
		
	}

}
