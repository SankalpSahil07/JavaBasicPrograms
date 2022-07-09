package BasicPrograms;

// Write a Java Program to perform to find the area of the square?

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args){

        // taking inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Side: ");
        int s = sc.nextInt();

        //logic
         double area = s*s;
         System.out.println("Area of the Square is: "+ area);
    }
}
