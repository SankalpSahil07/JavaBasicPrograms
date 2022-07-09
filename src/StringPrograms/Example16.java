package StringPrograms;

// Write a java program to check given string is well-formed/Balanced or not?

import java.util.ArrayDeque;
import java.util.Deque;

public class Example16 {
    public static void main(String[] args){

        String expr = "([{}])";

        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");

    }
    // function to check if brackets are balanced
    static boolean areBracketsBalanced(String expr){

        // Using ArrayDeque is faster than using Stack class
        Deque<Character> stack = new ArrayDeque<Character>();

        //Traversing the Expression
        for (int i = 0; i<expr.length();i++){
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                // push the element in the stack
                stack.push(x);
            }
            if (stack.isEmpty()){
                return false;
            }
            char check;
            switch (x){
                case ')' : check = stack.pop();
                            if (check == '{' ||check == '[') return false;
                            break;
                case '}' : check = stack.pop();
                            if (check == '(' || check == '[') return false;
                            break;
                case ']': check  = stack. pop();
                        if (check == '(' || check== '{') return false;
                        break;
            }
            }
                // check Empty stack
                return (stack.isEmpty());
        }
    }

