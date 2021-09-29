import java.math.BigInteger;
import java.util.regex.*;

public class main {
    public static Pattern pattern = Pattern.compile("1\\d2\\d3\\d4\\d5\\d6\\d7\\d8\\d9", Pattern.CASE_INSENSITIVE);


    public static boolean isConcealedNumber(long n){
        String s = Long.toString(n);
        //System.out.println(s);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public static void solve(){
        long n = 138902663; //Math.sqrt(19293949596979899), our upper limit
        
        while(!isConcealedNumber(n*n)){
            n -= 2;
        }

        System.out.println(n*10); // result is n*10 because of analysis done to make domain smaller
    }

    public static void main(String[] args) throws Exception {
        solve();
        
    }
}
