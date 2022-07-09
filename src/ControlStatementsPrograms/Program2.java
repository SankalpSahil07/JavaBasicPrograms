package ControlStatementsPrograms;

// Write a Java Program to find out greatest of two numbers using if and else statements?

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args){

        //taking inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        int a = sc.nextInt();

        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();

        //logic
        if(a>b){
            System.out.println(a+ " is the greatest");
        }else{
            System.out.println(b+ " is the greatest");
        }
    }
}
