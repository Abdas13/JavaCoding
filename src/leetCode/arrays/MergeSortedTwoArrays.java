package leetCode.arrays;

import java.util.Arrays;

public class MergeSortedTwoArrays {
    public static void main(String[] args) {

        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,4,5};

        merge(nums1, 3, nums2, 3);

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int index1=m-1;
        int index2=n-1;
        int mergedIndex=m+n-1;

        while (index2>=0){
            if(index1>=0 && nums1[index1]>nums2[index2]){
                nums1[mergedIndex--]=nums1[index1--];
            }else{
                nums1[mergedIndex--]=nums2[index2--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
