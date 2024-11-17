package intermediate_programs;

import java.util.Scanner;

public class Power_IN_JAVA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = in.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = in.nextDouble();
        double result = Math.pow(base,exponent);
        System.out.print(result);
         in.close();
    }
}
