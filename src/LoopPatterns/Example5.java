package LoopPatterns;

// Write a java program to point below pattern?
/* AAAA
*  BBBB
*  CCCC
*  DDDD
* */

public class Example5 {
   public static void main(String[] args){
       char i,j;

       for (i='A';i<='D';i++){
           //columns
           for (j='A';j<='D';j++){
               System.out.print(i+" ");
           }
           System.out.println(" ");
       }
   }
}
