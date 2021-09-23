import java.nio.channels.NonReadableChannelException;
import java.util.ArrayList;

import javax.management.monitor.GaugeMonitor;
import javax.naming.ldap.StartTlsRequest;
import javax.print.event.PrintEvent;
import javax.swing.text.StyledEditorKit;

import jdk.internal.net.http.common.SequentialScheduler.RestartableTask;

public class main {

    public static ArrayList<Integer> corners = new ArrayList<Integer>(); // a list of the corners, more efficient to use a list instead of calculating each loop

    // generate a list of n spiral corners
    public static void generateCorners(int n){
        for(int j = 0; j < n; j++){
            int res = 1;
            for(int i = 0; i < j; i++){
                res+=2+Math.ceil(i/4)*2;
            }
            corners.add(res);
        }
    }

    // generic primality check
    public static boolean isPrime(int n){
        if(n == 2 || n == 3) return true;
        if(n == 1 || n%2== 0 || n%3 == 0) return false;
        for(int i = 5; i <= Math.sqrt(n)+1; i++){
            if(n%i==0) return false;
        }

        return true;
    }

    // solve the problem
    public static int solve(double desiredRatio){
        int primes = 0;
        int nonprimes = 1; // start wil 1 nonprime to include 1
        int sideLength = 1;
        double ratio = 1;

        do{
            //sl 3: 1 to 4
            //sl 5: 5 to 8
            //sl 7: 9 to 12
            //from 2sl - 5 to 2sl - 2
            sideLength+=2;

            for(int i = 2*sideLength-5; i <= 2*sideLength-2; i++){ // 
                if(isPrime(corners.get(i))){
                    primes++;
                }else{
                    nonprimes++;
                }
            }
            ratio = (double)primes/(primes+nonprimes);
        }while(ratio >= desiredRatio);

        return sideLength; 
    }

    public static void main(String[] args) throws Exception {
        long start;
        long end;
        int cornerCount = 55000;

        start = System.currentTimeMillis();
        generateCorners(cornerCount);
        end = System.currentTimeMillis();
        System.out.println("Generated " + cornerCount + " corners in " + (end-start) + "ms");

        start = System.currentTimeMillis();
        System.out.println("Result: " + solve(0.1)); 
        end = System.currentTimeMillis(); 
        System.out.println("Solved the problem in " + (end-start) + "ms");
    }

/*  37 36 35 34 33 32 31
    38 17 16 15 14 13 30
    39 18  5  4  3 12 29
    40 19  6  1  2 11 28
    41 20  7  8  9 10 27
    42 21 22 23 24 25 26
    43 44 45 46 47 48 49
    
    3, 5, 7, 9, +2
    13, 17, 21, 25, +4
    31, 37, 43, 49 +6
    */

    // rewrite this keeping a running count of primes + sidelength - shorter and more efficient (probably lol)
    // also change the findnth... functon to % not for
}
