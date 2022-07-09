package StringPrograms;

// Write a java program to find out number of characters occurrence in String?

import java.util.LinkedHashMap;

public class Example15 {
    public static void main(String[] args){

        findDuplicateCharacters("java");

    }
    public static void findDuplicateCharacters(String str){
        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
        for (int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if (lhm.get(c)!=null){
                lhm.put(c,lhm.get(c)+1);
            }else{
                lhm.put(c,1);
            }
        }
        System.out.println(lhm);
    }
}
