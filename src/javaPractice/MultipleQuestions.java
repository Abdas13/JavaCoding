package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MultipleQuestions {
    public static void main(String[] args) {
        System.out.println(reverseString("pencil"));
        System.out.println(reverseWithStrBuild("pen"));
        char[] arr = {'a', 'b', 'c', 'd'};
        reversedChar(arr, 4);
        System.out.println();
        System.out.println(isPrime(7));
        System.out.println(isPalindrome("kavakal"));
        System.out.println(isPalindrome2("ey edip adanada pide ye"));

        String input = "Geeks For Geeks";
        System.out.println(reverseStringByArrayList(input));
        System.out.println(findFactorial(6));
        System.out.println(sumOfDigits(1234));
        System.out.println(isArmstrong(370));

        int [] array = {5, 6, 76, 31, 43, 1};
        System.out.println(findLargestNum(array,6));
        System.out.println(findTwoLargestNumbers(array,6));

        int numToReverse=98765;
        System.out.println("Reverse of "+numToReverse+" is "+reverseNumber(numToReverse));

    }
    public static String reverseString(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static String reverseWithStrBuild(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void reversedChar(char[] chars, int size) {
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i] + ", ");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
            if (reverse.equals(str)) {
                return true;
            }
        }
        return false;
    }
    public static boolean isPalindrome2(String str){
        int head=0;
        int tail=str.length()-1;
        while (head<tail){
            if(str.charAt(head)!=str.charAt(tail)){
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }
    public static String reverseStringByArrayList(String str){
        List<Character> list=new ArrayList<>();
        String rev="";
        for (char c: str.toCharArray()) {
            list.add(c);
        }
//        Collections.sort(list,Collections.reverseOrder());
        Collections.reverse(list);
        Object[] arr2= list.toArray();

        for (int i = 0; i < arr2.length; i++) {
            rev +=arr2[i];
        }
        return rev;
    }
    public static int findFactorial(int number){
        int factorial=1;
        for (int i = 1; i <=number ; i++) {
            factorial=factorial*i;
        }
        return factorial;
    }
    public static int sumOfDigits(int number){
        int sum=0;

        while (number>0){
            sum=sum+number%10;
            number=number/10;
        }
        return sum;
    }
    public static boolean isArmstrong(int number){
        int originalNumber=number;
        int sum=0;
        while (number>0){
            int digit=number%10;
            sum=sum+(digit*digit*digit);
            number=number/10;
        }
        if(originalNumber!=sum){
            return false;
        }
        return true;
    }
    public static int findLargestNum(int[] arr, int limit){
        Arrays.sort(arr);
       return arr[arr.length-1];
    }
    public static String findTwoLargestNumbers(int[] maxArrays, int limit){
        int firstMax=maxArrays[0];
        int secondMax=maxArrays[0];
        for (int each:maxArrays) {
            if(each>firstMax){
                secondMax=firstMax;
                firstMax=each;
        }
        }
        return firstMax+" is firstMaximum and "+secondMax+" is secondMaximum";
    }
    public static int reverseNumber(int number){
        int reverse=0;
        while(number>0){
            reverse=(10*reverse)+(number%10);
            number=number/10;
        }
        return reverse;
    }

}
