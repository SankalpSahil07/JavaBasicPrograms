package LoopPatterns;

// Write a java program to print the numeric pattern
/*  1234321
*    12321
*     121
*      1
* */

public class Example22 {
    public static void main(String[] args){
        int i,j;
         for (i=4;i>=1;i--){
             for (j=4;j>i;j--){
                 System.out.print(" ");
             }
             for (j=1;j<=i;j++){
                 System.out.print(j+" ");
             }
             for (j=i-1;j>=1;j--){
                 System.out.print(j+" ");
             }
             System.out.println("");
         }
    }
}
