package leetCode.collections.stack_and_queue;

import java.util.ArrayList;
import java.util.Stack;

public class SimplifyPaths {
    public static void main(String[] args) {
        String s = "/home//foo/";
        String path = "/a/b/c/.././././//d";
        String dots = "/../";
//        System.out.println(simplifyPath(s));
//        System.out.println(simplifyPath(path));
        System.out.println(simplifyPathUsingStack(dots));
        System.out.println(simplifyPathUsingStack(s));
        System.out.println(simplifyPathUsingStack(path));
    }
    public static String simplifyPath(String path){
        var dirs = new ArrayList<String>();
        for (var dir : path.split("/")){
            if (dir.isEmpty() || dir.equals("."))
                continue;
            else if (dir.equals("..") && !dirs.isEmpty()) {
                dirs.remove(dirs.size()-1);
            }else {
                dirs.add(dir);
            }
        }
        System.out.println(dirs);
        return "/" + String.join("/",dirs);
    }
    public static String simplifyPathUsingStack(String path){
        Stack<String> stack = new Stack<>();
        String[] strs = path.split("/");

        for (String dir : strs){
            if (dir.equals(".") || dir.isEmpty()) {
                continue;
            }
            if (dir.equals("..") && !stack.empty()) {
                stack.pop();
            }
            if(!dir.equals(".."))
                stack.push(dir);
        }
        System.out.println(stack);
        return stack.empty() ? "/" : new StringBuilder("/"+String.join("/", stack)).toString();
    }
}
