import java.util.ArrayList;

public class main {
    public static ArrayList<Integer> primes = new ArrayList<Integer>(); // declar list of prime numbers

    // returns whether or not an integer is prime 
    // fairly efficient, O(n)
    public static boolean isPrime(long n){
        if(n==2) return true;

        if(n <= 1 || n%2 == 0) return false;
        
        for(int i = 3; i <= Math.sqrt(n); i+=2){ 
            if(n%i == 0) return false;
        }
       
        return true;
    }


    // returns an arraylist with all primes under n
    public static void listPrimesBelowN(int n){
       
        
        // edge cases not under 6k+-1 rule
        if(n>=2) primes.add(2);
        if(n>=3) primes.add(3);
        
        // all primes besides those above follow this rule
        for(int k = 6; k<=n; k+=6){
            if(isPrime(k+1)) primes.add(k+1);
            if(isPrime(k-1)) primes.add(k-1);
        }
    }


    // finds consecutive prime sum primes starting at n
    public static long findLargestConsecPrimeSum(int lim){
        int mostConsecCount = 0;
        long mostConsecNum = 0;
        int consecCount = 0;
        long sum = 0; 

        for(int s = 0; s < primes.size(); s++){ // s is the starting number
            consecCount = 0;
            sum = 0;
            for(int i = s; i < primes.size(); i++){
                consecCount++; 
                sum += primes.get(i);

                if(sum > lim){
                    break;
                }else if(isPrime(sum)){
                    if(consecCount > mostConsecCount){
                        mostConsecCount = consecCount;
                        mostConsecNum = sum;

                        System.out.println(mostConsecNum + " with sum length " + mostConsecCount);
                    } 
                }
            }
        }

        return mostConsecNum;
    }



    public static void main(String[] args) throws Exception {
        long startTime; 
        long endTime;
        int lim = 1000000;
        
        startTime = System.currentTimeMillis();

        listPrimesBelowN(lim);

        System.out.println(findLargestConsecPrimeSum(lim));

        endTime = System.currentTimeMillis();
        System.out.println("Program took " + (endTime-startTime) + "ms to run!");
    }
}
