////To find Armstrong Number between two given number.
//import java.util.*;
//class check {
//    public static boolean armstrong(int num) {
//        int rem, n = 0, result = 0, original_num;
//        original_num = num;
//
//        // Find the number of digits in the number
//        while (original_num != 0) {
//            original_num /= 10;
//            ++n;
//        }
//// Calculate the sum of the digits each raised to the power of the number of digits
//        while (original_num != 0) {
//            rem = original_num % 10;
//            result += Math.pow(rem, n);
//            original_num /= 10;
//
//        }
//        return result == num;
//
//    }
//}
//
//
//
//public class Armstron_number extends check {
//        public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//            System.out.print("Enter the numbers: ");
//            int a = in.nextInt();
//            int b = in.nextInt();
//            for (int i = a; i <= b; i++) {
//                if (armstrong(i)) {
//                    System.out.println(i);
//                }
//            }
//
//
//        }
//    }

import java.util.Scanner;

public class Armstron_number {

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum, remainder, result = 0, n = 0;

        originalNum = num;

        // Find the number of digits in the number
        while (originalNum != 0) {
            originalNum /= 10;
            ++n;
        }

        originalNum = num;

        // Calculate the sum of the digits each raised to the power of the number of digits
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }

        // Return true if the result is equal to the original number
        return result == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the range
        System.out.print("Enter the lower bound: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Enter the upper bound: ");
        int upperBound = scanner.nextInt();

        System.out.println("Armstrong numbers between " + lowerBound + " and " + upperBound + " are:");

        // Iterate through the range and check for Armstrong numbers
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
