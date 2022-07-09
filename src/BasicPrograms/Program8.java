package BasicPrograms;

// Write a java Program to perform to find out area of a rectangle?

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length: ");
        int l = sc.nextInt();

        System.out.println("Enter the breadth: ");
        int b = sc.nextInt();

        //logic
        double area = l*b;
        System.out.println("Area of the Rectangle is: " +area);

    }
}
