package StringPrograms;

// Write a java program to display reverser of String?

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str1 = sc.nextLine();

        // convert String to String Array
        String[] sarr = str1.split(" ");

        // read String from array in reverse order
        for (int i= sarr.length-1;i>=0;i--){
            System.out.println(sarr[i]+ " ");
        }

    }
}
