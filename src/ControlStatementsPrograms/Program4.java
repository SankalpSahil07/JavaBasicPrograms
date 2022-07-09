package ControlStatementsPrograms;

// Write a Java Program to find out give number is even or odd?

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args){

        //taking input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        //logic
        if(n%2==0){
            System.out.println("it is even number");
        } else{
            System.out.println("it is odd number");
        }
    }
}
