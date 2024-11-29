package intermediate_programs;

import java.util.Scanner;

//Amount=Principal×(1+ rate/100*n)^n*time
//Compound_Interest=AMount-Principal
//Inputs: principal, rate, time, and n (number of compounds per year).
public class Compound_Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        double principal = in.nextDouble();
        System.out.println("Enter the rate in % : ");
        double rate = in.nextDouble();
        System.out.println("Enter the time in years: ");
        int time = in.nextInt();
        System.out.println("Enter thr number of compounds per year: ");
        int n = in.nextInt();
        double amount = principal * Math.pow((1+rate/(100*n)),time*n);
        double CI = amount - principal;
        System.out.println("The amount is : "+amount);
        System.out.println("Compound Interest is : "+CI);
    }
}
