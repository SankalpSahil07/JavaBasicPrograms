package StringPrograms;

import java.util.Scanner;

public class Example12 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter original String: ");
        String input = sc.nextLine();

        System.out.println("Please Enter rotation of String: ");
        String rotation = sc.nextLine();

        if (checkRotation(input, rotation)){
            System.out.println(input + " and "+ rotation + " are rotation of each other ");

        } else{
            System.out.println("Sorry, they are not rotation of another ");
        }
        sc.close();
    }
    public static boolean checkRotation(String original, String rotation){
        if (original.length() != rotation.length()){
            return false;
        }
        String concatenated = original + original;
        // checking rotation string in concatenated string
        if (concatenated.indexOf(rotation)!=1){
            return true;
        }
        return false;
    }
}
