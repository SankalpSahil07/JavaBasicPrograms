package StringPrograms;

// Write a java program to display reverse of a String?

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer(str);

        System.out.println("Reverse String is : "+ sb.reverse().toString());
    }
}
