import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a Number");
        int number = scanner.nextInt();
        sumOfNumbers(number);
        gaussianSumOfNumbers(number);
    }
    
    static int sumOfNumbers(int n) {
        long startTime = System.nanoTime();
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            answer = answer + i;


        }
        System.out.println("Answer is "+ answer);
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        double seconds = (double)totalTime / 1000000000.0;
        System.out.println("I have fat fingers "+(seconds));
        return answer;
    }
    
    // for Extra Credit
    static int gaussianSumOfNumbers(int n) {
        long startTime = System.nanoTime();
        int answer = (n / 2) * (n + 1);
        System.out.println("Gaussian answer is "+ answer);
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        double seconds = (double)totalTime / 1000000000.0;
        System.out.println("I have fat fingers "+(seconds));
        return answer;
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    
}
