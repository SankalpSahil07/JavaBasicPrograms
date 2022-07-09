package ArraysProgram;

// Write a java program to find out number of occurance of a given number in array?

import java.util.Scanner;

public class Example10 {
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

        // Asking elements
        System.out.println("Enter the element: ");
        int ele = sc.nextInt();

        int cnt = 0;
        // logic
        for (int i =0; i<size;i++){
            if (arr[i]==ele){
                cnt++;
            }
        }
        System.out.println("No of occurance of a given elements is ="+ cnt);
    }
}
