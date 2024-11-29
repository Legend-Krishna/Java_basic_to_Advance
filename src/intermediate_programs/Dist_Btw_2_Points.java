//Calculate Distance Between Two Points
package intermediate_programs;

import java.util.Scanner;

public class Dist_Btw_2_Points {
    public static double Distance(float x1,float x2, float y1, float y2){
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the x-coordinate of first point: ");
        float x1 = in.nextFloat();
        System.out.print("Enter the y-coordinate of first point: ");

        float y1 = in.nextFloat();
        System.out.print("Enter the x-coordinate of second point: ");

        float x2 = in.nextFloat();
        System.out.print("Enter the y-coordinate of second point: ");

        float y2 = in.nextFloat();

        System.out.println("The distance between the points is " + Distance(x1,x2,y1,y2));



    }
}
