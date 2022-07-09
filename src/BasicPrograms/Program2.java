package BasicPrograms;

// Write a Java Program to Perform sum of two numbers without using third variable?

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args){

        // asking Input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        int a = sc.nextInt();

        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();

        System.out.println("Sum of the two Numbers: " + (a+b));

    }
}
