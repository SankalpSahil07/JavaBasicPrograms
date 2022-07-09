package BasicPrograms;

// Write a program to perform swapping of two numbers?

import java.util.Scanner;

public class Program10 {
    public static void main(String[]args){

        // taking input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        int a = sc.nextInt();

        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();

        System.out.println("Before Swapping a="+a+" and b="+b);

        //logic
        int temp = a;
        a= b;
        b= temp;
        System.out.println("After Swapping a="+a+" and b="+b);
    }
}
