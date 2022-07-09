package BasicPrograms;

// Write a Java Program to accept one salary then find out 10% of tax?

import java.util.Scanner;

public class Program14 {
    public static void main(String[]args){

        // taking input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Salary: ");
        int sal = sc.nextInt();

        //logic
        double tax = (double)sal*10/100;
        System.out.println("Tax deduction is: " +tax);


    }
}
