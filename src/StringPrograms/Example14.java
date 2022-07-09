package StringPrograms;

// Write a java program to find out duplicate occurrence in a given String?

import java.util.LinkedHashMap;

public class Example14 {
    public static void main(String[] args){

        findDuplicateWords("I am going to crack the Interview on Saturday");

    }
    public static void findDuplicateWords(String str){
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
        String[] s = str.split("");

        for (String tempString: s){
            if (lhm.get(tempString)!=null){
                lhm.put(tempString,lhm.get(tempString)+1);
            }
            else {
                lhm.put(tempString,1);
            }
        }
        System.out.println(lhm);
    }
}
