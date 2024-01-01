package leetCode.collections.stack_and_queue;

import java.util.Stack;

public class BackSpaceStringCompare {
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ae#c";

//        System.out.println(build(s).equals(build(t)));
        System.out.println(leftChars(s).equals(leftChars(t)));
    }
    public static String build(String s){
        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()){
            if (c !='#'){
                stack.append(c);
            }else {
                stack.deleteCharAt(stack.length()-1);
            }
        }
        return stack.toString();
    }
    public static String leftChars(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if (c != '#') stack.push(c);
            else if (!stack.empty()) {
                stack.pop();
            }
        }
        return stack.toString();
    }
}
