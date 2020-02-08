import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static String first10DigitSumBigInt(String[] numList) {
		BigInteger sum = new BigInteger("0");
		
		for(int i = 0; i < numList.length; i++) {
			sum = sum.add(new BigInteger(numList[i]));
		}
		
		return sum.toString().substring(0, 10);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] numList = new String[100];
		
		for(int i = 0; i < 100; i++) {
			numList[i] = s.nextLine().trim();
		}
		s.close();
		System.out.println(first10DigitSumBigInt(numList));

	}

}
