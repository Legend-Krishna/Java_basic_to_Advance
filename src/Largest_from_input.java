//Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;

public class Largest_from_input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers and 0 to stop: ");
        int fir = in.nextInt();
        int sec = in.nextInt();
       int large = 0;
        while(sec!=0)
        {
            if (fir>sec) {
            large = fir;
        } else if (sec>fir) {
                large = sec;
            }
            fir = large;
            sec = in.nextInt();
//            if (sec>large) large = sec;
//
        }
        System.out.println(large);

    }
}
