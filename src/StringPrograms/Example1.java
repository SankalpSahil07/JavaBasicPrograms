package StringPrograms;

// Write a java program to find out length of the String?

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        System.out.println("Length of the String is: "+ str.length());

    }
}
