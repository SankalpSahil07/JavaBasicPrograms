package LoopPatterns;

// Write a java program to display prime numbers loop pattern?
/* 2
*  3 5
*  7 11 13
*  17 19 23 29 */

public class Example24 {
    public static void main(String[] args){
        int counter = 2;

        for (int i= 1;i<=4;i++){
            for (int j = 1; j<=i;j++){
                /* find next prime number by incrementing counter and */
                while (!isPrimeNumber(counter)){
                    counter++;
                }
                System.out.println(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static boolean isPrimeNumber(int num){
        int c =0;
        for (int i = 1; i<=num;i++){
            if (num% i==0)
                c++;
        }
        if (c==2)
            return true;
        else
            return false;
    }
}
