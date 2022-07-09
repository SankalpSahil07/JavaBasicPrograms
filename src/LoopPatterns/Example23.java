package LoopPatterns;

// Write a java program to print the below alphabet pattern
/*  A
*  ABA
*  ABCBA
* ABCDCBA*/

public class Example23 {
    public static void main(String[] args){
        char i,j;
        // rows
        for (i='A'; i<='D';i++){
            for (j='D';j>i;j--){
                System.out.print(" ");
            }
            for (j='A';j<=i;j++){
                System.out.print(j+"");
            }
            for (j=(char) (i-1);j>='A';j--){
                System.out.print(j+"");
            }
            System.out.println(" ");
        }
    }
}
