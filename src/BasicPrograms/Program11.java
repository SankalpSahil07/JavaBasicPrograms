package BasicPrograms;

// Write a Java Program to perform Swapping of two numbers without using third variable?

import java.util.Scanner;

public class Program11 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        int a = sc.nextInt();

        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();

        System.out.println("Before Swapping a="+a+" and "+b);

        //logic
        a= a+b;
        b=a-b;
        a=a-b;

        System.out.println("After Swapping a="+a+" and b="+b);

    }
}
