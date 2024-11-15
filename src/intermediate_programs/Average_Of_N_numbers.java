package intermediate_programs;
//Calculate Average Of N Numbers
import java.util.Scanner;

public class Average_Of_N_numbers {
    public static float average(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int first = in.nextInt();
        int sec = in.nextInt();
        int i = 1;
        float result = 0;
        while(i!=0)
        {
            int avg = (first + sec)/2;
             result = avg;
            first = avg;
            System.out.print("Enter the next number: ");
            sec = in.nextInt();
            System.out.print("Enter 1 to continue and Enter 0 to exit: ");
             i = in.nextInt();
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(average());
    }
}
