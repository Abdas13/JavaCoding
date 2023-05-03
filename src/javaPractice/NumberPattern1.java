package javaPractice;

public class NumberPattern1 {
    public static void main(String[] args) {
        int a;
        for (int i = 1; i < 6; i++) {
            a=i;
            for (int j = 1; j <=i ; j++)
                System.out.print(a++);
            a=a-2;
            for (int k = 1; k < i; k++)
                System.out.print(a--);
                System.out.println();
        }
    }

}
