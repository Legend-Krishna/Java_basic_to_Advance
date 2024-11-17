package intermediate_programs;

import java.util.Scanner;

public class Sum_Of_N_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int choice;
        do {
            System.out.println("Enter the number: ");
            int input = in.nextInt();
            sum = sum + input;
            System.out.println("Enter 1 to continue and 0 to exit");
            choice = in.nextInt();
        }while (choice==1);
        System.out.println("Sum is : "+sum);
    }
}
