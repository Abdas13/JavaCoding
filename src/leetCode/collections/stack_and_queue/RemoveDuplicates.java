package leetCode.collections.stack_and_queue;

import java.util.Stack;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "abccba";
        String str = "abbaca";
        System.out.println(removeDuplicates(s));
        System.out.println(removeDuplicates(str));
    }
    public static String removeDuplicates(String s){
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(!st.empty() && st.peek() == c){
                st.pop();
            }else {
                st.push(c);
            }
        }
        return st.toString();
    }
}
