package leetCode.collections.stack_and_queue;

import java.util.HashMap;
import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        String s = "(){}[]";
        String str = "({)}";
        System.out.println(isParanthesesValid(s));
        System.out.println(isParanthesesValid(str));
    }
    public static boolean isParanthesesValid(String s){
        HashMap<Character, Character> matching = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        matching.put('(', ')');
        matching.put('[', ']');
        matching.put('{', '}');

        for (char c: s.toCharArray()){
            if (matching.containsKey(c))
                stack.push(c);
            else {
                if (stack.empty()){
                    return false;
                }
                char previousOpening = stack.pop();
                if (matching.get(previousOpening) != c)
                    return false;
            }
        }
        return stack.empty();
    }
}
