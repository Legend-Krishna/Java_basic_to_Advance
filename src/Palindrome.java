//To find out whether the given String is Palindrome or not.
import java.util.*;

class Isplaindrome
{
    public static boolean ispalindrome(String str)
    {

        int i = 0;
        int j = str.length()-1;
        while(i<j)
        {
            if (str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            i++;
            j--;

        }
        return true;

    }
}







public class Palindrome extends Isplaindrome {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner in = new Scanner(System.in);
        String check = in.next();
        if (ispalindrome(check))
        {
            System.out.println("Given string is a palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }


    }

}
