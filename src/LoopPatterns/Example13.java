package LoopPatterns;

// Write a java program to print the below numeric pattern
 /*  1
 *   2 3
 *   4 5 6
 *   7 8 9 10
 * */

public class Example13 {
  public static void main(String[] args) {

      int i,j,k=1;

      // rows
      for (i=1;i<=4;i++){
          // columns
          for (j=1;j<=i;j++){
              System.out.print((k++)+" ");
          }
          System.out.println("");
      }

  }
}
