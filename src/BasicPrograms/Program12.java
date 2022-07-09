package BasicPrograms;

// Write a Java Program to find out greatest of two numbers using ternary operators?

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args){

        // taking input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        int a = sc.nextInt();

        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();

        //logic
        int max = (a>b)?a:b;
        System.out.println("Greatest of two numbers is= "+max);
    }
}
