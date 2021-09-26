public class main {

    // returns the sum of the squares of the digits in n
    public static int sumDigitSquares(int n){
        int sum = 0;

        while(n!=0){
            sum+=Math.pow(n%10, 2.0);
            n/=10; 
        }

        return sum;
    }

    // returns true if the square digit chain starting at n ends in 89
    public static boolean endAt89(int n){
        if(n==1 || n==89){
            return n==89 ? true : false;
        }

        return endAt89(sumDigitSquares(n)); 
    }

    public static void solve(int limit){
        int count = 0;
        long start, end;

        start = System.currentTimeMillis();
        for(int i = 1; i < limit; i++){
            if(endAt89(i)) count++;
        }
        end = System.currentTimeMillis();

        System.out.println("Found " + count + " chains ending with 89 under " + limit + " in " + (end-start) + "ms.");
    }
    public static void main(String[] args) throws Exception {
        solve(10000000);
    }
}
