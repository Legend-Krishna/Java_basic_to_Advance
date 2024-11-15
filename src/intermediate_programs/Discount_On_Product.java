package intermediate_programs;

import java.util.Scanner;

public class Discount_On_Product {
    public static double discount(float original_price,float discount_percentage){
        double discount_amount  =   (discount_percentage / 100) * original_price;
        double total_discount = original_price - discount_amount;
        return total_discount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the original price: ");
        float original_price = in.nextFloat();
        System.out.print("Enter the discount percentage: ");
        float discount_percentage = in.nextFloat();
        System.out.println("You got " + discount(original_price,discount_percentage) + "  discount");
    }
}

