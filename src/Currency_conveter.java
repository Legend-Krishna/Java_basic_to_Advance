//Input currency in rupees and output in USD.
import java.util.*;

public class Currency_conveter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1 for Rupees to USD, 2 for USD to Rupees: ");
        int choice = in.nextInt();
        if (choice == 1)
        {
            System.out.print("Enter the amount in rupees: ");
            double a = in.nextDouble();
            double usd = a * 0.012d;
            System.out.println("$"+usd);
        }
        else if (choice == 2) {
            System.out.print("Enter the amount in Dollars: ");
            double a = in.nextDouble();
            double rup = a * 83.88d;
            System.out.println("₹"+rup);
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
