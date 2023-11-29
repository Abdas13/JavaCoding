package leetCode.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombineTwoListsSorted {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 20};
        int[] arr2 = {3, 5, 6};
        System.out.println(combineSortedArrays(arr1,arr2));
        List<Integer> list1 = List.of(1, 4, 7, 20);
        List<Integer> list2 = List.of(3, 5, 6);
        System.out.println(combineLists(list1, list2));
    }

    public static List<Integer> combineLists(List<Integer> list1, List<Integer> list2) {
        int i = 0;
        int j = 0;
        List<Integer> ans = new ArrayList<>();
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                ans.add(list1.get(i));
                i++;
            } else {
                ans.add(list2.get(j));
                j++;
            }
        }
        while (i < list1.size()) {
            ans.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            ans.add(list2.get(j));
            j++;
        }
        return ans;
    }

    public static List<Integer> combineSortedArrays(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        List<Integer> ans = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans.add(arr1[i]);
                i++;
            } else {
                ans.add(arr2[j]);
                j++;
            }
        }
        while (i < arr1.length) {
            ans.add(arr1[i]);
            i++;
        }
        while (j < arr2.length) {
            ans.add(arr2[j]);
        }
        return ans;
    }
}
