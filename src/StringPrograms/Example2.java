package StringPrograms;

// Write a java program to concatenate two Strings?

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String 1: "+" ");
        String str1 = sc.nextLine();

        System.out.println("Enter the String 2: ");
        String str2 = sc.nextLine();

        String concat_string =str1.concat(str2);
        System.out.println("Concatenated String: "+concat_string);

    }
}
