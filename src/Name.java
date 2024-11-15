import java.util.*;
// Take name as input and print a greeting message for that particular name.
public class Name {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        System.out.println("Hello " + in.nextLine());
    }

}
