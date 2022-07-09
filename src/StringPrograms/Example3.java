package StringPrograms;

// Write a java program to compare two Strings?

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First String: ");
        String str1 = sc.nextLine();

        System.out.println("Enter the Second String: ");
        String str2 = sc.nextLine();

        boolean compare = str1.equals(str2);

        if (compare)
            System.out.println("Both are equals");
        else
            System.out.println("Both are not equals");

    }
}
