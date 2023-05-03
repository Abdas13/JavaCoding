package leetCode.binary;

public class SearchInRotatedArray {
    public static int searchInRotated(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int mid=(left+ right)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[left]<=nums[mid]){
                if (nums[left]<=target && target<nums[mid])
                    right=mid-1;
                else
                    left=mid+1;
            }else {  // mid to right sorted
                if(nums[mid]<target && target<=nums[right])
                    left=mid+1;
                else
                    right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums= {5,6,7,8,9,0,1,2,3,4};
        System.out.println(searchInRotated(nums, 7));
        System.out.println(searchInRotated(nums, 5));
        System.out.println(searchInRotated(nums, 4));
        System.out.println(searchInRotated(nums, 13));

    }
}
