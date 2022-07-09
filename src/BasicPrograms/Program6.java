package BasicPrograms;

// Write a Java Program to find out perimeter of a circle?

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args){

        // asking inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Radius: ");
        int radius = sc.nextInt();

        //logic
        double perimeter = 2*3.14*radius;
        System.out.println("Perimeter of the Circle is: "+ perimeter);

    }
}
