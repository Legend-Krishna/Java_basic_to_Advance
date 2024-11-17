// Write a program that reads a set of integers,and then prints the sum of the
// even and odd integers.

import java.util.Scanner;

public class Even_Odd_SUM {
    public static void sum() {
        int odd_sum = 0;
        int even_sum = 0;
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int n = in.nextInt();

        do {
            if (n % 2 == 0) {
                even_sum += n;
            } else {
                odd_sum += n;
            }
            System.out.print("Enter the numbers: ");
            n = in.nextInt();
            System.out.print("Enter 1 to continue and 0 for exit: ");
            choice = in.nextInt();

        } while (choice == 1);
        System.out.println("sum of even numbers is : "+even_sum);
        System.out.println("sum of odd numbers is : "+odd_sum);

    }
    public static void main(String[] args) {
        sum();


    }
}
