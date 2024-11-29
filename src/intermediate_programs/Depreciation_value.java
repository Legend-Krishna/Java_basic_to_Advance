package intermediate_programs;
//Depreciated_Value=Initial_Value×(1−Rate/100)^Time

import java.util.Scanner;

public class Depreciation_value {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the initial value: ");
        double initial_value = in.nextDouble();
        System.out.println("Enter the rate in percentage: ");
        double rate = in.nextDouble();
        System.out.println("Enter the time: ");
        float time = in.nextFloat();
        double dpv = initial_value*Math.pow(1-rate/100,time);
        System.out.println("Depreciated value is: "+dpv);
    }
}
