//Take 2 numbers as input and print the largest number.
import java.util.*;

public class Greatest_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        if (a > b)
        {
            System.out.println(a + " Is the greater number");
        }
        else {
            System.out.println(b + " Is greater number");
        }
    }
}
