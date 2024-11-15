import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        int num = in.nextInt();
        int fact = 1;
        for(int i=1; i<=num; i++) {
            fact *= i;
        }
        System.out.println("Factorial: "+ fact);
    }
}
