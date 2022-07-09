package StringPrograms;

// Write a java program to display reverse of a sentence in a String?

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        // convert String to String array
        String[] sarr = str.split(" ");

        // reading string one by one from array
        for (String s: sarr){

            // convert each string to char Array
            char[] carr = s.toCharArray();

            // reading characters in reverse order
            for (int i= carr.length-1;i>=0;i--){
                System.out.print(carr[i]);
            }
            // space after each word
            System.out.print(" ");
        }
    }
}
