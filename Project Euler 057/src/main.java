import java.math.BigInteger;

public class main {

    // num,denom both start at 1 for expansion of sqrt 2
    // finds the nth expansion of num, denom following (p+2q)/(p+q) where p = num and q = denom. 
    public static Frac getNthExpansion(int n, BigInteger num, BigInteger denom){
        BigInteger nn = num.add(denom.multiply(BigInteger.TWO));
        BigInteger nd = num.add(denom);

        if(n == 0) return new Frac(num, denom);

        return getNthExpansion(n-1, nn, nd);
    }

    // get the numner of digits in a BigInteger
    public static long getDigits(BigInteger n){
        int count = 0;
        while(!n.equals(BigInteger.ZERO)){
            n = n.divide(BigInteger.TEN);
            count++;
        }
        return count;
    }

    // oops gotta convert everything to big int!
    public static void main(String[] args) throws Exception {
        // for p/2, next = (p+2q)/(p+q)
        int count = 0;
        int lim = 1000; 

        for(int i = 0; i <= lim; i++){
            Frac f = getNthExpansion(i, BigInteger.ONE, BigInteger.ONE);
            if(getDigits(f.n) > getDigits(f.d)) count++;
        }

        System.out.println(count);
    }
}
