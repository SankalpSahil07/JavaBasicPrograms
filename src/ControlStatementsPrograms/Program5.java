package ControlStatementsPrograms;

//Write a Java Program to find out give number is odd or not?

import java.util.Scanner;

public class Program5 {

    public static void main(String[] args){

        //taking inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        //logic
        if (n%2==1 || n%2!=0){
            System.out.println("it is odd number");
        } else{
            System.out.println("It is not odd number");
        }

    }
}

