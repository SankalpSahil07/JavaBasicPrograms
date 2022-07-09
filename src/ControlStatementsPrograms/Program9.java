package ControlStatementsPrograms;

// Write a Java Program to check given alphabet is a vowel or consonant?

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {

        //taking inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Alphabet: ");
        char ch = sc.next().charAt(0);

        //logic
        switch (ch) {
            case 'a':
                System.out.println("It is a Vowel");
                break;
            case 'e':
                System.out.println("It is a Vowel");
                break;
            case 'i':
                System.out.println("It is a Vowel");
                break;
            case 'o':
                System.out.println("It is a Vowel");
                break;
            case 'u':
                System.out.println("It is a Vowel");
                break;
            default: System.out.println("It is a Consonant");

        }
    }
}
