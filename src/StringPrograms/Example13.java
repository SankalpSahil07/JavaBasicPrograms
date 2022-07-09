package StringPrograms;

// Write an efficient program to print all permutations of a given in java/C/Python or any programming language of your choice.

public class Example13 {
    public static void main(String[] args){

        permutation("123");
    }
    public static void permutation(String input){
        permutation("", input);
    }
    private static void permutation(String perm, String word){
        if (word.isEmpty()){
            System.err.println(perm + word);
        }else {
            for (int i = 0;i<word.length();i++){
                permutation(perm +word.charAt(i),
                        word.substring(0,i)+word.substring(i+1,word.length()));
            }
        }
    }
}
