package leetCode.collections.stack_and_queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class RemovingStarsFromString {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
        System.out.println(removeStars2(s));

    }
    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for(Character ch : s.toCharArray()){
            if(!ch.equals('*'))
                stack.push(ch);
            else
                stack.pop();
        }
        String str = "";
        for(char c : stack)
            str += c;
        return str;
    }
    public static String removeStars2(String s){
        Deque<Character> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for(Character ch : s.toCharArray()){
            if (!ch.equals('*'))
                queue.add(ch);
            else
                queue.removeLast();
        }
        for (char c : queue)
            sb.append(c);
        return sb.toString();
    }

}
