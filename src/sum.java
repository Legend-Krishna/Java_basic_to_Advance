//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers and 0 to stop: ");
        int a = in.nextInt();
        int sum = 0;
        while(a!=0)
        {
             sum += a;
             a = in.nextInt();
        }
        System.out.println(sum);
    }
}
