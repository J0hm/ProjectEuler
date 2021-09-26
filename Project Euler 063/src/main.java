public class main {

    public static void solve(){
        int result = 0;
        int lower = 0;
        int n = 1;
 
        while (lower < 10) {
            lower = (int)Math.ceil(Math.pow(10, (n-1.0)/n));
            result += 10 - lower;
                n++;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        solve();
    }
}
