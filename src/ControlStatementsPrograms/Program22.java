package ControlStatementsPrograms;

/* An Evil number is a positive whole number which has even numbers of 1's in is binary equivalent
*  Example: Binary equivalent of 9's is 1001. which contains even number of 1's.
*
*  Thus 9 is Evil Number.
*  A few Evil numbers are 3,5,6,9....
*
*  Design  a program to accept a positive  whole number 'N' where N>2 and N<100. Find the binary equivalent of the binary
*  number and count the number of 1's in it and display whether it is an Evil number or not with and appropriate message.*/

/*Test your program with the following data.

Example:
INPUT:
N=15

OUTPUT:
Binary Equivalent: 1111
No of 1’s is: 4
It is Evil Number

Example:
INPUT:
N=3

OUTPUT:
Binary Equivalent: 1010
No of 1’s is: 1
It is not Evil Number
*/

import java.util.*;

public class Program22 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Decimal Number:");
        int n = sc.nextInt();

        // logic
        if (n>2 && n<100){
            // get the converted binary number
            String bin = getBinaryNumber(n);

            System.out.println("Binary Equivalent: "+ bin);
            int cnt = 0;

            // logic to read all the characters one by one from string
            for (int i=0;i<bin.length();i++){

                // compare each character with 1.
                if (bin.charAt(i)=='1'){
                    cnt++;
                }
            }
            System.out.println("No of 1s is: "+cnt);
            if (cnt%2==0)
                System.out.println("It is Evil Number");
            else
                System.out.println("It is not Evil Number");
        }// end if
         else{
             System.out.println("Number out of Range");
        }
    }
    // Method to convert a number to binary
    public static String getBinaryNumber(int n){
        String sum = " ";
        while(n>0){
            int rem = n%2;
            sum = rem+sum;
            n=n/2;
        }
        return sum;

    }
}
