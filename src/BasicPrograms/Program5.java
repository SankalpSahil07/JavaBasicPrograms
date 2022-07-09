package BasicPrograms;

// Write a Java Program to find out the area of a circle?

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {

        // asking input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Radius: ");
        int r = sc.nextInt();

        // logic
         double area = 3.14*r*r;

         System.out.println("Area of the Circle is : "+ area);

    }
}
