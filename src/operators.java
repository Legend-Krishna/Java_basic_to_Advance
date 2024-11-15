//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.*;
public class operators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers and operation you want to perform: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Enter 1 for add , 2 for sub , 3 for mul and 4 for div");
        int op = in.nextInt();
        if (op == 1)
        {
            int sum = a+b;
            System.out.println("Sum is :" + sum);
        }
        else if (op == 2) {
            int dif = a-b;
            System.out.println("Difference is :" + dif);
        }
        else if (op == 3) {
            int mul = a*b;
            System.out.println("Multiplication is : " + mul);
        }
        else if (op == 4) {
         float div = (float) a/b;
            System.out.println("Division is :" + div);
        }
        else
        {
            System.out.println("Invalid input");
        }

    }

}
