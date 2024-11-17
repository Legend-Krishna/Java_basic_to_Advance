package Patterns;

import java.util.Scanner;

public class Square_Pattern {
    public static void pattern(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows ");
        int rows = in.nextInt();
        int i = 0;
        while(i<rows){

                System.out.print("* * * *");
                System.out.println(" ");
                i++;

        }
    }






    public static void main(String[] args) {
        pattern();
    }
}
