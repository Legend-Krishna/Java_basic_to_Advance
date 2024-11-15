//To calculate Fibonacci Series up to n numbers.
import java.util.*;

public class Fibonacci_Series {
    public static void main(String[] args) {
        int first = 0;
        int sec = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number till you want fibonacci series: ");
        int n = in.nextInt();
        for (int i = 1; i < n; i++) {
            int fib = first + sec;
            first = sec;
            sec = fib;
            System.out.println("Fibonacci series is: " + fib);
        }
    }
}
