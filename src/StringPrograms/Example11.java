package StringPrograms;

// Write a java program to display duplicate characters from String?

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        String characters = "";
        String duplicates = "";

        // reading one by one character from string
        for (int i=0;i<=str.length();i++){

            // converting each character to String
            String current = Character.toString(str.charAt(i));

            // Checking String is available or not.
            if (characters.contains(current)){

                // checking string is not present in duplicates variable
                if (!duplicates.contains(current)){
                    // add the string
                    duplicates+=current;
                }
            }
            characters+=current;
        }
        System.out.println(duplicates);
    }
}
