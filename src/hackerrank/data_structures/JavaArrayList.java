package hackerrank.data_structures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scan = new Scanner(System.in);
            List<List<Integer>> upperList = new ArrayList<>();
            int n = scan. nextInt();
            scan.nextLine();
            for (int i = 0; i < n; i++) {
                List<Integer> inputList = new ArrayList<>();
                String[] listOfNums = scan.nextLine().split(" ");
                for (String listOfNum : listOfNums) {
                    inputList.add(Integer.parseInt(listOfNum));
                }
                upperList.add(inputList);

            }
        System.out.println(upperList);
            int m = scan.nextInt();
            scan.nextLine();
            List<List<Integer>> indexList = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                List<Integer> listOfPairs = new ArrayList<>();
                String[] pairs = scan.nextLine().split(" ");
                for (int j = 0; j < pairs.length; j++) {
                    listOfPairs.add(Integer.parseInt(pairs[j]));
                }
                indexList.add(listOfPairs);

            }
            System.out.println(indexList);
            try {


            }catch (Exception e){
                System.out.println();
            }

    }

}
