package LoopPatterns;

// Write a java program to print the below pattern
/*       *
*      * *
*    * * *
*  * * * *
* */

public class Example17 {
    public static void main(String[] args){
        int i,j;
        // rows
        for (i=1;i<=4;i++){
            // space
            for (j=4;j>i;j--){
                System.out.print(" ");
            }
            // right side elements
            for (j=1;j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
