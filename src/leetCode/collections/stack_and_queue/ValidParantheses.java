package leetCode.collections.stack_and_queue;

import java.util.HashMap;
import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {

    }
    public static boolean isParanthesesValid(String s){
        HashMap<Character, Character> hm = new HashMap<>();
        hm.put(')', '(');
        hm.put(']', '[');
        hm.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(hm.containsKey(curr)){
                char pop = stack.size() != 0 ? stack.pop() : '#';
                if(pop != stack.get(curr)){
                    return false;
                }
            }else{
                stack.push(curr);
            }
        }
        return stack.isEmpty();
    }
}
