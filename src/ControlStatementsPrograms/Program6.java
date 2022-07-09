package ControlStatementsPrograms;

// Write a Java Program to fina out give year is leap year or not?

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args){

        // taking inputs
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the Year: ");
        int year = sc.nextInt();

        //logic
        if (year%4==0){
            System.out.println("It is a Leap Year");
        } else{
            System.out.println("It is not a Leap Year");
        }
    }
}
