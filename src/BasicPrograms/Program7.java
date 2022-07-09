package BasicPrograms;

// Write a Java Program to find out area of a triangle?

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args){

        // asking inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Base: ");
        int base = sc.nextInt();

        System.out.println("Enter the Height: ");
        int height = sc.nextInt();

        //logic
        double area = 0.5*base*height;
        System.out.println("Area of the Triangle is : " + area);
    }
}
