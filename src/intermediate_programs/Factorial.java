package intermediate_programs;

import java.util.Scanner;

//Factorial Program In Java
public class Factorial {
    public int fact(int num) {
        int i = num;
        while(i!=1){
            num *= i-1;
            i -= 1;

        }
        return num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        Factorial f = new Factorial();
        System.out.println(f.fact(num));

    }
}
