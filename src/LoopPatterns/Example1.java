package LoopPatterns;

 // write a java program to print below pattern?
 /*  1111
 *   2222
 *   3333
 *   4444*/

public class Example1 {

    public static void main(String[] args){

     int i,j;

     // rows
        for (i=1;i<=4; i++){

            //columns
            for (j=1;j<=4;j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }

    }
}


