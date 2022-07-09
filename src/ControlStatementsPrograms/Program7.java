package ControlStatementsPrograms;

// Write a Java Program to accept one alphabet then find out given alphabet is a vowel or not?

import java.util.Scanner;

public class Program7 {

    public static void main(String[] args){

        // taking inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Alphabet: ");
        char ch = sc.next().charAt(0);

        //logic
        if (ch=='a' || ch=='e' || ch=='o' || ch=='u'){
            System.out.println("it is a vowel");
        } else{
            System.out.println("it is not vowel");
        }
    }
}
