package leetCode.strings;

import java.util.Arrays;
import java.util.Scanner;

public class IsBoolean {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(reversed(A.toCharArray()));
        if(A.equals(reversed(A.toCharArray()))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

    public static String reversed(char[] s){
        int left=0;
        int right=s.length-1;

        while(left<right){
            char tem=s[left];
            s[left]=s[right];
            s[right]=tem;

            left++;
            right--;
        }
        return Arrays.toString(s);
    }
}
