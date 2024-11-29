package intermediate_programs;

import java.util.Scanner;
//Supposed total subjects to be 4 as not using arrays here
public class AVG_Marks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your marks in sub1: ");
        float sub1 = in.nextFloat();
        System.out.println("Enter your marks in sub2: ");
        float sub2 = in.nextFloat();
        System.out.println("Enter your marks in sub3: ");
        float sub3 = in.nextFloat();
        System.out.println("Enter your marks in sub4: ");
        float sub4 = in.nextFloat();
        float avg = (sub1+sub2+sub3+sub4)/4;
        System.out.println("Your average marks are: "+avg);

    }
}
