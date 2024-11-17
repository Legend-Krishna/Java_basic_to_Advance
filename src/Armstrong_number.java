import java.util.Scanner;

public class Armstrong_number {

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
            result += (int) Math.pow(remainder, n);
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
