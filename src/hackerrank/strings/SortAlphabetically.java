package hackerrank.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortAlphabetically {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s= scan.nextLine();
        int k = scan.nextInt();
        System.out.println(getSmallestAndLargest(s,k));

    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        List<String> list=new ArrayList<>();
        for(int i=0; i<=s.length()-k;i++){
            String str= s.substring(i,i+k);

            list.add(str);
        }

        Collections.sort(list);
        smallest=list.get(0);
        largest=list.get(list.size()-1);

        return smallest + "\n" + largest;
    }

    public static void getSmallestAndLargestSubs(String s){


    }


}
