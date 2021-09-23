public class main {
    
    // getDigits : long n --> long digits
    // returns the number of digits in n
    public static int getDigits(double n){
        int digits = 0;
        
        if(n==0) return 1;

        while(n > 0){
            n/=10;
            digits++;
        }

        return digits;
    }

    public static boolean isNDigitPower(long n){
        double base = Math.pow(Math.E, (Math.log(n)/getDigits(n)));
        System.out.println (base + "^" + getDigits(n) + "=" + Math.pow(base, getDigits(n)));

        if((int) base == base) return true;
        return false; 
    }

    public static void main(String[] args) {
        System.out.println(isNDigitPower(16807));
    }
}
