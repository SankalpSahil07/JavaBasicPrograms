package ControlStatementsPrograms;

// Write a Java Program to Perform addition of two numbers without using Addition(+) operator?

import java.util.Scanner;

public class Program27 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int x = sc.nextInt();

        System.out.println("Enter the Second Number");
        int y = sc.nextInt();

        while(y!=0){
            int carry = x&y;
            x=x^y;
            y=carry<<1;
        }
        System.out.println("Sum of two numbers is = "+x);
    }
}
