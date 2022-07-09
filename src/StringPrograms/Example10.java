package StringPrograms;

// Write a java program to remove duplicate characters from String?

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer(str);

        str.chars().distinct().forEach(c->sb.append((char) c));
        System.out.println(sb);

    }
}
