import java.io.File;
import java.util.Scanner;

public class Main {
	
	public static String[] loadWords(String file) {
		String[] arr = {};
		Scanner s; 
		try {
			s = new Scanner(new File(file));
			arr = s.nextLine().split(",");
			s.close();
			for(int i = 0; i < arr.length; i++) { // remove "'s
				arr[i] = arr[i].substring(1, arr[i].length()-1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		
		
		return arr;
	}
	
	public static int findWordSum(String s) {
		int sum = 0;
		int aVal = Character.valueOf('A');
		
		for(char c : s.toCharArray()) {
			sum+= Character.valueOf(c) - aVal + 1;
		}
		
		return sum;
	}
	
	
	public static boolean isTriangleWord(String s) {
		int triangle = 1; 
		int index = 1;
		int wordSum = findWordSum(s);
		
		while(triangle < wordSum) {
			triangle = (int)(index/2.0 * (index+1));
			index++;
		}
		
		return triangle == wordSum;
	}
	
	public static void main(String[] args) {
		String[] arr = loadWords("p042_words.txt");
		int ct = 0;
		
		for(String s : arr) if(isTriangleWord(s)) ct++;

		System.out.println(ct);
	}
}
