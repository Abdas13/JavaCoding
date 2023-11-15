package codility;

import java.util.Arrays;
import java.util.Stack;

public class StackPushAndPop {

    public static void main(String[] args) {
        /*
        There are strings are given with PUSH and POP and numbers such as
        String str1 = "PUSH -3;PUSH 25;POP 2;PUSH 30;PUSH 10;POP 1"
        The number of POP is a positive number and means the number of elements must be deleted.
        The number of PUSH is between -100 and 100 any number means push that number.
        Above example output should be [30]
        Example 2 : String str2 = "PUSH 100, PUSH -3; PUSH 25; POP 2; PUSH 30; PUSH 10; POP 1"
        output : [100, 30]
         */
        String str1 = "PUSH 100;PUSH -3;PUSH 25;POP 2;PUSH 30;PUSH 10;POP 1";
        System.out.println(Arrays.toString(pushAndPop(str1)));
    }
    public static int[] pushAndPop(String commandInfo){

        Stack<Integer > stack = new Stack<>();
        String[] strArr = commandInfo.trim().split(";");

        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i].trim().startsWith("POP")) {
                int countOfPop = Integer.parseInt(strArr[i].substring(4));
                for (int j = 0; j < countOfPop; j++) {
                    stack.pop();
                }
            }else if(strArr[i].trim().startsWith("PUSH")){
                int requirePush = Integer.parseInt(strArr[i].substring(5));
                stack.push(requirePush);
            }
        }
        int[] stackArr = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            stackArr[i]=stack.get(i);
        }
        return stackArr;
    }
}





