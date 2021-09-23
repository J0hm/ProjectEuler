import java.math.BigInteger;

public class main {

    public static long powerDigitSum(int a, int b){
        BigInteger power = BigInteger.valueOf(a).pow(b);
        long res = 0;

        while(power.compareTo(BigInteger.ZERO) == 1){
            res+=power.mod(BigInteger.TEN).longValue();
            power = power.divide(BigInteger.TEN);
        }

        return res;
    }

    public static long findMaxDigitSum(int aLim, int bLim){
        long max = 0;
        long sum;
        
        for(int a = 1; a<100; a++){
            for(int b = 1; b<100; b++){
                sum = powerDigitSum(a, b);
                if(sum>max) max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Max sum is " + findMaxDigitSum(99, 99));
    }
}
