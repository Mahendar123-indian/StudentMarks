
import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read marks of three subjects
        System.out.print("Enter first subject marks: ");
        double mark1 = sc.nextDouble();

        System.out.print("Enter second subject marks: ");
        double mark2 = sc.nextDouble();

        System.out.print("Enter third subject marks: ");
        double mark3 = sc.nextDouble();

        // Calculate total marks
        double total = mark1 + mark2 + mark3;

        // Calculate average marks
        double average = total / 3;

        // Display results
        System.out.println("\n--- Student Marks Report ---");
        System.out.println("First Subject: " + mark1);
        System.out.println("Second Subject: " + mark2);
        System.out.println("Third Subject: " + mark3);

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        sc.close();
    }
}