package practice;

public class PostIncrement {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i < 10; i++) {
             j = j++;
        }
        System.out.println(j);
    }
}
