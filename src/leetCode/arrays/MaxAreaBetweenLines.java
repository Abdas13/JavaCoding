package leetCode.arrays;

public class MaxAreaBetweenLines {
    public static void main(String[] args) {
        int[] heights = {1,8,2,6,5,4,8,3,7};
        System.out.println(maxArea(heights));
    }
    public static int maxArea(int[] heights){
        int left = 0;
        int right = heights.length-1;
        int ans = 0;
        while (left<right){
            ans = Math.max(Math.min(heights[left], heights[right]) * (right-left), ans);
            if(heights[left]<=heights[right])
                left++;
            else
                right--;
        }
        System.out.println();
        return ans;
    }
}
