package intermediate_programs;

import java.util.Scanner;

//CommissionPercentage=(
//CommissionEarned/TotalSales
//        )×100
public class Commisioned_Percentage {
   public static double cp(double T_sales,double commision){
       return ((commision/T_sales)*100);
   }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the total number of sales: ");
        double T_sales = in.nextDouble();
        System.out.print("Enter the Total commision: ");
        double commision = in.nextDouble();
        System.out.println("Commision percentage is: " + cp(T_sales,commision)+"%");
    }
}
