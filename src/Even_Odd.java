import java.util.*;
//Write a program to print whether a number is even or odd, also take input from the user.
public class Even_Odd {
    public static void main(String[] args) {
        System.out.print("Enter the number you want to check: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if ( num % 2 == 0)
        {
            System.out.println(num + " is even");
        }
        else
        {
            System.out.println(num + "  is odd");
        }
    }
}
