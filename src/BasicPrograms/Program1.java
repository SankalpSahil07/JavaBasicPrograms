package BasicPrograms;

// Write a Java Program to perform sum of two Numbers?

import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {

        // asking inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number");
        int a = sc.nextInt();

        System.out.println("Enter the Second Number");
        int b = sc.nextInt();

        // logic
        int c = a + b;

        System.out.println("Sum of the Two Number is : " + c);

    }
}
