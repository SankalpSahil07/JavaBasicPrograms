package LoopPatterns;

// Write a java program to print the numeric pattern
/* 4444
*  333
*  22
*  1 */

public class Example10 {
 public static void main(String[] args){

   int i,j;
   // rows
     for (i=4;i>=1;i--){
         // columns
         for (j=1;j<=i;j++){
             System.out.print(i+" ");
         }
         System.out.println(" ");
     }
 }

}

