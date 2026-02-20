package Control_flow;

import java.util.Scanner;

public class SG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] s = new int[5];
        int total = 0;

        for (int i = 0; i < 5; i++) {
            int marks;
            while (true) {
                System.out.print("Enter marks for Subject " + (i + 1) + " (0-100): ");
                marks = sc.nextInt();

                if (marks >= 0 && marks <= 100) {
                    break; // valid input, exit loop
                } else {
                    System.out.println("Invalid input! Marks must be between 0 and 100. Please try again.");
                }
            }
            s[i] = marks;
            total += s[i];  // add to total directly
        }

        System.out.println("\nTotal Marks = " + total);
        double percentage = total / 5.0;
        System.out.println("Percentage = " + percentage + "%");

        String grade;
        if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 75) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else if (percentage >= 30) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Grade = " + grade);
        sc.close();
    }
}

