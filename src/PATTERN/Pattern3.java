package PATTERN;

import java.util.Scanner;

public class Pattern3 {
    static void main() {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        size = sc.nextInt();
        //upper part
        for (int i = 1; i <= size; i++) {
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("*");
            }
            for (int space = 2 * i; space < 2 * size; space++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = size; i >=0; i--) {
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("*");
            }
            for (int space = 2 * i; space < 2 * size; space++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
