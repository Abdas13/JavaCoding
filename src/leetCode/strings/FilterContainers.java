package leetCode.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterContainers {

    public static void main(String[] args) {

        List<Integer> start_index=new ArrayList<>();
        List<Integer> end_index=new ArrayList<>();
        start_index.add(1);
        start_index.add(2);
        end_index.add(6);
        end_index.add(5);

        String str = "|*|**|*";

        String str2 = "|*|*|*|*";

        System.out.println(numOfItems(str, start_index, end_index));
        System.out.println(numOfItems(str2, start_index, end_index));

        // *=42; |=124;
    }
    public static List<Integer> numOfItems(String s, List<Integer> start_index, List<Integer>end_index){
        List<Integer> numberOfItems = new ArrayList<>();

        for (int i = 0; i < start_index.size() ; i++) {
            String subStr = s.substring(start_index.get(i) - 1, end_index.get(i));
            System.out.println(subStr);
            int count = 0;
            for (int j = subStr.indexOf('|'); j < subStr.lastIndexOf('|') + 1; j++) {
                if (subStr.charAt(j) == '*') {
                    count++;
                }
            }
            numberOfItems.add(count);
        }
        return numberOfItems;
    }
}
