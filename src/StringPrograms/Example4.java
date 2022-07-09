package StringPrograms;

// Write a java program to display the reverse of the String?

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        char[] carr = str.toCharArray();
        for (int i= carr.length-1;i>=0;i--){
            System.out.print(carr[i]);
        }
    }
}
