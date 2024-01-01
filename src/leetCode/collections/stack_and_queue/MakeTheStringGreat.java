package leetCode.collections.stack_and_queue;

import java.util.Stack;

public class MakeTheStringGreat {
    public static void main(String[] args) {
        String s = "leEeetcode";
        System.out.println(makeGood(s));
    }
    public static String makeGood(String s){
        Stack<Character> st = new Stack<>();

        for (Character ch : s.toCharArray()){
            if(!st.empty()){
                if((Character.isUpperCase(ch) && Character.isLowerCase(st.peek()) && Character.toLowerCase(ch)==st.peek())
                || (Character.isLowerCase(ch) && Character.isUpperCase(st.peek()) && Character.toUpperCase(ch)== st.peek())){
                    st.pop();
                }else
                    st.push(ch);
            }else{
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : st){
            sb.append(c);
        }
        return sb.toString();
    }
}
