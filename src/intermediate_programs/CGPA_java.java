package intermediate_programs;
import java.util.Scanner;
public class CGPA_java {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input number of subjects
            System.out.print("Enter the number of subjects: ");
            int subjects = scanner.nextInt();
            double[] grades = new double[subjects];
            double sum = 0;

            // Input grades for each subject
            for (int i = 0; i < subjects; i++) {
                System.out.print("Enter grade for subject " + (i + 1) + ": ");
                grades[i] = scanner.nextDouble();
                sum += grades[i];
            }

            // Calculate CGPA
            double cgpa = sum / subjects;

            // Display result
            System.out.printf("The CGPA is: %.2f\n", cgpa);

            scanner.close();
        }
    }


