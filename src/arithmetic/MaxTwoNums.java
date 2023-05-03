package arithmetic;

public class MaxTwoNums {
    public static void main(String[] args) {
        int[] arr={2,5,7,13,23,45,35,63};
        int firstMax=0;
        int secondMax=0;
        for (int i:arr) {
            if(i>firstMax){
                secondMax=firstMax;
                firstMax=i;
            }
        }
        System.out.println(firstMax);
        System.out.println(secondMax);
    }
}
