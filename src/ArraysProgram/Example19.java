package ArraysProgram;

/* You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in the list.
* One of the integers is missing in the list. Write an efficient code to find the missing integers */

public class Example19 {
    public static void main(String[] args){

        int[] arr = {1,2,4,5,6};
        int expected_elements = arr.length+1;

        int total= expected_elements*(expected_elements+1)/2;

        // sum of all the elements
         int sum  = 0;
         for (int i : arr){
             sum = sum+i;
         }
         System.out.println("Missing No is: "+ (total-sum));
    }
}
