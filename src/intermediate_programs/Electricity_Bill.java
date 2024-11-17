package intermediate_programs;

import java.util.Scanner;

public class Electricity_Bill {
    public static float E_Bill(float units){
        return units * 8.8f;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of units: ");
        float units = in.nextFloat();
        System.out.println("Your bill is $" + E_Bill(units));

    }
}
