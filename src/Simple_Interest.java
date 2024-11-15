import java.util.*;
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest


public class Simple_Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Principal = in.nextInt();
        float time = in.nextFloat();
        float rate = in.nextFloat();
        float SI = (Principal * time * rate ) / 100;
        System.out.println("Simple Interest is " + SI);
    }

}
