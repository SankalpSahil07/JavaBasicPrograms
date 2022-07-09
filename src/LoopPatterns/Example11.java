package LoopPatterns;

 // Write a java program to print the below pattern

 /*    * * * *
 *     * * *
 *     * *
 *     *    */

public class Example11 {
    public static void main(String[] args){
        int i,j;

        for (i=4;i>=1;i--){
            // columns
             for (j=1;j<=i;j++){
                 System.out.print("*"+" ");
             }
             System.out.println(" ");
        }
    }
}
