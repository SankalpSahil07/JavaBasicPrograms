package LoopPatterns;

// Write a java program to print below pattern?
/*  1234
*   1234
*   1234
*   1234*/

public class Example2 {
    public static void main(String[] args){
        int i,j;

        // rows
         for (i=1;i<=4;i++){
             //cols
             for (j=1;j<=4;j++){
                 System.out.print(j+ " ");
             }
             System.out.println(" ");
         }
    }
}
