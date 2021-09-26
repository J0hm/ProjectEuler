import java.util.regex.*;

public class main {
    public static Pattern pattern = Pattern.compile("1\\d2\\d3\\d4\\d5\\d6\\d7\\d8\\d9\\d0", Pattern.CASE_INSENSITIVE);


    public static boolean isConcealedNumber(long n){
        String s = Long.toString(n);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public static void solve(){
        long n;
        for(long i = (long) Math.sqrt(102030405060708090L); i <= (long) Math.sqrt(192939495969798990L); i++){
            n = (long) Math.pow(i, 2);
            if(isConcealedNumber(n)){
                System.out.println(n);
                break;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        solve();
    }
}
