package collections;

public class Interview1 {
    public static void main(String[] args) {

        int[] numbers = {3, 5, 10, 4, 6,7};

        int sumNum = 10;

        for (int i = 0; i < numbers.length; i++) {
            for (int j=i+1; j<numbers.length;j++){
                if(numbers[i]+numbers[j]==sumNum){
                    System.out.println("true");
                    System.out.println("("+numbers[i]+", "+numbers[j]+")");
//                }else {
//                    System.out.println("false");
                }
            }
        }
    }
}
