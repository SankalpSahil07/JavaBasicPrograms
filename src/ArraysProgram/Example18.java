package ArraysProgram;

// Write a program to print all the LEADERS in the array. An element is leader if it is greater than all elements to its right side.
//  And the rightmost elements is always leader.

public class Example18 {
    public static void main(String[] args){

        int[] arr = {6, 1, 2, 18, 9, 4, 5};

        for (int i= 0; i<arr.length;i++){
            int j;
            for (j = i+1; j<arr.length; j++){
                if (arr[i] <=arr[j])
                    break;
            }
            if (j== arr.length) // the loop didn't break
                System.out.print(arr[i]+ " ");
        }
    }
}
