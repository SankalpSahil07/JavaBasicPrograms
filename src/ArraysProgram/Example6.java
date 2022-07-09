package ArraysProgram;

// Write a java program to display array elements in sorting order i.e ascending order?

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        // inserting elements
        for (int i=0; i<size;i++){
            System.out.println("Enter the element of arr["+i+"]: ");
            arr[i] = sc.nextInt();
        }

        // ascending logic
        for (int i=0; i<size;i++){
            for (int j=0;j<size;j++){
                if (arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            // displaying elements
            for (int j=0;i<size;i++){
                System.out.println(arr[i]+ " ");
            }
        }
    }
}
