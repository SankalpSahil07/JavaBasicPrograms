package ArraysProgram;

//Write a java program to find out number of even and odd elements in a given array?

import java.util.Scanner;

public class Example8 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // inserting elements
        for (int i=0;i<size;i++){
            System.out.println("Enter the element of arr["+i+"]:");
            arr[i] = sc.nextInt();
        }

        int even=0, odd=0;
        // logic
        for (int i = 0;i<size; i++){
            if (arr[i]%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("No of Even elements is = "+ even);
        System.out.println("No of Odd elements is = "+ odd);
    }
}