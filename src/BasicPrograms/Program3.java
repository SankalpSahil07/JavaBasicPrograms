package BasicPrograms;

// Write a Java Program to perform square of a given number?

import java.util.Scanner;

public class Program3 {

    public static void main(String[] args){

        // asking input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int a = sc.nextInt();

        // logic
        int square = a*a;
        System.out.println("Square of the given number is:  "+ square);

    }

}
