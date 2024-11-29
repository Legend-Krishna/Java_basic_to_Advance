package intermediate_programs;

import java.util.Scanner;

public class Batting_Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total runs scored: ");
        int runs = in.nextInt();
        System.out.println("Enter the total innings played: ");
        int innings = in.nextInt();
        System.out.println("Enter the number of not outs: ");
        int not_outs = in.nextInt();
        int outs = innings-not_outs;
        float average = (float) runs /outs;
        System.out.println(average);
    }
}
