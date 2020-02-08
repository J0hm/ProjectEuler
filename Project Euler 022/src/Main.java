import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main {
	
	public static int getStringVal(String s) {
		String c;
		int sum = 0;
		final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		s = s.toUpperCase();
		
		for(int i = 0; i < s.length(); i++) {
			c = s.substring(i, i+1);
			sum+= alphabet.indexOf(c) + 1;
		}
		
		return sum;
	}
	
	public static int getArrayVal(String[] array) {
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			sum += getStringVal(array[i]) * (i+1);
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		String[] nameArray = new String[0];
				
		try {
			Scanner in = new Scanner(new File("p022_names.txt"));
			nameArray = in.nextLine().split(",");
			Arrays.sort(nameArray);
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(getArrayVal(nameArray));
	}
}
