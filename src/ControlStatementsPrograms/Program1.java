package ControlStatementsPrograms;

// Write a Java Program to check given age is eligible to vote or not?

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args){

        // taking input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Age: ");
        int age = sc.nextInt();

        //logic
        if(age>=18){
            System.out.println("You are eligible to vote");
        } else{
            System.out.println("You are not eligible to vote");
        }
    }
}
