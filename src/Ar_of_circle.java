import java.util.Scanner;

public class Ar_of_circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float radius = in.nextFloat();
        float area = (float) (3.14 * (radius*2));
        System.out.println(area);
    }
}
