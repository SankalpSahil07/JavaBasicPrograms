package StringPrograms;

// Write a java program to display reverse of a sentence in a String?

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        // Converting String to String array
        String[] sarr = str.split(" ");

        // reading String one by one from array
         for (String s:sarr){

             // convert each string to char array
             char[] carr = s.toCharArray();

             // reading characters in reverse order
             for (int i= carr.length-1;i>=0; i--){
                 System.out.println(carr[i]);
             }
             // space after each word
             System.out.println(" ");
            // System.out.println("The length of the String: "+ str.length());
         }
    }
}
