package arithmetic;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array={2,5,7,11,14,17,34,56};
        int index=binarySearch(array,17);
        System.out.println(index);
    }

    private static int binarySearch(int[] array, int num) {
        int left=0;
        int right=array.length-1;
        int middle=(left+right)/2;

        while(left<=right){
            if(array[middle]<num){
                left=middle+1;
            }else if(array[middle]==num){
                return middle;
            }else if(array[middle]>num){
                right=middle-1;
            }
            middle=(left+right)/2;
        }
        return  -1;
    }
}
